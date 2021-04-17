package com.gabriel.myportfolio.mains;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gabriel.myportfolio.MainInicio;
import com.gabriel.myportfolio.R;

public class MainFormacao extends AppCompatActivity {
    private Button btnVoltarInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_formacao);

        btnVoltarInicio = findViewById(R.id.btnVoltarInicio);
        btnVoltarInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarInicio();
            }
        });
    }

    public void voltarInicio(){
        Intent janelaInicio = new Intent(this, MainInicio.class);
        startActivity(janelaInicio);
    }
}