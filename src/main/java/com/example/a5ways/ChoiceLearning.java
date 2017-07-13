package com.example.a5ways;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChoiceLearning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_learning);
    }

    public void Learning_1 (View view) {
        Intent intent = new Intent(ChoiceLearning.this, Learning_1.class);
        startActivity(intent);
    }
    public void Learning_2 (View view) {
        Intent intent = new Intent(ChoiceLearning.this, Learning_2.class);
        startActivity(intent);
    }
    public void Learning_3 (View view) {
        Intent intent = new Intent(ChoiceLearning.this, Learning_3.class);
        startActivity(intent);
    }
    public void Learning_4 (View view) {
        Intent intent = new Intent(ChoiceLearning.this, Learning_4.class);
        startActivity(intent);
    }
    public void Learning_5 (View view) {
        Intent intent = new Intent(ChoiceLearning.this, Learning_5.class);
        startActivity(intent);
    }
}
