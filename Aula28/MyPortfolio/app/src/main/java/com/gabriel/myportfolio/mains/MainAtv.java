package com.gabriel.myportfolio.mains;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gabriel.myportfolio.MainInicio;
import com.gabriel.myportfolio.R;

public class MainAtv extends AppCompatActivity {
    private Button btnVoltarInicio3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_atv);

        btnVoltarInicio3 = findViewById(R.id.btnVoltarInicio3);
        btnVoltarInicio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarInicio3();
            }
        });
    }
    public void voltarInicio3(){
        Intent janela = new Intent(this, MainInicio.class);
        startActivity(janela);
    }
}