
package AtividadeAula04;
import java.util.Scanner;

public class MainCliente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cliente c1 = new Cliente();
        
        
        //invocação do métodos acessores - SET
        System.out.println("Nome do cliente: ");
        c1.setNome(ler.nextLine());
        
        System.out.println("Digite a idade: ");
        c1.setIdade(ler.nextInt());
        
        System.out.println("Digite a renda: ");
        c1.setRenda(ler.nextDouble());
        
        //visualização dos dados digitados
        //invocação dos métodos acessores - GET        
        System.out.println("**********");
        System.out.println("SAÍDA DE DADOS");
        System.out.println("**********");
        //invocando os getters
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Idade: " + c1.getIdade() + " / " + c1.calcularIdade() );
        System.out.println("Renda: " + c1.getRenda() + " / " + c1.calcularRenda() );
        
        
        
    }
    
}
