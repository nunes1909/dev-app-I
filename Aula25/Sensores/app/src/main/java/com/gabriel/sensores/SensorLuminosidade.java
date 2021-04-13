package com.gabriel.sensores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SensorLuminosidade extends AppCompatActivity {
    private TextView visual;
    SensorManager sm;
    SensorEventListener listener;
    Sensor luz;
    Button btnAce, btnVoltarProx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visual = findViewById(R.id.visual);
        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        luz = sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        btnAce = findViewById(R.id.btnAce);
        btnVoltarProx = findViewById(R.id.btnVoltar);

        btnAce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abriAcele();
            }
        });

        btnVoltarProx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarProximidade();
            }
        });

        listener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event){
                visual.setText(String.valueOf(event.values[0]));
                int grayShade = (int) event.values[0];

                if(grayShade > 255) grayShade = 255;

                visual.setTextColor(Color.rgb( 255 - grayShade, 255 - grayShade, 255 - grayShade ) );
                visual.setBackgroundColor(Color.rgb(grayShade,grayShade,grayShade));

            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i){

            }
        };

        sm.registerListener(listener,luz,SensorManager.SENSOR_DELAY_FASTEST);

    }

    public void abriAcele(){
        Intent janela = new Intent(this, SensorManager.class);
        startActivity(janela);
    }

    public void voltarProximidade(){
        Intent janelaProx = new Intent(this, SensorProximidade.class);
        startActivity(janelaProx);
    }

    @Override
    protected void onPause() {
        sm.unregisterListener(listener,luz);
        super.onPause();
    }

}