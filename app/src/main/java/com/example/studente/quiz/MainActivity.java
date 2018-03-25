package com.example.studente.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button_v,button_f;
    TextView tw;
    String[] domande={"La F1 è nata nel 1950?","Hamilton ha vinto 5 volte a Montreal?","Hamilton ha fatto 6 pole a Melbourne?","Ha Micheal Schumacher la maggior percentuale di vittoria in carriera?","E' Fagioli ad essere il pilota più anziano ad aver vinto un GP ?","E' di Ascari il record di miglior percentuale di vittorie in una stagione?","Il record del maggior numero di punti appartiene a Hamilton?","Il record del maggior numero di prime file appartiene a Schumacher?","Il record di maggior numero di GP senza giri in testa appartiene a Hulkenberg?","Schumacher ha realizzato il maggior numero di punti nella sua carriera ?"};
    boolean[] risposte={true,true,false,false,true,true,true,true,true,false};
    int i=0;
    int j=0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_v=findViewById(R.id.button_v);
        button_f=findViewById(R.id.button_f);
        tw=findViewById(R.id.tw);
        button_v.setOnClickListener(this);
        button_f.setOnClickListener(this);
        if(savedInstanceState!=null){
            i=savedInstanceState.getInt("i");
            j=savedInstanceState.getInt("j");
        }tw.setText(domande[i]);
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
    public void onClick(View v){
        if(v.getId()==button_v.getId() && risposte[i] || v.getId()==button_f.getId() && !risposte[i]) j++;
        if(++i==10){
            Intent in = new Intent(MainActivity.this, Main3Activity.class);
            in.putExtra("punteggio",j);
            startActivity(in);
            finish();
        }else tw.setText(domande[i]);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("i",i);
        outState.putInt("j",j);
        super.onSaveInstanceState(outState);
    }
}
