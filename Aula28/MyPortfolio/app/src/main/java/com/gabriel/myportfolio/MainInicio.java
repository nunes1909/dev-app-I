package com.gabriel.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gabriel.myportfolio.mains.MainAtv;
import com.gabriel.myportfolio.mains.MainFormacao;
import com.gabriel.myportfolio.mains.MainPessoal;
import com.gabriel.myportfolio.mains.MainSensores;
import com.gabriel.myportfolio.mains.MainXp;

public class MainInicio extends AppCompatActivity {
    private Button btnVoltarHome, btnFormacao, btnXp, btnCursos, btnDados, btnSensores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inicio);


        btnVoltarHome = findViewById(R.id.btnVoltarHome);
        btnFormacao = findViewById(R.id.btnFormacao);
        btnXp = findViewById(R.id.btnXp);
        btnCursos = findViewById(R.id.btnCursos);
        btnDados = findViewById(R.id.btnDados);
        btnSensores = findViewById(R.id.btnSensores);

        btnFormacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirFormacao();
            }
        });

        btnXp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirXp();
            }
        });

        btnCursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirCursos();
            }
        });

        btnDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirDados();
            }
        });

        btnSensores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSensor();
            }
        });

        btnVoltarHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarHome();
            }
        });
    }

    public void abrirFormacao(){
        Intent janela = new Intent(this, MainFormacao.class);
        startActivity(janela);
    }

    public void abrirXp(){
        Intent janela = new Intent(this, MainXp.class);
        startActivity(janela);
    }

    public void abrirCursos(){
        Intent janela = new Intent(this, MainAtv.class);
        startActivity(janela);
    }

    public void abrirDados(){
        Intent janela = new Intent(this, MainPessoal.class);
        startActivity(janela);
    }

    public void abrirSensor(){
        Intent janela = new Intent(this, MainSensores.class);
        startActivity(janela);
    }

    public void voltarHome(){
        Intent janela = new Intent(this, MainActivity.class);
        startActivity(janela);
    }
}