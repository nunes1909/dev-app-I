/*
    Criar métodos
 */
package pessoa;

public class Pessoa {
    //atributos da classe
    public String nome;
    private int idade;
    private double peso;
    
    
    //métodos da classe
    //método set responsável por "gravar" o dado do atributo
    //método que não tem retorno pq recebe o que foi digitado
    public void setIdade(int idade){
        this.idade = idade;
    }    
    //método get, para obter o dado gravado
    //método com retorno, pois "exibe" o qe foi digitado
    public int getIdade(){
        return idade;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }
    
    }
  
