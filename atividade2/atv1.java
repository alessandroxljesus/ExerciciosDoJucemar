//IVAN(252) E LUCAS(253)

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        
        String nome, cidade;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("\nDigite o seu Nome: ");
        nome = ler.nextLine();

        System.out.println("\nDigite o nome de sua Cidade: ");
        cidade = ler.nextLine();

        System.out.println("\nOlá " + nome + ", você mora em " + cidade);

    }
}