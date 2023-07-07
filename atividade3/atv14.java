import java.util.Scanner;
import java.math.*;

public class atv14 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double numero, formula;

        System.out.println("Digite um numero: ");
        numero = ler.nextInt();

        formula = Math.pow(numero, 3);

        System.out.println("Resultado: " + formula);
    }

}
