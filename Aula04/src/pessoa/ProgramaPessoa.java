/*
    criando interface a classe 
    o usuário deverá digitar o nome, idade e o peso da pessoa
    o programa retornará as informações
 */
package pessoa;
import java.text.ChoiceFormat;
import java.util.Scanner;

public class ProgramaPessoa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //instância da classe Pessoa na classe main
        Pessoa p1 = new Pessoa();
        
        //invocação do atributo PÚBLICO da classe pessoa
        System.out.println("Digite o nome");
        p1.nome = ler.nextLine();
        
        //setUser()
        //invocação dos métodos getters e setters que protegem os 
        //dados privados da classe        
        System.out.println("Digite a idade");
        p1.setIdade(ler.nextInt());
        
        System.out.println("Digite o peso");
        p1.setPeso(ler.nextDouble());
        
        //configuração de saída
        System.out.println("Visualizando dados!");
        //buscando a info gravada no atributo público
        System.out.println("Nome: " + p1.nome);
        //bucando a info gravada nos atributos privados;
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Peso: " + p1.getPeso());
        
        
        
        
        
    }
    
}
