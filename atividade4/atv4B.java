import java.util.Scanner;
import java.math.*;
public class atv4B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double circunferencia = 2 * Math.PI * raio;

        System.out.println("A circunferência do círculo é: " + circunferencia);
    }
}
