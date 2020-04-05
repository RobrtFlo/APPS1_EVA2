package com.example.eva2_7_bundles_extra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtxt;
    Button btn;
    Intent inte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnnEnviar);
        edtxt = findViewById(R.id.edTxtUno);

    }
    public void onClick(View v){
        String cade = edtxt.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("EL_BUNDLE",cade );
        bundle.putInt("ENTERO",23);

        inte = new Intent(this,SecondaryActivity.class);
        inte.putExtra("DATOS",cade);
        inte.putExtras(bundle);

        startActivity(inte);
    }
}
