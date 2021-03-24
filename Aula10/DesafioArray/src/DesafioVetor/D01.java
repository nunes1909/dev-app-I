package Desafio;
import java.util.Scanner;
import java.util.ArrayList;
public class D01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList <Integer> numeros = new ArrayList <>();
        int num, soma = 0, cont = 1, rep = 0;
        
        System.out.println("===Digite 0 para parar a execução===");
        
        do{
            System.out.println("=======Digite um número========");
            num = ler.nextInt();
            numeros.add(num);
            
            soma += num;
        }while(num > 0);
        
        System.out.println("A soma dos valores é: " + soma);
        
                
        
        
    }
    
}
