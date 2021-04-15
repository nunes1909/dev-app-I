package com.gabriel.sensores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class MainPlanta extends AppCompatActivity {
    private Button btnVoltar3, btnPararSom;
    private WebView imagem;
    private MediaPlayer mp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_planta);

        btnVoltar3 = findViewById(R.id.btnVoltar3);
        btnPararSom = findViewById(R.id.btnPararSom);
        imagem = findViewById(R.id.imagem);

        mp = MediaPlayer.create(this, R.raw.planta);
        mp.start();

        WebSettings gif = imagem.getSettings();
        gif.setJavaScriptEnabled(true);
        String caminho = "file:android_asset/planta.gif";
        imagem.loadUrl(caminho);

        btnVoltar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarMain();
                mp.stop();
            }
        });

        btnPararSom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pararSom();
            }
        });

    }

    public void voltarMain(){
        Intent janelaMain = new Intent(this, MainActivity.class);
        startActivity(janelaMain);
    }

    public void pararSom(){mp.stop();}




}