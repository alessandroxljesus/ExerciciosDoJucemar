import java.util.Scanner;
public class atv10 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int diasalu;
        double valordia, totalalu;

        System.out.println("Digite quantidade de dias que o carro foi alugado: ");
        diasalu = ler.nextInt();

        System.out.println("Digite valor da diária: ");
        valordia = ler.nextDouble();

        totalalu = diasalu * valordia;

        System.out.println(totalalu);

    }
}