import java.math.*;
import java.util.Scanner;

public class atv2EF {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite 1 número: ");
        int num1 = ler.nextInt();

        System.out.println("Digite 2 número: ");
        int num2 = ler.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        System.out.println("O máximo entre " + num1 + " e " + num2 + " é: " + max);
        System.out.println("O mínimo entre " + num1 + " e " + num2 + " é: " + min);
    }

}
