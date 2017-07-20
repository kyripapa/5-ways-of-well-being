package com.example.a5ways;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Calendar;
import java.util.List;

public class Learning_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_3);

        final Button button = (Button) findViewById(R.id.save);

        DatabaseHandler db = new DatabaseHandler(Learning_3.this);
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
        if(preferences.contains("checkedResearch") && preferences.getBoolean("checkedResearch",false) == true) {
            morning.setChecked(true);
            System.out.println("Checked");
        }
        if(preferences.contains("checkedResearch2") && preferences.getBoolean("checkedResearch2",false) == true) {
            noon.setChecked(true);
            System.out.println("Checked");
        }
        if(preferences.contains("checkedResearch3") && preferences.getBoolean("checkedResearch3",false) == true) {
            night.setChecked(true);
            System.out.println("Checked");
        }
        if(preferences.contains("checkedResearch4") && preferences.getBoolean("checkedResearch4",false) == true) {
            once.setChecked(true);
            System.out.println("Checked Once");
        }
        if(preferences.contains("checkedResearch5") && preferences.getBoolean("checkedResearch5",false) == true) {
            twice.setChecked(true);
            System.out.println("Checked");
        }
        if(preferences.contains("checkedResearch6") && preferences.getBoolean("checkedResearch6",false) == true) {
            week.setChecked(true);
            System.out.println("Checked");
        }

        for (Choices cn : choices) {
            if((cn.getType().equals("Research")) && (cn.getChosen().equals("true") )) {
                active.setChecked(true);
                System.out.println("Is checkedResearch" + active);
            }
            else if ((cn.getType().equals("Research")) && (cn.getChosen().equals("false") )){
                editor.putBoolean("checkedResearch", false);
                editor.putBoolean("checkedResearch2", false);
                editor.putBoolean("checkedResearch3", false);
                editor.putBoolean("checkedResearch4", false);
                editor.putBoolean("checkedResearch5", false);
                editor.putBoolean("checkedResearch6", false);
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

                ToggleButton active = (ToggleButton) findViewById(R.id.active);

                if(active.isChecked() == true) {
//                    SAVE IT IN DB
                    active.setChecked(true);

                    DatabaseHandler db = new DatabaseHandler(Learning_3.this);
                    List<Choices> choices = db.getAllContacts();

                    for (Choices cn : choices) {
                        String log = "Id: "+cn.getID()+" ,Date: " + cn.getDate() + " ,Category: " +
                                cn.getCategory() + " ,Type: " + cn.getType() + " ,Active: " + cn.getChosen();
                        // Writing Contacts to log
                        Log.d("Name: ", log);
                        if((cn.getType().equals("Research")) && (cn.getChosen().equals("false") )) {
                            // New value for one column

                            cn.setChosen("true");
                            db.updateContact(cn);
                        }
                             /*IF IT IS ACTIVE THEN UPDATE THE REST*/
                        if(morning.isChecked() == true) {
                            cn.setTime("morning");
                            editor.putBoolean("checkedResearch", true);
                            editor.putBoolean("checkedResearch2", false);
                            editor.putBoolean("checkedResearch3", false);
                            editor.apply();
                            db.updateContact(cn);
                        }
                        else if(noon.isChecked() == true) {
                            cn.setTime("noon");
                            editor.putBoolean("checkedResearch2", true);
                            editor.putBoolean("checkedResearch", false);
                            editor.putBoolean("checkedResearch3", false);
                            editor.apply();
                            db.updateContact(cn);
                        }
                        else {
                            cn.setTime("night");
                            editor.putBoolean("checkedResearch3", true);
                            editor.putBoolean("checkedResearch", false);
                            editor.putBoolean("checkedResearch2", false);
                            editor.apply();
                            db.updateContact(cn);
                        }


                        if(once.isChecked() == true) {
                            cn.setFrequency("once");
                            editor.putBoolean("checkedResearch4", true);
                            editor.putBoolean("checkedResearch5", false);
                            editor.putBoolean("checkedResearch6", false);
                            editor.apply();
                            db.updateContact(cn);
                        }
                        else if(twice.isChecked() == true) {
                            cn.setFrequency("twice");
                            editor.putBoolean("checkedResearch5", true);
                            editor.putBoolean("checkedResearch6", false);
                            editor.putBoolean("checkedResearch4", false);
                            editor.apply();
                            db.updateContact(cn);
                        }
                        else {
                            cn.setFrequency("week");
                            editor.putBoolean("checkedResearch6", true);
                            editor.putBoolean("checkedResearch4", false);
                            editor.putBoolean("checkedResearch5", false);
                            editor.apply();
                            db.updateContact(cn);
                        }

                    }
                    callNotification();
                }
                else {
                    active.setChecked(false);
                    DatabaseHandler db = new DatabaseHandler(Learning_3.this);
                    List<Choices> choices = db.getAllContacts();
                    for (Choices cn : choices) {
                        String log = "Id: "+cn.getID()+" ,Date: " + cn.getDate() + " ,Category: " +
                                cn.getCategory() + " ,Type: " + cn.getType() + " ,Active: " + cn.getChosen();
                        // Writing Contacts to log
                        Log.d("Name: ", log);
                        if((cn.getType().equals("Research")) && (cn.getChosen().equals("true") )) {
                            // New value for one column

                            cn.setChosen("false");
                            db.updateContact(cn);
                            db.close();

                            System.out.println("Changed" + db.updateContact(cn));
                            System.out.println("Changed" + cn.getChosen());
                            editor.putBoolean("checkedResearch", false);
                            editor.putBoolean("checkedResearch2", false);
                            editor.putBoolean("checkedResearch3", false);
                            editor.putBoolean("checkedResearch4", false);
                            editor.putBoolean("checkedResearch5", false);
                            editor.putBoolean("checkedResearch6", false);
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

        DatabaseHandler db = new DatabaseHandler(Learning_3.this);
        List<Choices> choices = db.getAllContacts();

        for (Choices cn : choices) {
            String log = "Id: " + cn.getID() + " ,Date: " + cn.getDate() + " ,Category: " +
                    cn.getCategory() + " ,Type: " + cn.getType() + " ,Active: " + cn.getChosen();
            // Writing Contacts to log
            Log.d("Name: ", log);
            if ((cn.getType().equals("Research")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("morning")) && (cn.getFrequency().equals("once"))) {
                System.out.println("once");
                Calendar calendar = Calendar.getInstance();

                calendar.set(Calendar.HOUR_OF_DAY, 11); // For 1 PM or 2 PM
                calendar.set(Calendar.MINUTE, 02);
                calendar.set(Calendar.SECOND, 33);
                System.out.println("call:" + calendar);

                // Test if the times are in the past, if they are add one day
                Calendar now = Calendar.getInstance();
                if(now.after(calendar))
                {calendar.add(Calendar.HOUR_OF_DAY, 24);}


                Intent intent = new Intent(Learning_3.this, Receiver.class);
                intent.putExtra("Social", "Research");
                PendingIntent pendingIntent = PendingIntent.getBroadcast(Learning_3.this, 91, intent, 0);
                AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
                am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                        AlarmManager.INTERVAL_DAY, pendingIntent);



            }
            else  if ((cn.getType().equals("Research")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("morning")) && (cn.getFrequency().equals("twice"))) {
                Calendar cal1 = Calendar.getInstance();
                cal1.set(Calendar.HOUR_OF_DAY, 10); //midday
                cal1.set(Calendar.MINUTE, 34);
                cal1.set(Calendar.SECOND, 00);

                Calendar cal2 = Calendar.getInstance();
                cal2.set(Calendar.HOUR_OF_DAY, 11);//8pm for example
                cal2.set(Calendar.MINUTE, 37);
                cal2.set(Calendar.SECOND, 29);
                System.out.println("call: twice");

                // Test if the times are in the past, if they are add one day
                Calendar now = Calendar.getInstance();
                if(now.after(cal1))
                    cal1.add(Calendar.HOUR_OF_DAY, 24);
                if(now.after(cal2))
                    cal2.add(Calendar.HOUR_OF_DAY, 24);

                Intent intent = new Intent(Learning_3.this, Receiver.class);
                intent.putExtra("Social", "Research");
                PendingIntent morningAlarm = PendingIntent.getBroadcast(Learning_3.this, 91, intent, 0);
                PendingIntent eveningAlarm = PendingIntent.getBroadcast(Learning_3.this, 90, intent, 0);

                // Start both alarms, set to repeat once every day
                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal1.getTimeInMillis(), DateUtils.DAY_IN_MILLIS, morningAlarm);
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal2.getTimeInMillis(), DateUtils.DAY_IN_MILLIS, eveningAlarm);

            }
            else  if ((cn.getType().equals("Research")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("morning")) && (cn.getFrequency().equals("week"))) {
                System.out.println("week");
                Calendar calendar = Calendar.getInstance();

                calendar.set(Calendar.HOUR_OF_DAY, 10); // For 1 PM or 2 PM
                calendar.set(Calendar.MINUTE, 23);
                calendar.set(Calendar.SECOND, 60);
                System.out.println("call:" + calendar);
                Intent intent = new Intent(Learning_3.this, Receiver.class);
                intent.putExtra("Social", "Research");
                PendingIntent pendingIntent = PendingIntent.getBroadcast(Learning_3.this, 91, intent, 0);
                AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
                /*am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                        AlarmManager.INTERVAL_DAY, pendingIntent);*/
                am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),am.INTERVAL_DAY * 7,pendingIntent);

            }
            else  if ((cn.getType().equals("Research")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("noon")) && (cn.getFrequency().equals("once"))) {
                System.out.println("once - noon");
                Calendar calendar = Calendar.getInstance();

                calendar.set(Calendar.HOUR_OF_DAY, 18); // For 1 PM or 2 PM
                calendar.set(Calendar.MINUTE, 45);
                calendar.set(Calendar.SECOND, 10);
                System.out.println("call:" + calendar);
                Intent intent = new Intent(Learning_3.this, Receiver.class);
                intent.putExtra("Social", "Research");
                PendingIntent pendingIntent = PendingIntent.getBroadcast(Learning_3.this, 91, intent, 0);
                AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
                am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                        AlarmManager.INTERVAL_DAY, pendingIntent);
            }
            else  if ((cn.getType().equals("Research")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("noon")) && (cn.getFrequency().equals("twice"))) {
                Calendar cal1 = Calendar.getInstance();
                cal1.set(Calendar.HOUR_OF_DAY, 17); //midday
                cal1.set(Calendar.MINUTE, 45);
                cal1.set(Calendar.SECOND, 00);

                Calendar cal2 = Calendar.getInstance();
                cal2.set(Calendar.HOUR_OF_DAY, 19);//8pm for example
                cal2.set(Calendar.MINUTE, 23);
                cal2.set(Calendar.SECOND, 00);
                System.out.println("call: twice");
                // Test if the times are in the past, if they are add one day
                Calendar now = Calendar.getInstance();
                if(now.after(cal1))
                    cal1.add(Calendar.HOUR_OF_DAY, 24);
                if(now.after(cal2))
                    cal2.add(Calendar.HOUR_OF_DAY, 24);

                Intent intent = new Intent(Learning_3.this, Receiver.class);
                intent.putExtra("Social", "Research");
                PendingIntent morningAlarm = PendingIntent.getBroadcast(Learning_3.this, 91, intent, 0);
                PendingIntent eveningAlarm = PendingIntent.getBroadcast(Learning_3.this, 90, intent, 0);

                // Start both alarms, set to repeat once every day
                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal1.getTimeInMillis(), DateUtils.DAY_IN_MILLIS, morningAlarm);
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal2.getTimeInMillis(), DateUtils.DAY_IN_MILLIS, eveningAlarm);
            }
            else  if ((cn.getType().equals("Research")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("noon")) && (cn.getFrequency().equals("week"))) {
                System.out.println("week");
                Calendar calendar = Calendar.getInstance();

                calendar.set(Calendar.HOUR_OF_DAY, 18); // For 1 PM or 2 PM
                calendar.set(Calendar.MINUTE, 23);
                calendar.set(Calendar.SECOND, 10);
                System.out.println("call:" + calendar);
                Intent intent = new Intent(Learning_3.this, Receiver.class);
                intent.putExtra("Social", "Research");
                PendingIntent pendingIntent = PendingIntent.getBroadcast(Learning_3.this, 6, intent, 0);
                AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
                /*am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                        AlarmManager.INTERVAL_DAY, pendingIntent);*/
                am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),am.INTERVAL_DAY * 7,pendingIntent);
            }
            else  if ((cn.getType().equals("Research")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("night")) && (cn.getFrequency().equals("once"))) {
                System.out.println("once - night");
                Calendar calendar = Calendar.getInstance();

                calendar.set(Calendar.HOUR_OF_DAY, 21); // For 1 PM or 2 PM
                calendar.set(Calendar.MINUTE, 12);
                calendar.set(Calendar.SECOND, 10);
                System.out.println("call:" + calendar);
                Intent intent = new Intent(Learning_3.this, Receiver.class);
                intent.putExtra("Social", "Research");
                PendingIntent pendingIntent = PendingIntent.getBroadcast(Learning_3.this, 91, intent, 0);
                AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
                am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                        AlarmManager.INTERVAL_DAY, pendingIntent);
            }
            else  if ((cn.getType().equals("Research")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("night")) && (cn.getFrequency().equals("twice"))) {
                Calendar cal1 = Calendar.getInstance();
                cal1.set(Calendar.HOUR_OF_DAY, 20); //midday
                cal1.set(Calendar.MINUTE, 23);
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

                Intent intent = new Intent(Learning_3.this, Receiver.class);
                intent.putExtra("Social", "Research");
                PendingIntent morningAlarm = PendingIntent.getBroadcast(Learning_3.this, 91, intent, 0);
                PendingIntent eveningAlarm = PendingIntent.getBroadcast(Learning_3.this, 90, intent, 0);

                // Start both alarms, set to repeat once every day
                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal1.getTimeInMillis(), DateUtils.DAY_IN_MILLIS, morningAlarm);
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal2.getTimeInMillis(), DateUtils.DAY_IN_MILLIS, eveningAlarm);
            }
            else  if ((cn.getType().equals("Research")) && (cn.getChosen().equals("true")) && (cn.getTime().equals("night")) && (cn.getFrequency().equals("week"))) {
                System.out.println("week");
                Calendar calendar = Calendar.getInstance();

                calendar.set(Calendar.HOUR_OF_DAY, 22); // For 1 PM or 2 PM
                calendar.set(Calendar.MINUTE, 23);
                calendar.set(Calendar.SECOND, 10);
                System.out.println("call:" + calendar);
                Intent intent = new Intent(Learning_3.this, Receiver.class);
                intent.putExtra("Social", "Research");
                PendingIntent pendingIntent = PendingIntent.getBroadcast(Learning_3.this, 91, intent, 0);
                AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
                /*am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                        AlarmManager.INTERVAL_DAY, pendingIntent);*/
                am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),am.INTERVAL_DAY * 7,pendingIntent);
            }
        }
    }
}

