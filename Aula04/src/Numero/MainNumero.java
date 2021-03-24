/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numero;
import java.util.Scanner;

public class MainNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Numero n1 = new Numero();
        
        //invocando os métodos acessores
        System.out.println("Digite um número");
        n1.setValor(ler.nextInt());
        
        //invocando o método de verificar
        System.out.println(n1.verificarNumero());
    }
    
}
