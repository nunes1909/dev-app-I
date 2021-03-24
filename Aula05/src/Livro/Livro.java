/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Livro;
public class Livro {
    
    //DECLARAÇÃO DOS ATRIBUTOS
    String titulo, autor;
    private String genero;
    private int ano;
    private double preco;
    
    //MÉTODO CONSTRUTOR
    public Livro(String titulo, String autor, String genero, int ano, double preco){
    this.titulo = titulo;
    this.autor = autor;
    this. genero = genero;
    this.ano = ano;
    this.preco = preco;
    }
    
    public Livro(){
    
    }
    
    //MÉTODOS ACESSORES

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }   
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }
    
    public Double verificarPreco(){       
        if(preco > 80){
            preco = preco * 0.2;
        }else{
            preco = preco;
        }
        return preco;
    }
    
    public String toString(){
        return 
                "******DADOS DO LIVRO******" + "\n"
                + "Título: " + this.titulo + "\n" 
                + "Autor: " + this.autor  + "\n"
                + "Gênero: " + this.genero + "\n"
                + "Ano: " + this.ano + "\n"
                + "Preço: R$" + this.preco; 
    }
    
    
}
