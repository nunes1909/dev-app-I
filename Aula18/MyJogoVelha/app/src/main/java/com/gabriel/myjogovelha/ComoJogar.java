package com.gabriel.myjogovelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ComoJogar extends AppCompatActivity {
    Button btnJogarI, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_jogar);

        btnJogarI = findViewById(R.id.btnJogar);
        btnVoltar= findViewById(R.id.btnVoltar);

        btnJogarI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirJogar();
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltar();
            }
        });
    }

    private void abrirJogar(){
        Intent janelaJogo = new Intent(this, Jogo.class);
        startActivity(janelaJogo);
    }

    private void abrirVoltar(){
        Intent janelaVoltar = new Intent(this, MainActivity.class);
        startActivity(janelaVoltar);
    }
}