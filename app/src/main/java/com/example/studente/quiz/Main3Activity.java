package com.example.studente.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tw=findViewById(R.id.fine);
        int punt=getIntent().getExtras().getInt("punteggio");
        tw.setText("Hai totalizzato "+punt+" punti!");
        if(punt==0)
        {
            tw.setText("Hai perso");
        }
        if(punt==10)
        {
            tw.setText("");
        }
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
}
