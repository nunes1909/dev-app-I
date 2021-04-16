package com.gabriel.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.gabriel.myportfolio.formacao.MainFormacao;

public class MainInicio extends AppCompatActivity {
    private TextView tvFormacao, tvAtv, tvXp, tvDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inicio);

        tvFormacao = findViewById(R.id.tvFormacao);
        tvAtv = findViewById(R.id.tvAtv);
        tvXp = findViewById(R.id.tvXp);
        tvDados = findViewById(R.id.tvDados);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tvFormacao:
                Intent janela = new Intent(this, MainFormacao.class);
                startActivity(janela);
                break;
        }
    }
}