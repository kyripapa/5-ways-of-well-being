package com.example.a5ways;

import android.app.AlarmManager;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);
        int i = db.getContactsCount();
        System.out.println("Count" + i);
        if (i == 0) {
            // Inserting Contacts
            Log.d("Insert: ", "Inserting ..");
            db.addChoice(new Choices("2332107","Social","Call","false","once","morning"));
            db.addChoice(new Choices("2332107","Social","Coffee","false","once","morning"));
            db.addChoice(new Choices("2332107","Social","Call family","false","once","morning"));
            db.addChoice(new Choices("2332107","Social","Diner","false","once","morning"));
            db.addChoice(new Choices("2332107","Social","Break","false","once","morning"));

            db.addChoice(new Choices("2332107","Learning","Read","false","once","morning"));
            db.addChoice(new Choices("2332107","Learning","Article","false","once","morning"));
            db.addChoice(new Choices("2332107","Learning","Research","false","once","morning"));
            db.addChoice(new Choices("2332107","Learning","Learn new","false","once","morning"));
            db.addChoice(new Choices("2332107","Learning","Movie","false","once","morning"));

            db.addChoice(new Choices("2332107","Activity","Outdoors","false","once","morning"));
            db.addChoice(new Choices("2332107","Activity","Bike","false","once","morning"));
            db.addChoice(new Choices("2332107","Activity","Run","false","once","morning"));
            db.addChoice(new Choices("2332107","Activity","Stairs","false","once","morning"));
            db.addChoice(new Choices("2332107","Activity","Gym","false","once","morning"));

            db.addChoice(new Choices("2332107","Give","Adopt","false","once","morning"));
            db.addChoice(new Choices("2332107","Give","Kind","false","once","morning"));
            db.addChoice(new Choices("2332107","Give","Advice","false","once","morning"));
            db.addChoice(new Choices("2332107","Give","Give stuff","false","once","morning"));
            db.addChoice(new Choices("2332107","Give","Buy drink","false","once","morning"));

            db.addChoice(new Choices("2332107","Aware","View","false","once","morning"));
            db.addChoice(new Choices("2332107","Aware","Drink Coffee","false","once","morning"));
            db.addChoice(new Choices("2332107","Aware","Odd","false","once","morning"));
            db.addChoice(new Choices("2332107","Aware","Look around","false","once","morning"));
            db.addChoice(new Choices("2332107","Aware","Walk","false","once","morning"));
        }





      /*  // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<Choices> choices = db.getAllContacts();

        for (Choices cn : choices) {
            String log = "Id: "+cn.getID()+" ,Date: " + cn.getDate() + " ,Category: " +
                    cn.getCategory() + " ,Type: " + cn.getType() + " ,Active: " + cn.getChosen() + " ,Frequency" + cn.getFrequency() + " ,Time:" + cn.getTime();
            // Writing Contacts to log
            Log.d("Name: ", log);
        }*/

    }


    public void preferencesPage(View view) {
        Intent intent = new Intent(MainActivity.this, Preferences.class);

        startActivity(intent);
        overridePendingTransition(R.anim.enter, R.anim.exit);

    }
    public void actionsPage(View view) {
        Intent intent = new Intent(MainActivity.this, ActionsPage.class);

        startActivity(intent);
        overridePendingTransition(R.anim.enter, R.anim.exit);

    }
}
