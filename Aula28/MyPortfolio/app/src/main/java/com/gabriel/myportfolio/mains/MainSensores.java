package com.gabriel.myportfolio.mains;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import com.gabriel.myportfolio.MainInicio;
import com.gabriel.myportfolio.R;

public class MainSensores extends AppCompatActivity implements SensorEventListener {
    private TextView tvRespostaP;
    private Button btnVoltarInicio6;
    private WebView imagemGif;
    private Sensor proximidade;
    private SensorManager medir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sensores);

        medir = (SensorManager) this.getSystemService(SENSOR_SERVICE);
        proximidade = medir.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        tvRespostaP = findViewById(R.id.tvRespostaP);
        btnVoltarInicio6 = findViewById(R.id.btnVoltarInicio6);
        imagemGif = findViewById(R.id.imagemGif);

        btnVoltarInicio6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarInicio6();
            }
        });
/*
        WebSettings gif = imagemGif.getSettings();
        gif.setJavaScriptEnabled(true);
        String caminho = "file:android_asset/triste.gif";
        imagemGif.loadUrl(caminho);
*/
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

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.values[0] == 0) {
            getWindow().getDecorView().setBackgroundColor(Color.rgb(234, 78, 78));
            tvRespostaP.setText("Hmmm, chegou mais perto. Hahaha!!! ");

            WebSettings gif = imagemGif.getSettings();
            gif.setJavaScriptEnabled(true);
            String caminho = "file:android_asset/alegre.gif";
            imagemGif.loadUrl(caminho);

        } else {
            getWindow().getDecorView().setBackgroundColor(Color.rgb(163, 157, 157));
            tvRespostaP.setText("Está Longe, chegue mais perto!");

            WebSettings gif = imagemGif.getSettings();
            gif.setJavaScriptEnabled(true);
            String caminho = "file:android_asset/triste.gif";
            imagemGif.loadUrl(caminho);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    public void voltarInicio6(){
        Intent janelaInicio = new Intent(this, MainInicio.class);
        startActivity(janelaInicio);
    }
}