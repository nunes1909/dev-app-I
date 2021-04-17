package com.gabriel.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gabriel.myportfolio.mains.MainFormacao;

public class MainActivity extends AppCompatActivity {
    private Button btnHome;
    private TextView tvSub2, tvSub3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHome = findViewById(R.id.btnHome);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirInicio();
            }
        });
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvSub2:
                Intent janela = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/nunes1909"));
                startActivity(janela);
                break;
            case R.id.tvSub3:
                Intent janelaL = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/nunes1909/"));
                startActivity(janelaL);
                break;
        }
    }

    public void abrirInicio(){
        Intent janelaI = new Intent(this, MainInicio.class);
        startActivity(janelaI);
    }
}