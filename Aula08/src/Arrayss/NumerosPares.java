// Array 
package Arrayss;

// importação da classe array        
import java.util.Arrays;
        
public class NumerosPares {

    public static void main(String[] args) {
        
        // declaração do array com valores atribuidos
        // nome do array -- pares
        // comprimento do array é 12
        // indice do array é 11
        
        int [] pares = {2,4,6,8,10,12,14,16,18,20,22,24};
        
        // array com texto do tipo String
        String [] nomes = {"Ana", "Bia", "José", "Carlo"};
        
        System.out.println("Estes são os numeros pares do Array: ");
        for(int i = 0; i < 12; i++){
            System.out.println( pares[i] ); 
        }
        
        // usando metodo toString para exibir os valores do array como array
        
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(nomes));
        
        String num = "leopoldo";
        // atributo length exibe o comprimento o array
        System.out.println("O Array contém " + pares.length + " elementos");
        System.out.println("O Array contém " + nomes.length + " elementos");
        
        
            
        }
        
}
    

