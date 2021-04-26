package com.example.qiflix.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.qiflix.R;
import com.example.qiflix.banco.BancoController;

public class ActivityCadastro extends AppCompatActivity {
private Button btnCadastrar;
private ImageView voltarCadastro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        getSupportActionBar().hide();

        btnCadastrar = findViewById(R.id.btnCadastrar);
        voltarCadastro = findViewById(R.id.voltarCadastro);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BancoController crud = new BancoController(getBaseContext());
                EditText idNome = (EditText)findViewById(R.id.idNome);
                EditText idEmail = (EditText)findViewById((R.id.idEmail));
                EditText idSenha = (EditText)findViewById(R.id.idSenha);
                String nomeString = idNome.getText().toString();
                String emailString = idEmail.getText().toString();
                String senhaString = idSenha.getText().toString();
                String resultado;

                resultado = crud.insereDado(nomeString, emailString, senhaString);
                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
                startActivity(new Intent(ActivityCadastro.this, ActivityLogin.class));
            }
        });
        voltarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityCadastro.this, MainActivity.class));
            }
        });
    }
}