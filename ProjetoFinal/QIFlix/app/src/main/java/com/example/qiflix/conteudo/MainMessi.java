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

public class MainMessi extends AppCompatActivity {
private ImageView voltarMessi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_messi);
        getSupportActionBar().hide();

        VideoView vvmessi = findViewById(R.id.vvMessi);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.minimessi;
        Uri uri = Uri.parse(videoPath);
        vvmessi.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vvmessi.setMediaController(mediaController);
        mediaController.setAnchorView(vvmessi);

        vvmessi.start();
        voltarMessi = findViewById(R.id.voltarMessi);
        voltarMessi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMessi.this, MainMenu.class));
            }
        });

    }
}