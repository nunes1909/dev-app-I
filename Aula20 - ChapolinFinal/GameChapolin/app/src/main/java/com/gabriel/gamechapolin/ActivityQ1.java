package com.gabriel.gamechapolin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityQ1 extends AppCompatActivity {
    Button btnOpcao1Q1, btnOpcao2Q1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        MainActivity.mp.start();

        btnOpcao1Q1 = findViewById(R.id.btnOpcao1Q1);
        btnOpcao2Q1 = findViewById(R.id.btnOpcao2Q1);


        btnOpcao1Q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                abrirQ2();
            }
        });

        btnOpcao2Q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                abrirQ2();
            }
        });
    }

    private void abrirQ2(){
        Intent janela = new Intent(this, ActivityQ2.class);
        startActivity(janela);
        finish();
    }

    // desativar botao para retornar tudo com sobrescrito para anular uma possivel volta sem reiniciar o jogo

    // esse metodo serve pra caso exista alguma ação de "voltar", irá mostrar aquela mensagem na tela
    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Você não pode voltar!", Toast.LENGTH_LONG).show();
    }

}