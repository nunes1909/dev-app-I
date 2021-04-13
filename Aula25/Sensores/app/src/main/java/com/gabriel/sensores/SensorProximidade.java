package com.gabriel.sensores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SensorProximidade extends AppCompatActivity implements SensorEventListener {
    private TextView resultado;
    private Button btnVoltar, btnLum;
    private Sensor proximidade;
    private SensorManager medir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_proximidade);

        btnVoltar = findViewById(R.id.btnVoltar);
        btnLum = findViewById(R.id.btnLum);

        medir = (SensorManager) this.getSystemService(SENSOR_SERVICE);
        proximidade = medir.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        resultado = findViewById(R.id.resultado);

        btnLum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirLum();
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarInicio();
            }
        });
    }

    public void abrirLum() {
        Intent janela = new Intent(this, SensorLuminosidade.class);
        startActivity(janela);
    }

    public void voltarInicio() {
        Intent janela = new Intent(this, MainActivity.class);
        startActivity(janela);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        medir.registerListener(this, proximidade, SensorManager.SENSOR_DELAY_NORMAL);
        super.onResume();
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }


}