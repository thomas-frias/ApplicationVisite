package com.example.applicationvisite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton buttonForScanQR;
    private ImageButton infobutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonForScanQR = (FloatingActionButton) findViewById(R.id.qrButton);
        infobutton = (ImageButton) findViewById(R.id.infobutton);

        buttonForScanQR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent qrActivity = new Intent(getApplicationContext(),QrActivity.class);
                startActivity(qrActivity);
                finish();
            }
        });

        infobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent infoActivity = new Intent(getApplicationContext(),InfoActivity.class);
                startActivity(infoActivity);
                finish();
            }
        });

    }

}