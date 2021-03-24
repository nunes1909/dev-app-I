
package Desafio;

import java.util.Scanner;
import java.util.Arrays;

public class D02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetorN = new int[20];
        int par = 0, impar = 0;
        
        for (int i = 0; i < 20; i++) {
            vetorN[i] = i+1;
            
            if(vetorN[i] %2 != 0){
                impar++;
            }else{
                par++;
            }
        }
        
        System.out.println("O vetor possui: " + par + " números pares.");
        System.out.println("O vetor possui: " + impar + " números ímpares.");
    }
        
    
    
}
