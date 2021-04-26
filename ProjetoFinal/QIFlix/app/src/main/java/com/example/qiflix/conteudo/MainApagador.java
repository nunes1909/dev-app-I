package com.example.qiflix.conteudo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.qiflix.R;
import com.example.qiflix.menu.MainMenu;

public class MainApagador extends AppCompatActivity {
    private ImageView voltarApagador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_apagador);

        getSupportActionBar().hide();

        VideoView vvApagador = findViewById(R.id.vvBolsonaro);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.apagar;
        Uri uri = Uri.parse(videoPath);
        vvApagador.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vvApagador.setMediaController(mediaController);
        mediaController.setAnchorView(vvApagador);

        vvApagador.start();

        voltarApagador = findViewById(R.id.voltarApagador);
        voltarApagador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainApagador.this, MainMenu.class));
            }
        });
    }
}