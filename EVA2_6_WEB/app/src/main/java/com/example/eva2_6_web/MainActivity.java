package com.example.eva2_6_web;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Intent verWeb;
    Button btnver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnver = findViewById(R.id.btnShow);


    }
    public void onClick(View v){
        String url = "http://www.youtube.com";
        verWeb = new Intent(Intent.ACTION_VIEW,(Uri.parse(url)));
        startActivity(verWeb);
    }
}
