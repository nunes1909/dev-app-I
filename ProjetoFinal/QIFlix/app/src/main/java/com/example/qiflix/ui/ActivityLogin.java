package com.example.qiflix.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.qiflix.R;
import com.example.qiflix.menu.MainMenu;

public class ActivityLogin extends AppCompatActivity {
    private ImageView imgVoltar;
    private Button btnEntrar;
    private EditText txtEmail, txtSenha;
    private TextView textoCadastro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        imgVoltar = findViewById(R.id.imgVoltar);
        btnEntrar = findViewById(R.id.btnEntrar);
        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);
        textoCadastro = findViewById(R.id.textoCadastro);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityLogin.this, MainMenu.class));
                Toast.makeText(getApplicationContext(), "Bem vindo", Toast.LENGTH_LONG).show();
            }
        });

        imgVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityLogin.this, MainActivity.class));
            }
        });
        textoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityLogin.this, ActivityCadastro.class));
            }
        });
    }


}