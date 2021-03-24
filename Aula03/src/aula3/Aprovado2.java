/*
    APROVADO e REPROVADO ... início da O.O.
 */
package aula3;
import java.util.Scanner;

public class Aprovado2 {
    
    public static void main(String[] args) {
        
        String nome;
        double nota1, nota2, nota3;
        
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("Digite o nome do aluno(a)");
        nome = ler.nextLine();
        
        System.out.println("Digite a nota 1 do aluno");
        nota1 = ler.nextDouble();
        
        System.out.println("Digite a nota 2 do aluno");
        nota2 = ler.nextDouble();
        
        System.out.println("Digite a nota 3 do aluno");
        nota3 = ler.nextDouble();
        
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
