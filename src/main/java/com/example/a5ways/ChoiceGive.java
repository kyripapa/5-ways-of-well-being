package com.example.a5ways;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChoiceGive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_give);
    }
    public void Give_1 (View view) {
        Intent intent = new Intent(ChoiceGive.this, Give_1.class);
        startActivity(intent);
    }
    public void Give_2 (View view) {
        Intent intent = new Intent(ChoiceGive.this, Give_2.class);
        startActivity(intent);
    }
    public void Give_3 (View view) {
        Intent intent = new Intent(ChoiceGive.this, Give_3.class);
        startActivity(intent);
    }
    public void Give_4 (View view) {
        Intent intent = new Intent(ChoiceGive.this, Give_4.class);
        startActivity(intent);
    }
    public void Give_5 (View view) {
        Intent intent = new Intent(ChoiceGive.this, Give_5.class);
        startActivity(intent);
    }
}
