package com.example.qiflix.subMenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.qiflix.R;
import com.example.qiflix.fragmentos.MessiFragment;
import com.example.qiflix.fragmentos.PozeFragment;
import com.example.qiflix.menu.MainMenu;

public class MainOutros extends AppCompatActivity {
private Button verMessi, verPoze, btnMapa;
private MessiFragment messiFragment;
private PozeFragment pozeFragment;
private ImageView voltarOutros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_outros);

        getSupportActionBar().hide();

        verMessi = findViewById(R.id.verMessi);
        verPoze = findViewById(R.id.verPoze);
        btnMapa = findViewById(R.id.btnMapa);
        voltarOutros = findViewById(R.id.voltarOutros);

        verMessi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messiFragment = new MessiFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, messiFragment);
                transaction.commit();
            }
        });

        verPoze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pozeFragment = new PozeFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, pozeFragment);
                transaction.commit();
            }
        });

        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainOutros.this, MapsActivity.class));
            }
        });
        voltarOutros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainOutros.this, MainMenu.class));
            }
        });

    }


}