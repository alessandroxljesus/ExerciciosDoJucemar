import java.util.Scanner;
public class atv7 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double num1, num2, result;

        System.out.println("Digite o 1° número: ");
        num1 = ler.nextDouble();

        System.out.println("Digite o 2° número: ");
        num2 = ler.nextDouble();

        result = num1 * num2;

        System.out.println( "O resultado é: " + result);
    }
}
