package com.example.android.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;
import android.widget.EditText;
import android.widget.TextView;


public class HomeActivity extends AppCompatActivity{

    Button Audio, Map, rate,siren;
    Integer i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Map = findViewById(R.id.Map);
        Audio = findViewById(R.id.Audio);
        rate = findViewById(R.id.rate);
        siren = findViewById(R.id.siren);
        Audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
        Map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAct();
            }
        });
        siren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openN();
            }
        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(HomeActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    public void openActivity(){
        Intent i=getPackageManager().getLaunchIntentForPackage("com.example.track");
        startActivity(i);
    }

    public void openAct(){
        Intent j=getPackageManager().getLaunchIntentForPackage("com.example.retrieve");
        startActivity(j);
    }
    public void openN(){
        Intent k = new Intent(HomeActivity.this, siren.class);
        startActivity(k);
    }

    }
