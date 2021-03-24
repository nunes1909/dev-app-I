/*
Faça um programa de consulta que leia nomes de pessoas, 
sendo a quantidade determinada pelo usuário. Logo após a entrada 
pergunte ao usuário o número do nome que ele gostaria de consultar. 

Após sua resposta, exiba o nome e o telefone. Chame atenção do usuário em caso 
de uma consulta inválida, ou seja, com números menores ou iguais a zero, 
ou maiores do que a quantidade cadastrado - Usuário Inválido
----> Trocar um dos Array por ArrayList
----> Trocar um laço de repetição for para while
 */

package lacos_Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 { 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);        
        int i, x = 0;
        String nomes;
        
        System.out.println("Quantas pessoas serão cadastradas?");
        i = ler.nextInt();
        int [] tel = new int [i];
        //String []nome = new String [i];
        ArrayList <String> nome = new ArrayList<>();
        
        while(x < i){
            System.out.println("cadastre a pessoa número "+(1 + x));
            nomes = ler.next();
            nome.add(nomes);
            System.out.println("Cadastre o telefone da pessoa número "+(1 + x));
            tel [x] = ler.nextInt();
            x++;
        }
        
        // buscando o cliente cadastrado
        String  buscadenome;
        System.out.println("Digite o nome do cliente.");
        buscadenome = ler.next();
        
        boolean semcadastro = true;
        for (int j = 0; j < i; j ++){
            if (buscadenome. equals (nome.get(j))){
                System.out.println(nome.get(j));
                System.out.println(tel [j]);
                semcadastro = false;
            }
        }
        
        if (!semcadastro){ 
        } else {
            System.out.println("Nome não cadastrado");
        }
    }
}
