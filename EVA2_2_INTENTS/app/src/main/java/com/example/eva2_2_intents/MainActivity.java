package com.example.eva2_2_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Intent inTel;
    EditText edtxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtxt = findViewById(R.id.edtxtNumero);

    }
    public void onClick(View v){
        String cade = "tel:"+ edtxt.getText().toString();

        if (v.getId()== R.id.bttnDial){
            //ACCION_DATOS
            inTel = new Intent(Intent.ACTION_DIAL, Uri.parse(cade));
            startActivity(inTel);

        }else {
            inTel = new Intent(Intent.ACTION_CALL, Uri.parse(cade));
            startActivity(inTel);

        }

    }
}
