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

public class MainShrek extends AppCompatActivity {
private ImageView voltarShrek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_shrek);

        getSupportActionBar().hide();

        VideoView vvShrek = findViewById(R.id.vvShrek);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.shrek;
        Uri uri = Uri.parse(videoPath);
        vvShrek.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vvShrek.setMediaController(mediaController);
        mediaController.setAnchorView(vvShrek);

        vvShrek.start();

        voltarShrek = findViewById(R.id.voltarShrek);
        voltarShrek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainShrek.this, MainMenu.class));
            }
        });
    }
}