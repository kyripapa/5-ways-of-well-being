package com.example.a5ways;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.List;

public class ActionsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actions_page);

        DatabaseHandler db = new DatabaseHandler(this);
        List<Choices> choices = db.getAllContacts();


        for (Choices cn : choices) {
            String log = "Id: " + cn.getID() + " ,Date: " + cn.getDate() + " ,Category: " +
                    cn.getCategory() + " ,Type: " + cn.getType() + " ,Active: " + cn.getChosen() + " ,Frequency" + cn.getFrequency() + " ,Time:" + cn.getTime();
            // Writing Contacts to log
            Log.d("Name: ", log);
            if (cn.getChosen().equals("true")) {

                if (cn.getType().equals("Call")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.call);
                    cb.setVisibility(View.VISIBLE);

                }
                if (cn.getType().equals("Coffee")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.coffee);
                    cb.setVisibility(View.VISIBLE);

                } if (cn.getType().equals("Call family")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.call_family);
                    cb.setVisibility(View.VISIBLE);

                } if (cn.getType().equals("Diner")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.diner);
                    cb.setVisibility(View.VISIBLE);
                } if (cn.getType().equals("Break")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.make_break);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Outdoors")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.outdoors);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Bike")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.bike);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Run")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.run);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Stairs")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.stairs);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Gym")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.gym);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Read")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.read);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Article")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.article);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Research")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.research);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Learn new")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.learn_new);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Movie")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.movie);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Adopt")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.adopt);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Kind")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.kind);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Advice")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.advice);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Give stuff")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.give_stuff);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Buy drink")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.buy_drink);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("View")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.view);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Drink Coffee")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.drink_coffee);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Odd")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.odd);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Look around")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.look_around);
                    cb.setVisibility(View.VISIBLE);
                }if (cn.getType().equals("Walk")) {
                    CheckBox cb =  (CheckBox) findViewById(R.id.walk);
                    cb.setVisibility(View.VISIBLE);
                }
            }
        }

/*Set preferences for checkboxes*/
       final CheckBox checkBox =  (CheckBox) findViewById(R.id.call);
       final CheckBox checkBox2 =  (CheckBox) findViewById(R.id.coffee);
       final CheckBox checkBox3 =  (CheckBox) findViewById(R.id.call_family);
       final CheckBox checkBox4 =  (CheckBox) findViewById(R.id.diner);
       final CheckBox checkBox5 =  (CheckBox) findViewById(R.id.make_break);
       final CheckBox checkBox6 =  (CheckBox) findViewById(R.id.outdoors);
       final CheckBox checkBox7 =  (CheckBox) findViewById(R.id.bike);
       final CheckBox checkBox8 =  (CheckBox) findViewById(R.id.run);
       final CheckBox checkBox9 =  (CheckBox) findViewById(R.id.stairs);
       final CheckBox checkBox10 =  (CheckBox) findViewById(R.id.gym);
       final CheckBox checkBox11 =  (CheckBox) findViewById(R.id.read);
       final CheckBox checkBox12 =  (CheckBox) findViewById(R.id.article);
       final CheckBox checkBox13 =  (CheckBox) findViewById(R.id.research);
       final CheckBox checkBox14 =  (CheckBox) findViewById(R.id.learn_new);
       final CheckBox checkBox15 =  (CheckBox) findViewById(R.id.movie);
       final CheckBox checkBox16 =  (CheckBox) findViewById(R.id.adopt);
       final CheckBox checkBox17 =  (CheckBox) findViewById(R.id.kind);
       final CheckBox checkBox18 =  (CheckBox) findViewById(R.id.advice);
       final CheckBox checkBox19 =  (CheckBox) findViewById(R.id.give_stuff);
       final CheckBox checkBox20 =  (CheckBox) findViewById(R.id.buy_drink);
       final CheckBox checkBox21 =  (CheckBox) findViewById(R.id.view);
       final CheckBox checkBox22 =  (CheckBox) findViewById(R.id.drink_coffee);
       final CheckBox checkBox23 =  (CheckBox) findViewById(R.id.odd);
       final CheckBox checkBox24 =  (CheckBox) findViewById(R.id.look_around);
       final CheckBox checkBox25 =  (CheckBox) findViewById(R.id.walk);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = preferences.edit();
        Calendar mDate = Calendar.getInstance();
        DateUtils.isToday(mDate.getTimeInMillis());
        System.out.println("Date: " + DateUtils.isToday(mDate.getTimeInMillis()));

        if(preferences.contains("checked") && preferences.getBoolean("checked",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox.setChecked(false);
            System.out.println("No Checked");
        }

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox.isChecked()) {
                    editor.putBoolean("checked", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked", false);
                    editor.apply();
                }
            }
        });
        if(preferences.contains("checked2") && preferences.getBoolean("checked2",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox2.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox2.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox2.isChecked()) {
                    editor.putBoolean("checked2", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked2", false);
                    editor.apply();
                }
            }
        });
 if(preferences.contains("checked3") && preferences.getBoolean("checked3",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox3.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox3.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox3.isChecked()) {
                    editor.putBoolean("checked3", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked3", false);
                    editor.apply();
                }
            }
        });
 if(preferences.contains("checked4") && preferences.getBoolean("checked4",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox4.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox4.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox4.isChecked()) {
                    editor.putBoolean("checked4", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked4", false);
                    editor.apply();
                }
            }
        });
 if(preferences.contains("checked5") && preferences.getBoolean("checked5",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox5.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox5.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox5.isChecked()) {
                    editor.putBoolean("checked5", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked5", false);
                    editor.apply();
                }
            }
        });
