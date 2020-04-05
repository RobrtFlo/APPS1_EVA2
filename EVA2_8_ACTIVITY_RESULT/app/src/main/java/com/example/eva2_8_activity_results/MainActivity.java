package com.example.eva2_8_activity_results;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSelect, btnconta,bttnima,btnaudio,btnvideo;

    Intent inSelRest;
    Intent seleccConta;
    Intent selecIma;
    Intent selecAudio;
    Intent selecVideo;
    final int RESTAU = 1000;
    final int CONTACTOS = 2000;
    final int IMAGENES = 3000;
    final int AUDIO = 4000;
    final int VIDEO = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSelect = findViewById(R.id.bttnInicial);
        inSelRest = new Intent(this, MyDataActivity.class);

        //SELECCIONAR CONTACTOS
        btnconta = findViewById(R.id.bttnconta);
        btnconta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivityForResult(seleccConta, CONTACTOS);

            }
        });

        //SELECCIONA IMAGEN
        selecIma = new Intent (Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        bttnima = findViewById(R.id.bttnima);

        bttnima.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivityForResult(selecIma, IMAGENES);

            }
        });

        //SELECCIONAR AUDIO
        selecAudio = new Intent (Intent.ACTION_PICK, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
        btnaudio = findViewById(R.id.bttaudio);
        btnaudio.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivityForResult(selecAudio, AUDIO);

            }
        });

        //SELECCIONAR VIDEO
        selecVideo = new Intent (Intent.ACTION_PICK, MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        btnvideo = findViewById(R.id.bttnvideo);
        btnvideo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivityForResult(selecVideo, VIDEO);

            }
        });


        seleccConta = new Intent(Intent.ACTION_PICK, android.provider.ContactsContract.Contacts.CONTENT_URI);
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(inSelRest, RESTAU);


            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case RESTAU: //QUE ACTIVIDAD DEVOLVIO DATOS
                if (resultCode == Activity.RESULT_OK) {
                    //QUE ACCION EJECUTAR CON LOS DATOS
                    data.getStringExtra("aaaa");
                    Toast.makeText(this, data.getStringExtra("aaaa"), Toast.LENGTH_LONG).show();


                } else
                    Toast.makeText(this, "Cancelado por el usuario", Toast.LENGTH_SHORT).show();
                break;
            case CONTACTOS:
                if (resultCode == Activity.RESULT_OK) {
                    String sCont = data.getDataString();
                    Log.wtf("CONTACTO", sCont);
                    Toast.makeText(this, sCont, Toast.LENGTH_LONG).show();
                }
                break;
            case IMAGENES:
                if (resultCode == Activity.RESULT_OK){
                    String sImag = data.getDataString();
                    Log.wtf("IMAGENES", sImag);
                    Toast.makeText(this, sImag, Toast.LENGTH_LONG).show();
                }
                break;
            case AUDIO:
                if (resultCode == Activity.RESULT_OK){
                    String sAud = data.getDataString();
                    Log.wtf("AUDIO", sAud);
                    Toast.makeText(this, sAud, Toast.LENGTH_LONG).show();
                }
                break;
            case VIDEO:
                if (resultCode == Activity.RESULT_OK){
                    String sVid = data.getDataString();
                    Log.wtf("VIDEO", sVid);
                    Toast.makeText(this, sVid, Toast.LENGTH_LONG).show();
                }
        }
    }
}
