import java.util.Scanner;
public class atv13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int qnt;
        double valor, result;

        System.out.println("Digite a quantidade comprada: ");
        qnt = ler.nextInt();

        System.out.println ("Digite o valor do produto: ");
        valor = ler.nextDouble();

        result = qnt * valor;

        System.out.println("O valor total é: R$" + result);

    }
}
