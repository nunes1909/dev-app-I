package com.example.qiflix.banco;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class BancoController {
    private SQLiteDatabase db;
    private Banco banco;

    public BancoController(Context context){
        banco = new Banco(context);
    }

    public String insereDado(String nome, String email, String senha) {
        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(Banco.NOME, nome);
        valores.put(Banco.EMAIL, email);
        valores.put(Banco.SENHA, senha);

        resultado = db.insert(Banco.TABELA, null, valores);
        db.close();

        if (resultado == -1){
            return "Erro ao inserir registro";
        }else{
            return "registro inserido com sucesso";
        }


    }
}
