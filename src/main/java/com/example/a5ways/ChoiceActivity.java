package com.example.a5ways;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
    }
    public void Activity_1 (View view) {
        Intent intent = new Intent(ChoiceActivity.this, Activity_1.class);
        startActivity(intent);
    }
    public void Activity_2 (View view) {
        Intent intent = new Intent(ChoiceActivity.this, Activity_2.class);
        startActivity(intent);
    }
    public void Activity_3 (View view) {
        Intent intent = new Intent(ChoiceActivity.this, Activity_3.class);
        startActivity(intent);
    }
    public void Activity_4 (View view) {
        Intent intent = new Intent(ChoiceActivity.this, Activity_4.class);
        startActivity(intent);
    }
    public void Activity_5 (View view) {
        Intent intent = new Intent(ChoiceActivity.this, Activity_5.class);
        startActivity(intent);
    }
}
