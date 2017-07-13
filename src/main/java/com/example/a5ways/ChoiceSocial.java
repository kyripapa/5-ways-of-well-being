package com.example.a5ways;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class ChoiceSocial extends AppCompatActivity {
   /* final Context context = this;
    Button button = (Button) findViewById(R.id.social_1);*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_social);


    }
    public void Social_1 (View view) {
        System.out.println("lala");
        Intent intent = new Intent(ChoiceSocial.this, Social_1.class);
        startActivity(intent);
    }
    public void Social_2 (View view) {
        System.out.println("lala");
        Intent intent = new Intent(ChoiceSocial.this, Social_2.class);
        startActivity(intent);
    }
    public void Social_3 (View view) {
        System.out.println("lala");
        Intent intent = new Intent(ChoiceSocial.this, Social_3.class);
        startActivity(intent);
    }
    public void Social_4 (View view) {
        System.out.println("lala");
        Intent intent = new Intent(ChoiceSocial.this, Social_4.class);
        startActivity(intent);
    }
 public void Social_5 (View view) {
        System.out.println("lala");
        Intent intent = new Intent(ChoiceSocial.this, Social_5.class);
        startActivity(intent);
    }




}
