package com.example.app_concurso.nivel_avanzado;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.app_concurso.R;
import com.example.app_concurso.actividades.nivel_basico.vocales.a_actividad;
import com.example.app_concurso.actividades.nivel_basico.vocales.basicoA;
import com.example.app_concurso.actividades.nivel_basico.vocales.basicoU;

public class numero9 extends AppCompatActivity {

    ImageButton play;
    MediaPlayer mp2;
    Button pasar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero9);

        pasar = (Button) findViewById(R.id.pasaract);

        pasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(numero9.this);
                alerta.setMessage("¿Quieres repetir el repaso?")
                        .setCancelable(false)
                        .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent repetir = new Intent(getApplicationContext(), numero1.class);
                                startActivity(repetir);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent actividades = new Intent(getApplicationContext(), actividad1_numeros.class);
                                startActivity(actividades);
                            }
                        });
                AlertDialog titulo = alerta.create();
                titulo.setTitle("Anuncio");
                titulo.show();
            }
        });
    }
}