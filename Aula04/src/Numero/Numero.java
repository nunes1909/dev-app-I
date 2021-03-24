/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numero;

public class Numero {
    //atributo privado
    
    private int valor;
    
    //métodos acessores
    //get é obter e tem retorno
    public int getValor() {
        return valor;
    }
    //set é gravar é sem retorno
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    //método para verificar se o número que foi digitado 
    //é positivo ou negativo
    public String verificarNumero()
    {
        String resposta;
        
        if(this.valor >= 0){
            resposta = "Este número é POSITIVO";
        }else{
            resposta = "Este número é NEGATIVO";
        }
        
        return resposta;
    }
    
    
}
