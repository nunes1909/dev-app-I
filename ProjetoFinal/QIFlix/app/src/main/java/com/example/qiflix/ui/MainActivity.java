package com.example.qiflix.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.qiflix.R;

public class MainActivity extends AppCompatActivity {
 private TextView txtEntrar, txtPrivacidade;
 private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        txtEntrar = findViewById(R.id.txtEntrar);
        btnLogin = findViewById(R.id.btnLogin);
        txtPrivacidade = findViewById(R.id.txtPrivacidade);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityCadastro.class));
            }
        });
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.txtEntrar:
                Intent janela = new Intent(this, ActivityLogin.class);
                startActivity(janela);
                break;
            case R.id.txtPrivacidade:
                Intent janelaP = new Intent(this, Privacidade.class);
                startActivity(janelaP);
                break;
        }
    }

}