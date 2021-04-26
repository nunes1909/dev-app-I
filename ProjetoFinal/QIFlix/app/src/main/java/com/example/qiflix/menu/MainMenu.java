package com.example.qiflix.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qiflix.conteudo.MainApagador;
import com.example.qiflix.conteudo.MainBolsonaro;
import com.example.qiflix.conteudo.MainMessi;
import com.example.qiflix.conteudo.MainNegoNey;
import com.example.qiflix.conteudo.MainPoze;
import com.example.qiflix.conteudo.MainShrek;
import com.example.qiflix.R;
import com.example.qiflix.subMenu.MainOutros;


public class MainMenu extends AppCompatActivity {
    private ImageView ivPlay1, ivPlay2, ivPlay3, ivPlay4, ivPlay6, ivPlay7, ivPlay5;
    private TextView tvPoze, tvMessi, tvNegoNei, tvShrek, tvApagador, tvBolsonaro, tvOutros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        getSupportActionBar().hide();

        tvPoze = findViewById(R.id.tvPoze);
        tvMessi = findViewById(R.id.tvMessi);
        tvNegoNei = findViewById(R.id.tvNegoNei);
        tvShrek = findViewById(R.id.tvShrek);
        tvApagador = findViewById(R.id.tvApagador);
        tvBolsonaro = findViewById(R.id.tvBolsonaro);
        tvOutros = findViewById(R.id.tvOutros);

        ivPlay1 = findViewById(R.id.ivPlay1);
        ivPlay2 = findViewById(R.id.ivPlay2);
        ivPlay3 = findViewById(R.id.ivPlay3);
        ivPlay4 = findViewById(R.id.ivPlay4);
        ivPlay5 = findViewById(R.id.ivPlay5);
        ivPlay6 = findViewById(R.id.ivPlay6);
        ivPlay7 = findViewById(R.id.ivPlay7);


        // Start Poze
        tvPoze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainPoze.class));
            }
        });

        ivPlay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainPoze.class));

            }
        });

        // Start Messi
        tvMessi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainMessi.class));
            }
        });

        ivPlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainMessi.class));

            }
        });

        // Start Nego Nei
        tvNegoNei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainNegoNey.class));
            }
        });

        ivPlay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainNegoNey.class));

            }
        });

        // Start Shrek
        tvShrek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainShrek.class));
            }
        });

        ivPlay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainShrek.class));
            }
        });

        // Start Apagador
        tvApagador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainApagador.class));
            }
        });

        ivPlay6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainApagador.class));

            }
        });


        // Start Apagador
        tvBolsonaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainBolsonaro.class));
            }
        });

        ivPlay7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainBolsonaro.class));

            }
        });


        // Start Outros
        tvOutros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainOutros.class));
            }
        });

        ivPlay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainOutros.class));
            }
        });

    }
}