import java.math.*;
import java.util.Scanner;
public class atv3E {
    public static void main(String[] args) {
        double valor;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = ler.nextDouble();

        double logaritmo = Math.log(valor);

        System.out.println("O logaritmo natural de " + valor + " é: " + logaritmo);
    }
}
