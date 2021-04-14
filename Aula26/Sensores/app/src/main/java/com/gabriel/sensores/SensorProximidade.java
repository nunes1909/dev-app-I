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

public class SensorProximidade extends AppCompatActivity implements SensorEventListener {
    private TextView resultado;
    private Sensor proximidade;
    private SensorManager medir;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_proximidade);

        medir = (SensorManager) this.getSystemService(SENSOR_SERVICE);
        proximidade = medir.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        resultado = findViewById(R.id.resultado);
        btnVoltar = findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltar();
            }
        });
    }

    @Override
    protected void onResume() {
        medir.registerListener(this, proximidade, SensorManager.SENSOR_DELAY_NORMAL);
        super.onResume();
    }

    @Override
    protected void onPause() {
        medir.unregisterListener(this, proximidade);
        super.onPause();
    }
    /*
     * metodo onSensorChanged que ocorre quando é executado ou modificado algum tipo de evento
     * relacionado ao sensor especificado
     * se o valor do evento for = a 0, é pq estamos proximos ao sensor, se nao estamos afastados
     * */

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.values[0] == 0) {
            getWindow().getDecorView().setBackgroundColor(Color.rgb(234, 78, 78));
            resultado.setText("Está Próximo");
        } else {
            getWindow().getDecorView().setBackgroundColor(Color.rgb(163, 157, 157));
            resultado.setText("Está Longe");
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    private void voltar() {
        Intent janelaV = new Intent(this, MainActivity.class);
        startActivity(janelaV);
    }


}