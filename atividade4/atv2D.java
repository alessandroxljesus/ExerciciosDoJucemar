import java.math.*;
import java.util.Scanner;

public class atv2D {

    public static void main(String[] args) {

        double num, valorabs;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = input.nextDouble();

        valorabs = Math.abs(num);

        System.out.println(" O RESULTADO FOI: " + valorabs);

    }
}
