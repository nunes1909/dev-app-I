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
    private Button btnVoltar, btnLuminosidade;
    private Sensor proximidade;
    private SensorManager medir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_proximidade);

        medir = (SensorManager) this.getSystemService(SENSOR_SERVICE);
        proximidade = medir.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        resultado = findViewById(R.id.resultado);
        btnVoltar = findViewById(R.id.btnVoltar);
        btnLuminosidade = findViewById(R.id.btnLuminosidade);

        btnLuminosidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirLuminosidade();
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarInicio();
            }
        });
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

    public void abrirLuminosidade(){
        Intent janelaLum = new Intent(this, SensorLuminosidade.class);
        startActivity(janelaLum);
    }

    public void voltarInicio(){
        Intent janelaInicio = new Intent(this, MainActivity.class);
        startActivity(janelaInicio);
    }
}