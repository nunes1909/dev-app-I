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

public class MainBolsonaro extends AppCompatActivity {
    private ImageView voltarBolsonaro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bolsonaro);

        getSupportActionBar().hide();

        VideoView vvBolsonaro = findViewById(R.id.vvBolsonaro);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.bolsonaro;
        Uri uri = Uri.parse(videoPath);
        vvBolsonaro.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vvBolsonaro.setMediaController(mediaController);
        mediaController.setAnchorView(vvBolsonaro);

        vvBolsonaro.start();

        voltarBolsonaro = findViewById(R.id.voltarBolsonaro);
        voltarBolsonaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainBolsonaro.this, MainMenu.class));
            }
        });

    }
}