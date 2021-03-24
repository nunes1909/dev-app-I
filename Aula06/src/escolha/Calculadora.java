
package escolha;
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        //permite números decimais e a escolha da quandiade de casas decimais
        float num1, num2;
        //atributo char vem de caracter digitado
        char operacao;
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma operação [+ - * /]");
        //Método charAt(), trata o dado inserido como se fosse ser lido numa
        //sequência estabelecida. Após a leitura odo char escolhido, o método
        //retorna ao índice
        operacao = ler.nextLine().charAt(0);
        
        System.out.println("Entre com o primeiro nº: ");
        num1 = ler.nextFloat();
        
        System.out.println("Entre com o segundo nº: ");
        num2 = ler.nextFloat();
        
        System.out.println("*******************************");
        /*
            INICIANDO O SWITCH CASE
            > % > recebe o valor digitado 
            > .2f > indica que o programa irá mostrar a o número, a vírgula e 
            2 casas decimais
        */
        
        switch(operacao)
        {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1 + num2);
                break;
                
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1 + num2);
                break;
                
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, num1 + num2);
                break;
                
            case '/':
                System.out.printf("%.2f / %.2f = %.2f", num1, num2, num1 + num2);
                break;
                
            default:
                System.out.println("Você digitou uma operação inválida!");
        }
        
    }
    
}
