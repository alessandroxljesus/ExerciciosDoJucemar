import java.util.Scanner;
import java.math.*;
public class atv5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hipotenusa: ");
        double hip = scanner.nextDouble();

        System.out.print("Digite o valor do lado oposto: ");
        double ladoOp = scanner.nextDouble();

        double ladoAd = Math.sqrt(Math.pow(hip, 2) - Math.pow(ladoOp, 2));

        System.out.println("\nO lado adjacente do triângulo retângulo é: " + ladoAd);
    }
}
