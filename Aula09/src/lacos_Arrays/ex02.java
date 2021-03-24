/*
 * Crie um programa em Java que solicite quantas pessoas deseja cadastrar, 
leia este conjunto de nomes de pessoas. Exiba-os em ordem alfabética  e crescente.
-----> Trocar o Array por ArrayList sendo este gravado pelo Scanner

*/
package lacos_Arrays;
import java.util.Scanner; 
public class ex02 { 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);       
        int i = 0, j = 0, quant = 0;
        String[] num1;
        String aux;
 
        System.out.print("Entre com a quantidade de pesoas a serem cadastradas: ");
        quant = ler.nextInt();
        num1 = new String [quant]; 
            for (i = 0; i <= quant - 1; i++){
                System.out.print("Entre com o nome da "+ (i + 1) +"ª pessoa: ");
                num1[i] = ler.next();
            } 
            for (i = 0; i <= quant - 2; i++){
                for (j = i + 1; j <= quant - 1; j++){
                    if( num1[j].compareTo(num1[i]) < 0){
                        aux = num1[j];
                        num1[j] = num1[i];
                        num1[i] = aux;
                    }
                }
            } 
            System.out.println("A ordem correta é: "); 
            for (i = 0; i <= quant - 1; i++){
                System.out.print(num1 [i]);
                if (i < quant - 1)
                    System.out.print(", ");
                else
                    System.out.print(".");
            } 
    } 
}
