package com.example.app_concurso.nivel_avanzado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.app_concurso.R;

public class numero8 extends AppCompatActivity {

    ImageButton play;
    MediaPlayer mp2;
    Button pasar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero8);

        pasar = (Button) findViewById(R.id.pasar9);
        play = (ImageButton) findViewById(R.id.num8);

        pasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(numero8.this, numero9.class));
            }
        });
    }
}