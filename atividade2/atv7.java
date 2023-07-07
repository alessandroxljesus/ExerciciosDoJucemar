//IVAN (252) E LUCAS(253)
import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        
        String nome;
        int idade;
        String cidade;
        
        Scanner ler = new Scanner(System.in);

        System.out.println("\nDigite seu Nome: ");
            nome = ler.nextLine();
        
        System.out.println("\nDigite sua Idade: ");
            idade = ler.nextInt();
        
        System.out.println("\nDigite a Cidade onde você mora: ");
            cidade = ler.next();

        System.out.println("\nSeu nome é " + nome + "; \nVocê tem " + idade + " anos; \nE mora em " + cidade);

    }
}