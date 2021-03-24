package N1Ex11;

import java.util.Scanner;

public class Animal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cachorro ca = new Cachorro();
        Papagaio pa = new Papagaio();
        Mosca mo = new Mosca();
        
        
        // ENTRADA DE DADOS        
        System.out.println("Digite uma cor do cachorro: ");
        ca.setCorPelo(ler.nextLine());
        
        System.out.println("Digite uma cor da pena do Papagaio: ");
        pa.setCorPena(ler.nextLine());
        
        System.out.println("Digite quantas patas tem a mosca: ");
        mo.setQtdPatas(ler.nextInt());
        
        // SAÍDA DE DADOS
        System.out.println(ca);
        System.out.println(pa);
        System.out.println(mo);
        
    }
    
}