/*Set preferences for checkboxes END*/

        if(preferences.contains("checked6") && preferences.getBoolean("checked6",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox6.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox6.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox6.isChecked()) {
                    editor.putBoolean("checked6", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked6", false);
                    editor.apply();
                }
            }
        });
        if(preferences.contains("checked7") && preferences.getBoolean("checked7",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox7.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox7.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox7.isChecked()) {
                    editor.putBoolean("checked7", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked7", false);
                    editor.apply();
                }
            }
        });
if(preferences.contains("checked8") && preferences.getBoolean("checked8",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox8.setChecked(true);
            System.out.println("Checked");
        }else {
    checkBox8.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox8.isChecked()) {
                    editor.putBoolean("checked8", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked8", false);
                    editor.apply();
                }
            }
        });
        if(preferences.contains("checked9") && preferences.getBoolean("checked9",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox9.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox9.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox9.isChecked()) {
                    editor.putBoolean("checked9", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked9", false);
                    editor.apply();
                }
            }
        });
 if(preferences.contains("checked10") && preferences.getBoolean("checked10",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox10.setChecked(true);
            System.out.println("Checked");
        }else {
     checkBox10.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox10.isChecked()) {
                    editor.putBoolean("checked10", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked10", false);
                    editor.apply();
                }
            }
        });
        if(preferences.contains("checked11") && preferences.getBoolean("checked11",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox11.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox11.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox11.isChecked()) {
                    editor.putBoolean("checked11", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked11", false);
                    editor.apply();
                }
            }
        });
        if(preferences.contains("checked12") && preferences.getBoolean("checked12",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox12.setChecked(true);
            System.out.println("Checked");
        }else {
     checkBox12.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox12.isChecked()) {
                    editor.putBoolean("checked12", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked12", false);
                    editor.apply();
                }
            }
        }); 
        if(preferences.contains("checked13") && preferences.getBoolean("checked13",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox13.setChecked(true);
            System.out.println("Checked");
        }else {
     checkBox13.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox13.isChecked()) {
                    editor.putBoolean("checked13", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked13", false);
                    editor.apply();
                }
            }
        }); 
        if(preferences.contains("checked14") && preferences.getBoolean("checked14",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox14.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox14.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox14.isChecked()) {
                    editor.putBoolean("checked14", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked14", false);
                    editor.apply();
                }
            }
        });
        if(preferences.contains("checked15") && preferences.getBoolean("checked15",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox15.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox15.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox15.isChecked()) {
                    editor.putBoolean("checked15", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked15", false);
                    editor.apply();
                }
            }
        }); 
        if(preferences.contains("checked16") && preferences.getBoolean("checked16",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox16.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox16.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox16.isChecked()) {
                    editor.putBoolean("checked16", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked16", false);
                    editor.apply();
                }
            }
        });
 if(preferences.contains("checked17") && preferences.getBoolean("checked17",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox17.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox17.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox17.isChecked()) {
                    editor.putBoolean("checked17", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked17", false);
                    editor.apply();
                }
            }
        });

if(preferences.contains("checked18") && preferences.getBoolean("checked18",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox18.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox18.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox18.isChecked()) {
                    editor.putBoolean("checked18", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked18", false);
                    editor.apply();
                }
            }
        });
        if(preferences.contains("checked19") && preferences.getBoolean("checked19",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox19.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox19.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox19.isChecked()) {
                    editor.putBoolean("checked19", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked19", false);
                    editor.apply();
                }
            }
        }); 
        if(preferences.contains("checked20") && preferences.getBoolean("checked20",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox20.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox20.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox20.isChecked()) {
                    editor.putBoolean("checked20", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked20", false);
                    editor.apply();
                }
            }
        }); 
        if(preferences.contains("checked21") && preferences.getBoolean("checked21",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox21.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox21.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox21.isChecked()) {
                    editor.putBoolean("checked21", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked21", false);
                    editor.apply();
                }
            }
        });
        if(preferences.contains("checked22") && preferences.getBoolean("checked22",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox22.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox22.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox22.isChecked()) {
                    editor.putBoolean("checked22", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked22", false);
                    editor.apply();
                }
            }
        });
        if(preferences.contains("checked23") && preferences.getBoolean("checked23",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox23.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox23.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox23.isChecked()) {
                    editor.putBoolean("checked23", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked23", false);
                    editor.apply();
                }
            }
        });

        if(preferences.contains("checked24") && preferences.getBoolean("checked24",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox24.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox24.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox24.isChecked()) {
                    editor.putBoolean("checked24", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked24", false);
                    editor.apply();
                }
            }
        });
       if(preferences.contains("checked25") && preferences.getBoolean("checked25",false) == true && DateUtils.isToday(mDate.getTimeInMillis())) {
            checkBox25.setChecked(true);
            System.out.println("Checked");
        }else {
            checkBox25.setChecked(false);
            System.out.println("No Checked");

        }
        checkBox25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox25.isChecked()) {
                    editor.putBoolean("checked25", true);
                    editor.apply();
                }else{
                    editor.putBoolean("checked25", false);
                    editor.apply();
                }
            }
        });


    }


}
