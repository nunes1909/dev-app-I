/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;
import java.util.Scanner;

public class Aprovado {
    String nome;
    double nota1, nota2, nota3;    
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Digite o nome do aluno(a)");
        String nome = ler.nextLine();
        
        System.out.println("Digite a nota 1 do aluno");
        double nota1 = ler.nextDouble();
        
        System.out.println("Digite a nota 2 do aluno");
        double nota2 = ler.nextDouble();
        
        System.out.println("Digite a nota 3 do aluno");
        double nota3 = ler.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        //condicionais
        if(media >= 6)
        {
            System.out.println("O aluno está APROVADO");        
        }
        else
        {
            System.out.println("O aluno está REPROVADO");
        }
    }
    
}
