package com.example.app_concurso.actividades.nivel_basico.vocales;

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

public class basicoU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basico_u);
        ImageButton play;
        ImageButton letraU;
        Button pasar;
        MediaPlayer mp;
        MediaPlayer mp2;

            play = (ImageButton) findViewById(R.id.audio5);
            letraU= (ImageButton)findViewById(R.id.vocalU);
            pasar = (Button) findViewById(R.id.letraFinal);

            mp = MediaPlayer.create(this,R.raw.letra_u);
            mp2 = MediaPlayer.create(this,R.raw.u);

            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp.start();
                }
            });
            letraU.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp2.start();
                }
            });
            pasar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alerta = new AlertDialog.Builder(basicoU.this);
                    alerta.setMessage("¿Quieres repetir el repaso?")
                            .setCancelable(false)
                            .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent repetir = new Intent(getApplicationContext(), basicoA.class);
                                    startActivity(repetir);
                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent actividades = new Intent(getApplicationContext(), a_actividad.class);
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