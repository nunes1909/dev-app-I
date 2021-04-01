package com.gabriel.gamechapolin;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

import java.net.URI;

public class ActivityFinal extends AppCompatActivity {
    Button btnSair, btnReiniciar;
    TextView txtPontosFinal;
    VideoView vdvFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        btnSair = findViewById(R.id.btnSair);
        btnReiniciar = findViewById(R.id.btnReiniciar);
        txtPontosFinal = findViewById(R.id.txtPontosFinal);
        vdvFinal = findViewById(R.id.vdvFinal);

        // parar a musica
        MainActivity.mp.Stop();

        /*
        * O caminho do vídeo é definido pela classe URI
        * Define o nome que recebe ela mesmo com a definição do caminho
        * getPackageName() é o nome do espaço 'todo' do meu projeto
        */

        if(MainActivity.acertos == 3){
            URI caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bonus);
            vdvFinal.setVideoURI(caminho);
            vdvFinal.start();
        }
    }
}