package com.example.studente.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    protected void onStart () {
        super.onStart();
    }

    @Override
    protected void onStop () {

    super.onStop();
    }

    @Override
    protected void onRestart () {

    super.onRestart();
    }

    @Override
    protected void onPause () {

    super.onPause();
    }

    @Override
    protected void onDestroy () {

    super.onDestroy();
    }

   @Override
    public void onClick(View v) {
        if(v.getId()==button.getId()) {
            Intent i = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(i);
        }
    }
}