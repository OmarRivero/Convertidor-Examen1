package com.example.imanol.examen1_app_apm_riveroronquilloomarimanol_6im8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    double mxn, usa;
    TextView texto;
    Bundle recibe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        texto = (TextView) findViewById(R.id.msj);
        recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        mxn = recibe.getDouble("Pesos");
        usa = recibe.getDouble("Dolares");


        texto.setText("Los pesos mexicanos convertir son: $" + mxn
                    + "\n y su equivalente en dolares es: $" + usa);


    }

    public void onClickCompartir(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Examen1 Laboratorio de Proyectos IV");
        intent.putExtra(Intent.EXTRA_TEXT, "Los pesos mexicanos convertir son: $" + mxn
                + "\n y su equivalente en dolares es: $" + usa);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"eoropezag@ipn.mx"});
        startActivity(Intent.createChooser(intent, "Gmail"));

    }

}