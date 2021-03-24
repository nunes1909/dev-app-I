package escolha;
import java.util.Scanner;

public class Escolha {

    public static void main(String[] args) {        
        Scanner ler = new Scanner(System.in);
        int num;
        
        System.out.println("Entre com um número entre 1 e 4:");
        num = ler.nextInt();
        
        //condicional Switch
        switch (num) {
            case 1: 
                System.out.println("Você escolheu 1");
                break;
                
            case 2:
                System.out.println("Você escolheu o 2");
                break;
                
            case 3:
                System.out.println("Você escolheu o 3");
                break;
                
            case 4:
                System.out.println("Você escolheu o 4");
                break;
                
            default:
                System.out.println("Número inválido");
        }
        
        
        
        
    }
    
}
