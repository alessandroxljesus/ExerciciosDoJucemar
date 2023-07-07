import java.math.*;
import java.util.Scanner;
public class atv3BCD {
    public static void main(String[] args) {
        double valor ;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = ler.nextDouble();


        double arcoSen = Math.asin(valor);
        double arcoCos = Math.acos(valor);
        double arcoTan = Math.atan(valor);

        System.out.println("O arco seno de " + valor + " é: " + arcoSen);
        System.out.println("O arco cosseno de " + valor + " é: " + arcoCos);
        System.out.println("O arco tangente de " + valor + " é: " + arcoTan);
    }
}
