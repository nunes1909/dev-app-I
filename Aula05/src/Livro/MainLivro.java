/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Livro;
import java.util.Scanner;

public class MainLivro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Livro l1 = new Livro();
        
        System.out.println("Digite o titulo:");
        l1.titulo = ler.nextLine();
        
        System.out.println("Digite o autor:");
        l1.autor = ler.nextLine();
        
        System.out.println("Digite o gênero:");
        l1.setGenero(ler.nextLine());
        
        System.out.println("Digite o ano:");
        l1.setAno(ler.nextInt());
        
        System.out.println("Digite o preço:");
        l1.setPreco(ler.nextDouble());
        
        System.out.println(l1 + "\n");
        System.out.println("******TOTAL******");
        System.out.println("R$" + ( l1.getPreco() - l1.verificarPreco() ));
        
    }
    
}
