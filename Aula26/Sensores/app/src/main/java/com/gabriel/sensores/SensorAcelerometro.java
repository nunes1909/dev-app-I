package com.gabriel.sensores;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SensorAcelerometro<onResum> extends AppCompatActivity implements SensorEventListener {
    private SensorManager sensorManager;
    // tipo de dado boleano para alterar a cor
    private boolean isColor = false;
    private TextView respostab;
    // igual ao double e que possui mais casas decimais = numero Longo
    private long ultimaAtualizacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_acelerometro);

        respostab = findViewById(R.id.respostab);
        respostab.setBackgroundColor(Color.LTGRAY);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        ultimaAtualizacao = System.currentTimeMillis();
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            getAccelerometer(event);
        }
    }

    private void getAccelerometer(SensorEvent event) {
        float[] values = event.values;
        // movimento
        float x = values[0];
        float y = values[1];
        float z = values[2];

        float accelationSquareRoot = (x * x + y * y + z * z) / (SensorManager.GRAVITY_EARTH * SensorManager.GRAVITY_EARTH);
        long tempoatual = System.currentTimeMillis();

        Toast.makeText(getApplicationContext(), String.valueOf(accelationSquareRoot) + " " + SensorManager.GRAVITY_EARTH, Toast.LENGTH_SHORT).show();

        if (accelationSquareRoot >= 2) {
            if(tempoatual - ultimaAtualizacao < 200){
                return;
            }
            ultimaAtualizacao = tempoatual;

            if(isColor){
                respostab.setBackgroundColor(Color.MAGENTA);
            }else{
                respostab.setBackgroundColor(Color.BLUE);
            }

            isColor =! isColor;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}