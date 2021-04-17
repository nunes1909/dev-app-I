package com.gabriel.myportfolio.mains;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

import com.gabriel.myportfolio.R;
import com.gabriel.myportfolio.mains.MainPessoal;

public class MainMusic extends AppCompatActivity {
    private WebView imagem;
    private Button btnPlay, btnStop, btnVoltarPessoal;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_music);

        btnPlay = findViewById(R.id.btnPlay);
        btnStop = findViewById(R.id.btnStop);
        btnVoltarPessoal = findViewById(R.id.btnVoltarPessoal);
        imagem = findViewById(R.id.imagem);

        // gif
        WebSettings gif = imagem.getSettings();
        gif.setJavaScriptEnabled(true);
        String caminho = "file:android_asset/alegre.gif";
        imagem.loadUrl(caminho);

        // musica
        mp = MediaPlayer.create(this, R.raw.musicaalegre);
        //mp.start();

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
            }
        });

        btnVoltarPessoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarPessoal();
            }
        });
    }

    public void voltarPessoal(){
        Intent janelaP = new Intent(this, MainPessoal.class);
        startActivity(janelaP);
    }
}