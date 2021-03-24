/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;
import java.util.Scanner;

public class NotaFinal {
    
    String nome;
    double media;
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[]args)
    {
        System.out.println("Digite o do aluno: ");
        String nome = ler.nextLine();
        
        System.out.println("Digite a média do aluno: ");
        double media = ler.nextDouble();
        
        //teste lógico simples
        //se a média for maior ou igual a 6
        
        if(media >= 6)
        {
            System.out.println("O aluno " + nome + " foi APROVADO");
        }else
        {
            System.out.println("O aluno " + nome + " foi REPROVADO");
        }
        
    }
}
