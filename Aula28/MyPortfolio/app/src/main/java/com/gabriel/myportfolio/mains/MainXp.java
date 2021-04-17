package com.gabriel.myportfolio.mains;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gabriel.myportfolio.MainInicio;
import com.gabriel.myportfolio.R;

public class MainXp extends AppCompatActivity {
    private Button btnVoltarInicio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_xp);

        btnVoltarInicio2 = findViewById(R.id.btnVoltarInicio2);
        btnVoltarInicio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarInicio2();
            }
        });
    }

    public void voltarInicio2(){
        Intent janela = new Intent(this, MainInicio.class);
        startActivity(janela);
    }
}