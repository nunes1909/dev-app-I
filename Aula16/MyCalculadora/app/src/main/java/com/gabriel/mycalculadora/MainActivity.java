package com.gabriel.mycalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    EditText txtValor1, txtValor2;
    Button btnSoma, btnSub, btnMult, btnDiv;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mapeamento dos objetos na classe R
        txtValor1 = findViewById(R.id.txtValor1);
        txtValor2 = findViewById(R.id.txtValor2);
        btnSoma = findViewById(R.id.btnSoma);
        btnSub = findViewById(R.id.btnSub);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);
        txtResultado = findViewById(R.id.txtResultado);

        // configurações da logica do app, dos listener + eventos
        // feito automaticamente
        // parseInt serve pra transformar um texto em numero inteiro
        // toString serve apenas pra confirmar que é uma String que ele vai ler
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // declaração das variaveis que armazenarao os valores digitados
                int v1 = Integer.parseInt(txtValor1.getText().toString());
                int v2 = Integer.parseInt(txtValor2.getText().toString());
                int resultado = v1 + v2;

                // aqui jogamos o resultado da operação feita com as variáveis v1 e v2
                txtResultado.setText(resultado + "");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // declaração das variaveis que armazenarao os valores digitados
                int v1 = Integer.parseInt(txtValor1.getText().toString());
                int v2 = Integer.parseInt(txtValor2.getText().toString());
                int resultado = v1 - v2;

                // aqui jogamos o resultado da operação feita com as variáveis v1 e v2
                txtResultado.setText(resultado + "");
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // declaração das variaveis que armazenarao os valores digitados
                int v1 = Integer.parseInt(txtValor1.getText().toString());
                int v2 = Integer.parseInt(txtValor2.getText().toString());
                int resultado = v1 * v2;

                // aqui jogamos o resultado da operação feita com as variáveis v1 e v2
                txtResultado.setText(resultado + "");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // declaração das variaveis que armazenarao os valores digitados
                int v1 = Integer.parseInt(txtValor1.getText().toString());
                int v2 = Integer.parseInt(txtValor2.getText().toString());
                int resultado;

                try {
                    resultado = v1 / v2;
                }catch (Exception e){
                    resultado = 0;
                }

                // aqui jogamos o resultado da operação feita com as variáveis v1 e v2
                txtResultado.setText(resultado + "");
            }
        });




    }
}