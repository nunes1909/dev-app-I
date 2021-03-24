/*
Classificar um ArrayList por nome
*/

package lacos_Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ListaPessoas {

    public static void main(String[] args) {
        ArrayList <String> alunos = new ArrayList<>();
        alunos.add("Marcela");
        alunos.add("Ana");
        alunos.add("Beto");
        alunos.add("Tonho");
        alunos.add("Zé");
        System.out.println("A lista de alunos é: " + alunos);
        
        // ordem alfabética
        Collections.sort(alunos);
        System.out.println("A lista de alunos é: " + alunos);
        
        System.out.println("O Array possui: " + alunos.size() + " elementos");
        System.out.println("O índice 04 possui o elemento: " + alunos.get(4));
        
    }
    
}
