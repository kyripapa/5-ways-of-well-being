package com.example.a5ways;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Calendar;
import java.util.List;

public class Social_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_4);

        final Button button = (Button) findViewById(R.id.save);

        DatabaseHandler db = new DatabaseHandler(Social_4.this);
        List<Choices> choices = db.getAllContacts();
        ToggleButton active = (ToggleButton) findViewById(R.id.active);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = preferences.edit();
        RadioButton morning = (RadioButton) findViewById(R.id.morning);
        RadioButton noon = (RadioButton) findViewById(R.id.noon);
        RadioButton night = (RadioButton) findViewById(R.id.night);
        RadioButton once = (RadioButton) findViewById(R.id.onetime);
        RadioButton twice = (RadioButton) findViewById(R.id.twotime);
        RadioButton week = (RadioButton) findViewById(R.id.oneweek);
        if(preferences.contains("checkedDiner") && preferences.getBoolean("checkedDiner",false) == true) {
            morning.setChecked(true);
            System.out.println("Checked");
        }
        if(preferences.contains("checkedDiner2") && preferences.getBoolean("checkedDiner2",false) == true) {
            noon.setChecked(true);
            System.out.println("Checked");
        }
        if(preferences.contains("checkedDiner3") && preferences.getBoolean("checkedDiner3",false) == true) {
            night.setChecked(true);
            System.out.println("Checked");
        }
        if(preferences.contains("checkedDiner4") && preferences.getBoolean("checkedDiner4",false) == true) {
            once.setChecked(true);
            System.out.println("Checked Once");
        }
        if(preferences.contains("checkedDiner5") && preferences.getBoolean("checkedDiner5",false) == true) {
            twice.setChecked(true);
            System.out.println("Checked");
        }
        if(preferences.contains("checkedDiner6") && preferences.getBoolean("checkedDiner6",false) == true) {
            week.setChecked(true);
            System.out.println("Checked");
        }



        for (Choices cn : choices) {
            if((cn.getType().equals("Diner")) && (cn.getChosen().equals("true") )) {
                active.setChecked(true);
                System.out.println("Is checkedDiner" + active);
            }
            else if ((cn.getType().equals("Diner")) && (cn.getChosen().equals("false") )){
                editor.putBoolean("checkedDiner", false);
                editor.putBoolean("checkedDiner2", false);
                editor.putBoolean("checkedDiner3", false);
                editor.putBoolean("checkedDiner4", false);
                editor.putBoolean("checkedDiner5", false);
                editor.putBoolean("checkedDiner6", false);
                editor.apply();
            }
        }


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String chosen;
                RadioButton morning = (RadioButton) findViewById(R.id.morning);
                RadioButton noon = (RadioButton) findViewById(R.id.noon);
                RadioButton night = (RadioButton) findViewById(R.id.night);
                RadioButton once = (RadioButton) findViewById(R.id.onetime);
                RadioButton twice = (RadioButton) findViewById(R.id.twotime);
                RadioButton week = (RadioButton) findViewById(R.id.oneweek);

                Log.d("Name: ", "Clicked");



                ToggleButton active = (ToggleButton) findViewById(R.id.active);
                if(active.isChecked() == true) {
//                    SAVE IT IN DB
                    chosen = "true";
                    active.setChecked(true);

                    // Inserting Contacts
                    Log.d("Insert: ", "Inserting ..");


                    // Reading all contacts
                    Log.d("Reading: ", "Reading all contacts..");
                    DatabaseHandler db = new DatabaseHandler(Social_4.this);
                    List<Choices> choices = db.getAllContacts();

                    for (Choices cn : choices) {
                        String log = "Id: "+cn.getID()+" ,Date: " + cn.getDate() + " ,Category: " +
                                cn.getCategory() + " ,Type: " + cn.getType() + " ,Active: " + cn.getChosen();
                        // Writing Contacts to log
                        Log.d("Name: ", log);
                        if((cn.getType().equals("Diner")) && (cn.getChosen().equals("false") )) {
                            // New value for one column

                            cn.setChosen("true");
                            db.updateContact(cn);

                        }
                              /*IF IT IS ACTIVE THEN UPDATE THE REST*/
                        if(morning.isChecked() == true) {
                            cn.setTime("morning");
                            editor.putBoolean("checkedDiner", true);
                            editor.putBoolean("checkedDiner2", false);
                            editor.putBoolean("checkedDiner3", false);
                            editor.apply();
                            db.updateContact(cn);
                        }
                        else if(noon.isChecked() == true) {
                            cn.setTime("noon");
                            editor.putBoolean("checkedDiner2", true);
                            editor.putBoolean("checkedDiner", false);
                            editor.putBoolean("checkedDiner3", false);
                            editor.apply();
                            db.updateContact(cn);
                        }
                        else {
                            cn.setTime("night");
                            editor.putBoolean("checkedDiner3", true);
                            editor.putBoolean("checkedDiner", false);
                            editor.putBoolean("checkedDiner2", false);
                            editor.apply();
                            db.updateContact(cn);
                        }


                        if(once.isChecked() == true) {
                            cn.setFrequency("once");
                            editor.putBoolean("checkedDiner4", true);
                            editor.putBoolean("checkedDiner5", false);
                            editor.putBoolean("checkedDiner6", false);
                            editor.apply();
                            db.updateContact(cn);
                        }
                        else if(twice.isChecked() == true) {
                            cn.setFrequency("twice");
                            editor.putBoolean("checkedDiner5", true);
                            editor.putBoolean("checkedDiner6", false);
                            editor.putBoolean("checkedDiner4", false);
                            editor.apply();
                            db.updateContact(cn);
                        }
                        else {
                            cn.setFrequency("week");
                            editor.putBoolean("checkedDiner6", true);
                            editor.putBoolean("checkedDiner4", false);
                            editor.putBoolean("checkedDiner5", false);
                            editor.apply();
                            db.updateContact(cn);
                        }

                    }
                    callNotification();
                }
                else {
                    active.setChecked(false);
                    DatabaseHandler db = new DatabaseHandler(Social_4.this);
                    List<Choices> choices = db.getAllContacts();
                    for (Choices cn : choices) {
                        String log = "Id: "+cn.getID()+" ,Date: " + cn.getDate() + " ,Category: " +
                                cn.getCategory() + " ,Type: " + cn.getType() + " ,Active: " + cn.getChosen();
                        // Writing Contacts to log
                        Log.d("Name: ", log);
                        if((cn.getType().equals("Call")) && (cn.getChosen().equals("true") )) {
                            // New value for one column

                            cn.setChosen("false");
                            db.updateContact(cn);
                            db.close();

                            System.out.println("Changed" + db.updateContact(cn));
                            System.out.println("Changed" + cn.getChosen());
                            editor.putBoolean("checkedDiner", false);
                            editor.putBoolean("checkedDiner2", false);
                            editor.putBoolean("checkedDiner3", false);
                            editor.putBoolean("checkedDiner4", false);
                            editor.putBoolean("checkedDiner5", false);
                            editor.putBoolean("checkedDiner6", false);
                            editor.apply();
                        }

                    }
                }
                Context context = getApplicationContext();
                CharSequence text = "Η επιλογή αποθηκεύτηκε!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();



            }
        });
    }
    public void callNotification() {

        DatabaseHandler db = new DatabaseHandler(Social_4.this);
        List<Choices> choices = db.getAllContacts();

        for (Choices cn : choices) {
            String log = "Id: " + cn.getID() + " ,Date: " + cn.getDate() + " ,Category: " +
                    cn.getCategory() + " ,Type: " + cn.getType() + " ,Active: " + cn.getChosen();
            // Writing Contacts to log
            Log.d("Name: ", log);
            if ((cn.getType().equals("Diner")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("morning")) && (cn.getFrequency().equals("once"))) {
                System.out.println("once");
                Calendar calendar = Calendar.getInstance();

                calendar.set(Calendar.HOUR_OF_DAY, 19); // For 1 PM or 2 PM
                calendar.set(Calendar.MINUTE, 35);
                calendar.set(Calendar.SECOND, 60);
                System.out.println("call:" + calendar);

                // Test if the times are in the past, if they are add one day
                Calendar now = Calendar.getInstance();
                if(now.after(calendar))
                {calendar.add(Calendar.HOUR_OF_DAY, 24);}


                Intent intent = new Intent(Social_4.this, Receiver.class);
                intent.putExtra("Social", "Diner");
                PendingIntent pendingIntent = PendingIntent.getBroadcast(Social_4.this, 26, intent, 0);
                AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
                am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                        AlarmManager.INTERVAL_DAY, pendingIntent);



            }
            else  if ((cn.getType().equals("Diner")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("morning")) && (cn.getFrequency().equals("twice"))) {
                Calendar cal1 = Calendar.getInstance();
                cal1.set(Calendar.HOUR_OF_DAY, 10); //midday
                cal1.set(Calendar.MINUTE, 25);
                cal1.set(Calendar.SECOND, 00);

                Calendar cal2 = Calendar.getInstance();
                cal2.set(Calendar.HOUR_OF_DAY, 11);//8pm for example
                cal2.set(Calendar.MINUTE, 20);
                cal2.set(Calendar.SECOND, 29);
                System.out.println("call: twice");

                // Test if the times are in the past, if they are add one day
                Calendar now = Calendar.getInstance();
                if(now.after(cal1))
                    cal1.add(Calendar.HOUR_OF_DAY, 24);
                if(now.after(cal2))
                    cal2.add(Calendar.HOUR_OF_DAY, 24);

                Intent intent = new Intent(Social_4.this, Receiver.class);
                intent.putExtra("Social", "Diner");
                PendingIntent morningAlarm = PendingIntent.getBroadcast(Social_4.this, 27, intent, 0);
                PendingIntent eveningAlarm = PendingIntent.getBroadcast(Social_4.this, 28, intent, 0);

                // Start both alarms, set to repeat once every day
                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal1.getTimeInMillis(), DateUtils.DAY_IN_MILLIS, morningAlarm);
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal2.getTimeInMillis(), DateUtils.DAY_IN_MILLIS, eveningAlarm);

            }
            else  if ((cn.getType().equals("Diner")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("morning")) && (cn.getFrequency().equals("week"))) {
                System.out.println("week");
                Calendar calendar = Calendar.getInstance();

                calendar.set(Calendar.HOUR_OF_DAY, 11); // For 1 PM or 2 PM
                calendar.set(Calendar.MINUTE, 00);
                calendar.set(Calendar.SECOND, 20);
                System.out.println("call:" + calendar);
                Intent intent = new Intent(Social_4.this, Receiver.class);
                intent.putExtra("Social", "Diner");
                PendingIntent pendingIntent = PendingIntent.getBroadcast(Social_4.this, 29, intent, 0);
                AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
                /*am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                        AlarmManager.INTERVAL_DAY, pendingIntent);*/
                am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),am.INTERVAL_DAY * 7,pendingIntent);

            }
            else  if ((cn.getType().equals("Diner")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("noon")) && (cn.getFrequency().equals("once"))) {
                System.out.println("once - noon");
                Calendar calendar = Calendar.getInstance();

                calendar.set(Calendar.HOUR_OF_DAY, 18); // For 1 PM or 2 PM
                calendar.set(Calendar.MINUTE, 00);
                calendar.set(Calendar.SECOND, 20);
                System.out.println("call:" + calendar);
                Intent intent = new Intent(Social_4.this, Receiver.class);
                intent.putExtra("Social", "Diner");
                PendingIntent pendingIntent = PendingIntent.getBroadcast(Social_4.this, 30, intent, 0);
                AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
                am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                        AlarmManager.INTERVAL_DAY, pendingIntent);
            }
            else  if ((cn.getType().equals("Diner")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("noon")) && (cn.getFrequency().equals("twice"))) {
                Calendar cal1 = Calendar.getInstance();
                cal1.set(Calendar.HOUR_OF_DAY, 17); //midday
                cal1.set(Calendar.MINUTE, 00);
                cal1.set(Calendar.SECOND, 00);

                Calendar cal2 = Calendar.getInstance();
                cal2.set(Calendar.HOUR_OF_DAY, 19);//8pm for example
                cal2.set(Calendar.MINUTE, 02);
                cal2.set(Calendar.SECOND, 00);
                System.out.println("call: twice");
                // Test if the times are in the past, if they are add one day
                Calendar now = Calendar.getInstance();
                if(now.after(cal1))
                    cal1.add(Calendar.HOUR_OF_DAY, 24);
                if(now.after(cal2))
                    cal2.add(Calendar.HOUR_OF_DAY, 24);

                Intent intent = new Intent(Social_4.this, Receiver.class);
                intent.putExtra("Social", "Diner");
                PendingIntent morningAlarm = PendingIntent.getBroadcast(Social_4.this, 31, intent, 0);
                PendingIntent eveningAlarm = PendingIntent.getBroadcast(Social_4.this, 32, intent, 0);

                // Start both alarms, set to repeat once every day
                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal1.getTimeInMillis(), DateUtils.DAY_IN_MILLIS, morningAlarm);
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal2.getTimeInMillis(), DateUtils.DAY_IN_MILLIS, eveningAlarm);
            }
            else  if ((cn.getType().equals("Diner")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("noon")) && (cn.getFrequency().equals("week"))) {
                System.out.println("week");
                Calendar calendar = Calendar.getInstance();

                calendar.set(Calendar.HOUR_OF_DAY, 18); // For 1 PM or 2 PM
                calendar.set(Calendar.MINUTE, 00);
                calendar.set(Calendar.SECOND, 20);
                System.out.println("call:" + calendar);
                Intent intent = new Intent(Social_4.this, Receiver.class);
                intent.putExtra("Social", "Diner");
                PendingIntent pendingIntent = PendingIntent.getBroadcast(Social_4.this, 33, intent, 0);
                AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
                /*am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                        AlarmManager.INTERVAL_DAY, pendingIntent);*/
                am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),am.INTERVAL_DAY * 7,pendingIntent);
            }
            else  if ((cn.getType().equals("Diner")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("night")) && (cn.getFrequency().equals("once"))) {
                System.out.println("once - night");
                Calendar calendar = Calendar.getInstance();

                calendar.set(Calendar.HOUR_OF_DAY, 21); // For 1 PM or 2 PM
                calendar.set(Calendar.MINUTE, 00);
                calendar.set(Calendar.SECOND, 20);
                System.out.println("call:" + calendar);
                Intent intent = new Intent(Social_4.this, Receiver.class);
                intent.putExtra("Social", "Diner");
                PendingIntent pendingIntent = PendingIntent.getBroadcast(Social_4.this, 34, intent, 0);
                AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
                am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                        AlarmManager.INTERVAL_DAY, pendingIntent);
            }
            else  if ((cn.getType().equals("Diner")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("night")) && (cn.getFrequency().equals("twice"))) {
                Calendar cal1 = Calendar.getInstance();
                cal1.set(Calendar.HOUR_OF_DAY, 20); //midday
                cal1.set(Calendar.MINUTE, 00);
                cal1.set(Calendar.SECOND, 00);

                Calendar cal2 = Calendar.getInstance();
                cal2.set(Calendar.HOUR_OF_DAY, 22);//8pm for example
                cal2.set(Calendar.MINUTE, 02);
                cal2.set(Calendar.SECOND, 00);
                System.out.println("call: twice");
                // Test if the times are in the past, if they are add one day
                Calendar now = Calendar.getInstance();
                if(now.after(cal1))
                    cal1.add(Calendar.HOUR_OF_DAY, 24);
                if(now.after(cal2))
                    cal2.add(Calendar.HOUR_OF_DAY, 24);

                Intent intent = new Intent(Social_4.this, Receiver.class);
                intent.putExtra("Social", "Diner");
                PendingIntent morningAlarm = PendingIntent.getBroadcast(Social_4.this, 35, intent, 0);
                PendingIntent eveningAlarm = PendingIntent.getBroadcast(Social_4.this, 36, intent, 0);

                // Start both alarms, set to repeat once every day
                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal1.getTimeInMillis(), DateUtils.DAY_IN_MILLIS, morningAlarm);
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal2.getTimeInMillis(), DateUtils.DAY_IN_MILLIS, eveningAlarm);
            }
            else  if ((cn.getType().equals("Diner")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("night")) && (cn.getFrequency().equals("week"))) {
                System.out.println("week");
                Calendar calendar = Calendar.getInstance();

                calendar.set(Calendar.HOUR_OF_DAY, 22); // For 1 PM or 2 PM
                calendar.set(Calendar.MINUTE, 00);
                calendar.set(Calendar.SECOND, 20);
                System.out.println("call:" + calendar);
                Intent intent = new Intent(Social_4.this, Receiver.class);
                intent.putExtra("Social", "Diner");
                PendingIntent pendingIntent = PendingIntent.getBroadcast(Social_4.this, 37, intent, 0);
                AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
                /*am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                        AlarmManager.INTERVAL_DAY, pendingIntent);*/
                am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),am.INTERVAL_DAY * 7,pendingIntent);
            }
        }
    }

}
