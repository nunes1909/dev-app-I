// Array List

package ArraysLista;

import java.util.ArrayList;

public class ListaCores {

    public static void main(String[] args) {
        ArrayList <String> cores = new ArrayList<String>();
        cores.add("Branco");
        cores.add("Cinza");
        cores.add("Preto");
        cores.add("Vermelho");
        cores.add("Amarelo");
        cores.add("Verde");
        cores.add("Laranja");
        
        // impressao arraylist
        System.out.println("O array é: " + cores);
        System.out.println("========================");
        
        // consultando um índice
        System.out.println("O índice 4 contém: " + cores.get(4));
        System.out.println("========================");
        
        // mudando conteudo do índice
        cores.set(4, "Roxo");
        System.out.println("O índice 4 contém agora: " + cores.get(4));
        System.out.println("========================");
        System.out.println("O array agora é: " + cores);
        System.out.println("========================");
        
        // metodo size() verifica o tamanho do arraylist
        System.out.println("O tamanho do arraylist é: " + cores.size());
        System.out.println("========================");
        
        // removendo um índice
        System.out.println("Removendo o índice 1: " + cores.remove(1));
        System.out.println("========================");
        System.out.println("O array agora é: " + cores);
        System.out.println("========================");
        System.out.println("O tamanho do arraylist agora é: " + cores.size());
        System.out.println("========================");
        
        // limpando o indice inteiro
        cores.clear();
        System.out.println("O array agora é: " + cores);
    }
    
}
