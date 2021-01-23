package com.example.android.logindemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageButton;

public class siren extends AppCompatActivity {
    ImageButton imgButton;
    MediaPlayer ring;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.siren);

        ring = MediaPlayer.create(siren.this, R.raw.ring);
        ring.start();
        imgButton=(ImageButton)findViewById(R.id.imageButton);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openN1(ring);
            }
        });
    }
    public void openN1(MediaPlayer r1){
        Intent intent = new Intent(siren.this, HomeActivity.class);
        r1.stop();
        startActivity(intent);
    }
}
