package com.example.eva2_3_sms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent inSMS;
    Button btn;
    EditText ednum, edmen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ednum = findViewById(R.id.edtxtnum);
        edmen = findViewById(R.id.editmensaje);

        btn = findViewById(R.id.bttnEnviar);
       btn.setOnClickListener(new View.OnClickListener()
       {

           @Override
           public void onClick(View v) {
               String sTel = "smsto" + ednum.getText().toString();
               String sSMS = edmen.getText().toString();

               inSMS = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel) );
               inSMS.putExtra("sms_body",sSMS);
               startActivity(inSMS);

           }
       });

        };
    }
