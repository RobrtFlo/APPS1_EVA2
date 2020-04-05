package com.example.eva2_8_activity_results;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MyDataActivity extends AppCompatActivity implements ListView.OnItemClickListener, View.OnClickListener {
    ListView listRest;
    Button btncan, btnconta;


    String[] Lugares = {
            "AzulUno",
            "GrisUno",
            "VerdeUno",
            "RojoUno",
            "GuindaUno",
            "MoradoUno",
            "NegroUno"

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_data);
        btncan = findViewById(R.id.bttncanc);
        btncan.setOnClickListener(this);
        listRest = findViewById(R.id.listView);
        listRest.setOnItemClickListener(this);
        listRest.setAdapter(
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        Lugares));
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent inDatos = new Intent();
        inDatos.putExtra("aaaa", Lugares[position]);
        setResult(Activity.RESULT_OK, inDatos);
        finish();

    }

    @Override
    public void onClick(View v) {
        setResult(Activity.RESULT_CANCELED);
        finish();
    }
}
