package com.gabriel.apppoze;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Teaser extends AppCompatActivity {
    private VideoView trailer;
    private Button btnVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teaser);

        trailer = findViewById(R.id.trailer);
        btnVoltar = findViewById(R.id.btnVoltar);

        // importação do vídeo
        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.pozze);
        trailer.setVideoURI(caminho);
        trailer.start();


        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltar();
            }
        });
    }

    public void abrirVoltar(){
        Intent janelaAV = new Intent(this, MainActivity.class);
        startActivity(janelaAV);
        trailer.stopPlayback();
    }
}