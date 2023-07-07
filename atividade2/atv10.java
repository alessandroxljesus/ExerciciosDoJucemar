//IVAN (252) E LUCAS(253)
import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {

        int numA, numB, numX;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o A número: ");
        numA = ler.nextInt();

        System.out.println("Digite o B número: ");
        numB = ler.nextInt();

        numX = numA;
        numA = numB;
        numB = numX;

        System.out.println("número A: " + numA );
        System.out.println("número B: " + numB );






    }
}
