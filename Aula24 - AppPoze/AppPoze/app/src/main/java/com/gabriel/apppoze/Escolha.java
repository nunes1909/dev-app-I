package com.gabriel.apppoze;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Escolha extends AppCompatActivity {
    private TextView resposta;
    private Button btnTeaser, btnSom;
    private WebView imagem2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha);

        resposta = findViewById(R.id.resposta);
        btnTeaser = findViewById(R.id.btnTeaser);
        btnSom = findViewById(R.id.btnSom);
        imagem2 = findViewById(R.id.imagem2);

        String recebe = getIntent().getStringExtra("dados");
        resposta.setText(recebe);

        WebSettings gif = imagem2.getSettings();
        gif.setJavaScriptEnabled(true);
        String caminho = "file:android_asset/pomba.gif";
        imagem2.loadUrl(caminho);

        btnTeaser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTeaser();
            }
        });

        btnSom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSom();
            }
        });
    }

    public void abrirTeaser(){
        Intent janelaTeaser = new Intent(this, Teaser.class);
        startActivity(janelaTeaser);
    }

    public void abrirSom(){
        Intent janelaSom = new Intent(this, Som.class);
        startActivity(janelaSom);
    }
}