import java.util.Scanner;
import java.math.*;

public class atv20 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double ladoqua, area;

        System.out.println("Digite um lado do quadrado: ");
        ladoqua = ler.nextInt();

        area = Math.pow(ladoqua, 2);

        System.out.println("Resultado: " + area);
    }

}