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

public class MainNegoNey extends AppCompatActivity {
private ImageView voltarNey;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nego_ney);

        getSupportActionBar().hide();

        VideoView vvnegoney = findViewById(R.id.vvnegoney);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.negoney;
        Uri uri = Uri.parse(videoPath);
        vvnegoney.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vvnegoney.setMediaController(mediaController);
        mediaController.setAnchorView(vvnegoney);

        vvnegoney.start();
        voltarNey = findViewById(R.id.voltarNey);
        voltarNey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainNegoNey.this, MainMenu.class));
            }
        });
    }

}