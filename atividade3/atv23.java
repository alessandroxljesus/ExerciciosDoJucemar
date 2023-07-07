import java.util.Scanner;
import java.math.*;
public class atv23 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num1 ;
        int num2 ;

        System.out.println("Digite 1 numero: ");
        num1 = ler.nextInt();

        System.out.println("Digite 2 numero: ");
        num2 = ler.nextInt();

        double raiz1 = Math.sqrt(num1);
        double raiz2 = Math.sqrt(num2);

        double potencia1 = Math.pow(num1, 2);
        double potencia2 = Math.pow(num2, 3);

        System.out.println("Raiz quadrada de " + num1 + " é: " + raiz1);
        System.out.println("Raiz quadrada de " + num2 + " é: " + raiz2);
        System.out.println(num1 + " elevado ao quadrado é: " + potencia1);
        System.out.println(num2 + " elevado ao cubo é: " + potencia2);
    }
}

