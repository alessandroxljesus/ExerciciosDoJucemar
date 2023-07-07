import java.util.Scanner;
import java.math.*;
public class atv4E {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o valor da altura do triângulo: ");
        double alt = scanner.nextDouble();

        double area = (base * alt) / 2;

        System.out.println("A área do triângulo é: " + area);
    }
}
