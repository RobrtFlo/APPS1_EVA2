package com.example.eva2_7_bundles_extra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    TextView txtData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        txtData = findViewById(R.id.txtViewData);
        Intent inDatos = getIntent();
        Bundle bundle = inDatos.getExtras();
        String cade = inDatos.getStringExtra("DATOS");



        txtData.setText(cade);
        txtData.append("\n");
        txtData.append(bundle.getString("EL_BUNDLE")+" "+bundle.getInt("ENTERO"));
    }
}
