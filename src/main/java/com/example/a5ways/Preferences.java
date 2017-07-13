package com.example.a5ways;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Preferences extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

    }

    public void choiceSocial (View view) {
        System.out.println("lala");
        Intent intent = new Intent(Preferences.this, ChoiceSocial.class);
        startActivity(intent);
    }
    public void choiceLearning (View view) {
        Intent intent = new Intent(Preferences.this, ChoiceLearning.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter, R.anim.exit);
    }
    public void choiceActivity (View view) {
        Intent intent = new Intent(Preferences.this, ChoiceActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter, R.anim.exit);
    }
    public void choiceGive (View view) {
        Intent intent = new Intent(Preferences.this, ChoiceGive.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter, R.anim.exit);
    }
    public void choiceAware (View view) {
        Intent intent = new Intent(Preferences.this, ChoiceAware.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter, R.anim.exit);
    }
}
