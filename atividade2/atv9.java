//IVAN (252) E LUCAS(253)
import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {

        String nome, rua, cidade, estado;
        int cep, numero;
        String cpf,telefone;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite o seu endereço (Rua, Número, CEP):");
        System.out.print("RUA: ");
        rua = scanner.nextLine();
        System.out.print("NÚMERO: ");
        numero = scanner.nextInt();
        System.out.print("CEP: ");
        cep = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a sua cidade: ");
        cidade = scanner.nextLine();

        System.out.print("Digite o seu estado: ");
        estado = scanner.nextLine();

        System.out.print("Digite o seu CPF: ");
        cpf = scanner.nextLine();

        System.out.print("Digite o seu telefone celular: ");
        telefone = scanner.nextLine();

        System.out.println("***********************************");
        System.out.println("Nome .......: " + nome);
        System.out.println("Endereço ...: RUA " + rua + ", NUMERO: " + numero + ", CEP: " + cep);
        System.out.println("Cidade......: " + cidade);
        System.out.println("Estado......: " + estado);
        System.out.println("CPF.........: " + cpf);
        System.out.println("Tel. Celular: " + telefone);
    }
}