package com.gabriel.sensores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    SensorManager sensorManager;
    private Button listar, proximo, btnLuminosidade, btnAcelerometro;
    private TextView resposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        listar = findViewById(R.id.listar);
        proximo = findViewById(R.id.proximo);
        resposta = findViewById(R.id.resposta);
        btnLuminosidade = findViewById(R.id.btnLuminosidade);
        btnAcelerometro = findViewById(R.id.btnAcelerometro);

        listar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recebe = "";
                List<Sensor> listagem = sensorManager.getSensorList(Sensor.TYPE_ALL);

                for (int i = 0; i < listagem.size(); i++) {
                    recebe += listagem.get(i).getName() + "\n";
                }
                resposta.setText(" " + recebe);
            }
        });

        btnAcelerometro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirAcelerometro();
            }
        });

        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirProximo();
            }
        });
        btnLuminosidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirLumi();
            }
        });
    }

    public void abrirProximo() {
        Intent janela = new Intent(this, SensorProximidade.class);
        startActivity(janela);
    }

    public void abrirLumi() {
        Intent janelaL = new Intent(this, SensorLuminosidade.class);
        startActivity(janelaL);
    }

    public void abrirAcelerometro(){
        Intent janelaA = new Intent(this, SensorAcelerometro.class);
        startActivity(janelaA);
    }

}