package com.example.imanol.examen1_app_apm_riveroronquilloomarimanol_6im8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText mxn;
    AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mxn = (EditText) findViewById(R.id.entrada);
    }

    public void onClickConvertir(View v) {
        if(mxn.getText().equals("") || mxn.getText().equals(" ")){

            alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Alerta");
            alertDialog.setMessage("Agrega un dato válido");
            alertDialog.show();

        }else{

            double dinero, conversion;
            dinero = Double.parseDouble(mxn.getText().toString());
            conversion = dinero/15;
            Intent intento = new Intent(this, Actividad2.class);
            Bundle datos = new Bundle();
            datos.putDouble("Pesos", dinero);
            datos.putDouble("Dolares", conversion);
            intento.putExtras(datos);
            finish();
            startActivity(intento);
        }

    }
}