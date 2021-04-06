package com.gabriel.meusjogos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnVelha, btnPuzzle;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVelha = findViewById(R.id.btnVelha);
        btnPuzzle = findViewById(R.id.btnPuzzle);

        btnVelha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnPuzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    public void abrirVelha(){
        Intent janelaVelha = new Intent(this, MainVelha.class);
        startActivity(janelaVelha);
        finish();
    }

    public void abrirPuzzle(){
        Intent janelaPuzzle = new Intent(this, MainPuzzle.class);
        startActivity(janelaPuzzle);
        finish();
    }

}