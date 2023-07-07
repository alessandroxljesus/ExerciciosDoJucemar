import java.util.Scanner;
import java.math.*;
public class atv4C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do cateto 1: ");
        double cat1 = scanner.nextDouble();

        System.out.print("Digite o valor do cateto 2: ");
        double cat2 = scanner.nextDouble();

        double hipo = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));

        System.out.println("A hipotenusa do triângulo retângulo é: " + hipo);
    }
}
