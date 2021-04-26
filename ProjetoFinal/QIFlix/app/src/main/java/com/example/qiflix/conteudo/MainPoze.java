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

public class MainPoze extends AppCompatActivity {
private ImageView voltarPoze;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_poze);

        getSupportActionBar().hide();

        VideoView vvpoze = findViewById(R.id.vvpoze);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.poze;
        Uri uri = Uri.parse(videoPath);
        vvpoze.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vvpoze.setMediaController(mediaController);
        mediaController.setAnchorView(vvpoze);

        vvpoze.start();

        voltarPoze = findViewById(R.id.voltarPoze);
        voltarPoze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPoze.this, MainMenu.class));
            }
        });
    }
}