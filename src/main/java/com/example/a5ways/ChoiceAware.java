package com.example.a5ways;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ChoiceAware extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_aware);

    }
    public void Aware_1 (View view) {
        System.out.println("lala");
        Intent intent = new Intent(ChoiceAware.this, Aware_1.class);
        startActivity(intent);
    }
    public void Aware_2 (View view) {
        System.out.println("lala");
        Intent intent = new Intent(ChoiceAware.this, Aware_2.class);
        startActivity(intent);
    }
    public void Aware_3 (View view) {
        System.out.println("lala");
        Intent intent = new Intent(ChoiceAware.this, Aware_3.class);
        startActivity(intent);
    }
    public void Aware_4 (View view) {
        System.out.println("lala");
        Intent intent = new Intent(ChoiceAware.this, Aware_4.class);
        startActivity(intent);
    }
    public void Aware_5 (View view) {
        System.out.println("lala");
        Intent intent = new Intent(ChoiceAware.this, Aware_5.class);
        startActivity(intent);
    }

}
