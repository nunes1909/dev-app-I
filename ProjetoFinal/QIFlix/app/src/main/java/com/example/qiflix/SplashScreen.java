package com.example.qiflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.qiflix.ui.MainActivity;

public class SplashScreen extends AppCompatActivity {
WebView imagem;
private MediaPlayer pozze;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        //ocultar a barra de ação do android e configurar a activity p tela cheia
        getSupportActionBar().hide();;
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        imagem =  findViewById(R.id.imagem);

        WebSettings gif = imagem.getSettings();
        gif.setJavaScriptEnabled(true);
        String caminho = "file:android_asset/gifsemborda.gif";
        imagem.loadUrl(caminho);

        pozze = MediaPlayer.create(this, R.raw.pozze);
        pozze.start();
        //novo manipulador que controla o método postDelayed para abrir a activity num tempo especificado
        //declaramos o método finish(); para destruir a SplashScreen impossibilitando assim q o usuário
        //possa retornar com o voltar do device
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
                finish();
                pozze.stop();
            }
        }, 6000);
    }
}