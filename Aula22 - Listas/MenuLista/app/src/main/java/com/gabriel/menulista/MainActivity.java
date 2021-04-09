package com.gabriel.menulista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // 1º ETAPA: Declarar as variaveis e construção do Array
    private ListView lvLista;
    private String[] itens = {"HTML 5", "CSS", "SASS", "JS", "NODE JS", "ANGULAR JS", "RUBY", "REACT"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2º ETAPA: Mapeamento da lista
        lvLista = findViewById(R.id.lvLista);

        /*
        * 3º ETAPA: Criar um adaptador para servir
        * de ligação entre o Array e o elemento e o ListView no xml
        * "O adaptador vem do atributo ArrayAdapter"
        * */

        /*
        * android.R.layout.simple_list_item_1 -> Define o tipo da lista, neste caso, uma lista simples (item_1)
        * android.R.id.text1 -> Mapeamento que define os tipos de valores da lista
        * */
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, itens);

        // 4º ETAPA: Adicionar o adapter para a lista criada no Array
        lvLista.setAdapter(adapter);

        // 5º ETAPA: Print na tela em Toast indicando qual o item que foi clicado
        // Eventos: setOnItemClick e onItemClick
        lvLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(MainActivity.this, itens[i], Toast.LENGTH_SHORT).show();

                switch (i){
                    case 0:
                        abrirHTML();
                        break;
                }
            }
        });

    }

    private void abrirHTML(){
        Intent janelaHTML = new Intent(MainActivity.this, MainHTML.class);
        startActivity(janelaHTML);
    }
}