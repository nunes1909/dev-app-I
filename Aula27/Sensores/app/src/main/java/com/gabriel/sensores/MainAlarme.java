package com.gabriel.sensores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainAlarme extends AppCompatActivity {
    private Button btnVoltar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_alarme);

        btnVoltar2 = findViewById(R.id.btnVoltar2);

        btnVoltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarInicio();
            }
        });
    }

    public void voltarInicio(){
        Intent janela = new Intent(this, MainActivity.class);
        startActivity(janela);
    }
}