package com.example.qiflix.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.qiflix.R;

public class Privacidade extends AppCompatActivity {
    private ImageView voltarPrivacidade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacidade);

        voltarPrivacidade = findViewById(R.id.voltarPrivacidade);
        voltarPrivacidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Privacidade.this, MainActivity.class));
            }
        });
    }
}