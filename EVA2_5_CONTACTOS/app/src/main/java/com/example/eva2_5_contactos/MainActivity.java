package com.example.eva2_5_contactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Intent vCont;
    Button btnsh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsh = findViewById(R.id.bttnmostrt);
    }
    public void onClick(View v){

        String data = "content://contacts/people/";

        Intent vCont = new Intent(Intent.ACTION_VIEW,(Uri.parse(data)));
        startActivity(vCont);
    }
}
