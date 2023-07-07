//IVAN(252) E LUCAS(253)

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        
        String nome;
        
        Scanner ler = new Scanner(System.in);

        System.out.println("\nDigite o seu Nome: ");
        nome = ler.nextLine().toUpperCase();

        System.out.println("\n - + - = SEJA BEM-VINDO = - + - \n");
        System.out.println(nome);

    }
}