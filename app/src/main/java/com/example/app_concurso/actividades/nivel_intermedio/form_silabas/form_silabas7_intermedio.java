package com.example.app_concurso.actividades.nivel_intermedio.form_silabas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.app_concurso.R;

public class form_silabas7_intermedio extends AppCompatActivity {

    Button ja,je,ji,jo,ju;
    Button mp,mp1;
    MediaPlayer j1,j2,j3,j4,j5,m1,m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_silabas7_intermedio);

        ja = (Button) findViewById(R.id.jja);
        je = (Button) findViewById(R.id.jje);
        ji = (Button) findViewById(R.id.jji);
        jo = (Button) findViewById(R.id.jjo);
        ju = (Button) findViewById(R.id.jju);

        mp = (Button) findViewById(R.id.button50);
        mp1 = (Button) findViewById(R.id.button51);

        j1 = MediaPlayer.create(this,R.raw.ja);
        j2 = MediaPlayer.create(this,R.raw.je);
        j3 = MediaPlayer.create(this,R.raw.ji);
        j4 = MediaPlayer.create(this,R.raw.jo);
        j5 = MediaPlayer.create(this,R.raw.ju);

        m1 = MediaPlayer.create(this,R.raw.intr_j);
        m2 = MediaPlayer.create(this,R.raw.mensaje1);

        ja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j1.start();
            }
        });

        je.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j2.start();
            }
        });

        ji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j3.start();
            }
        });

        jo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j4.start();
            }
        });

        ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j5.start();
            }
        });

        mp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1.start();
            }
        });

        mp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2.start();
            }
        });
    }

    public void form7(View view) {
        Intent intent = new Intent(this, form_silabas8_intermedio.class);
        startActivity(intent);
    }
}