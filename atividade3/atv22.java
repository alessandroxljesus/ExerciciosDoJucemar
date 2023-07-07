import java.util.Scanner;
public class atv22 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num1, num2, result;

        System.out.println("Digite 1 numero: ");
        num1 = ler.nextInt();

        System.out.println("Digite 2 numero: ");
        num2 = ler.nextInt();

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }

        System.out.println("\nMaior número: " + result);
    }
}
