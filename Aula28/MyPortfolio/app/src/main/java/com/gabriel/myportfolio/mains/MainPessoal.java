package com.gabriel.myportfolio.mains;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gabriel.myportfolio.MainInicio;
import com.gabriel.myportfolio.R;

public class MainPessoal extends AppCompatActivity {
    private Button btnVoltarInicio4, btnInsta, btnFace, btnGit, btnLink, btnMG, btnVS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pessoal);

        btnVoltarInicio4 = findViewById(R.id.btnVoltarInicio4);
        btnFace = findViewById(R.id.btnFace);
        btnInsta = findViewById(R.id.btnInsta);
        btnGit = findViewById(R.id.btnGit);
        btnLink = findViewById(R.id.btnLink);
        btnMG = findViewById(R.id.btnMG);
        btnVS = findViewById(R.id.btnVS);


        btnVoltarInicio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarInicio4();
            }
        });

        btnMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMusica();
            }
        });

        btnVS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVideo();
            }
        });

        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirFace();
            }
        });

        btnInsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirInsta();
            }
        });

        btnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirLink();
            }
        });

        btnGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirGit();
            }
        });
    }

    public void abrirMusica(){
        Intent janelaM = new Intent(this, MainMusic.class);
        startActivity(janelaM);
    }

    public void voltarInicio4(){
        Intent janela = new Intent(this, MainInicio.class);
        startActivity(janela);
    }

    public void abrirVideo(){
        Intent janela = new Intent(this, MainVideo.class);
        startActivity(janela);
    }

    public void  abrirFace(){
        Intent janela = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
        startActivity(janela);
    }

    public void  abrirInsta(){
        Intent janela = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/nunes1909/"));
        startActivity(janela);
    }

    public void  abrirLink(){
        Intent janela = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/nunes1909/"));
        startActivity(janela);
    }

    public void  abrirGit(){
        Intent janela = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/nunes1909"));
        startActivity(janela);
    }
}