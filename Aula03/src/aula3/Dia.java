
package aula3;
import java.util.Scanner;

public class Dia {
    double hora;
    static Scanner ler = new Scanner(System.in);
        
    public static void main(String[] agrs)
    {           
        System.out.println("Que horas são?");
        double hora = ler.nextDouble();
        
        if( hora <= 12)
        {
            System.out.println("Bom dia");
        }
        else if (hora > 12 && hora <= 18)
        {
            System.out.println("boa tarde");
        }
        else
        {
            System.out.println("Boa noite");
        }
    }
    
}
