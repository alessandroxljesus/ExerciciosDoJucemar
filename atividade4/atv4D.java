import java.util.Scanner;
import java.math.*;
public class atv4D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do retângulo: ");
        double comp = scanner.nextDouble();

        System.out.print("Digite a largura do retângulo: ");
        double larg = scanner.nextDouble();

        double per = 2 * (comp + larg);

        System.out.println("O perímetro do retângulo é: " + per);
    }
}
