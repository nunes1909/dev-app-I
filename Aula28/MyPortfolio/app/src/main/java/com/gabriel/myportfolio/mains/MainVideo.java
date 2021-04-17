package com.gabriel.myportfolio.mains;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import com.gabriel.myportfolio.R;
import com.gabriel.myportfolio.mains.MainPessoal;

public class MainVideo extends AppCompatActivity {
    private VideoView vvVideo;
    private Button btnVoltarPessoal2, btnParar, btnPV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_video);

        vvVideo = findViewById(R.id.vvVideo);
        btnVoltarPessoal2 = findViewById(R.id.btnVoltarPessoal2);
        btnParar = findViewById(R.id.btnParar);
        btnPV = findViewById(R.id.btnPV);

        // importação do vídeo
        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.luta);
        vvVideo.setVideoURI(caminho);

        btnVoltarPessoal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarPessoal2();
            }
        });

        btnParar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vvVideo.stopPlayback();
            }
        });

        btnPV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vvVideo.start();
            }
        });
    }

    public void voltarPessoal2(){
        Intent janelaAV = new Intent(this, MainPessoal.class);
        startActivity(janelaAV);
        vvVideo.stopPlayback();
    }
}