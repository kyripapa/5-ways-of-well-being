package com.example.a5ways;

/**
 * Created by kori on 13/6/2017.
 */

        import java.util.ArrayList;
        import java.util.List;

        import android.content.ContentValues;
        import android.content.Context;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;
        import android.provider.Settings;
        import android.util.Log;

public class DatabaseHandler extends SQLiteOpenHelper {
    private static final String TAG = DatabaseHandler.class.toString();

    static String id;
    private static final int DATABASE_VERSION = 3;
    private static final String DATABASE_NAME = "fiveways";
    private static final String TABLE_CHOICES = "choices";
    private static final String KEY_ID = "id";
    private static final String KEY_DATE = "date";
    private static final String KEY_CATEGORY = "category";
    private static final String KEY_TYPE = "type";
    private static final String KEY_CHOSEN = "chosen";
    private static final String KEY_FREQUENCY = "frequency";
    private static final String KEY_TIME = "time";


    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        //3rd argument to be passed is CursorFactory instance
        context.getApplicationContext();
        id = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CHOICES_TABLE = "CREATE TABLE " + TABLE_CHOICES + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_DATE + " TEXT," + KEY_CATEGORY + " TEXT,"
                + KEY_TYPE + " TEXT," + KEY_CHOSEN + " TEXT," + KEY_FREQUENCY + " TEXT," + KEY_TIME + " TEXT" + ")";
        db.execSQL(CREATE_CHOICES_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CHOICES);
        Log.d("Upgrading: ", "Reading all contacts..");
        // Create tables again
        onCreate(db);
    }

    // code to add the new contact
    void addChoice(Choices choices) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_DATE, choices.getDate()); // Contact Name
        values.put(KEY_CATEGORY, choices.getCategory()); // Contact Phone
        values.put(KEY_TYPE, choices.getType()); // Contact Phone
        values.put(KEY_CHOSEN, choices.getChosen()); // Contact Phone
        values.put(KEY_FREQUENCY, choices.getFrequency()); // Contact Phone
        values.put(KEY_TIME, choices.getTime()); // Contact Phone

        // Inserting Row
        db.insert(TABLE_CHOICES, null, values);
        //2nd argument is String containing nullColumnHack
        db.close(); // Closing database connection
    }

    // code to get the single contact
    Choices getChoices(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_CHOICES, new String[] { KEY_ID,
                        KEY_DATE, KEY_CATEGORY, KEY_TYPE, KEY_CHOSEN, KEY_FREQUENCY, KEY_TIME}, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Choices choices = new Choices(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6));
        // return contact
        return choices;
    }

    // code to get all contacts in a list view
    public List<Choices> getAllContacts() {
        List<Choices> contactList = new ArrayList<Choices>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_CHOICES;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Choices choice = new Choices();
                choice.setID(Integer.parseInt(cursor.getString(0)));
                choice.setDate(cursor.getString(1));
                choice.setCategory(cursor.getString(2));
                choice.setType(cursor.getString(3));
                choice.setChosen(cursor.getString(4));
                choice.setFrequency(cursor.getString(5));
                choice.setTime(cursor.getString(6));
                // Adding contact to list
                contactList.add(choice);
            } while (cursor.moveToNext());
        }

        // return contact list
        return contactList;
    }

    // code to update the single contact
    public int updateContact(Choices choice) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_DATE, choice.getDate());
        values.put(KEY_CATEGORY, choice.getCategory());
        values.put(KEY_TYPE, choice.getType());
        values.put(KEY_CHOSEN, choice.getChosen());
        values.put(KEY_FREQUENCY, choice.getFrequency());
        values.put(KEY_TIME, choice.getTime());

        // updating row
        return db.update("choices", values, KEY_ID + " = ?",
                new String[] { String.valueOf(choice.getID()) });
    }

    // Deleting single contact
    public void deleteContact(Choices contact) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_CHOICES, KEY_ID + " = ?",
                new String[] { String.valueOf(contact.getID()) });
        db.close();
    }

    // Getting contacts Count
    public int getContactsCount() {
        String countQuery = "SELECT  * FROM " + TABLE_CHOICES;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count=cursor.getCount();
        cursor.close();
        return count;
    }

}
