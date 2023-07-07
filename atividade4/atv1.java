import java.util.Scanner;
import java.math.*;

    public class atv1 {
        public static void main(String[] args)
        {
            double x1, x2, y1, y2;
            double formula1, formula2, raizqua;

            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o valor de X1: ");
            x1 = ler.nextDouble();

            System.out.println("Digite o valor de X2: ");
            x2 = ler.nextDouble();

            System.out.println("Digite o valor de Y1: ");
            y1 = ler.nextDouble();

            System.out.println("Digite o valor de Y2: ");
            y2 = ler.nextDouble();

            formula1 = Math.pow(x2 - x1,2 );
            formula2 = Math.pow(y2 - y1,2 );
            raizqua = Math.sqrt(formula1 + formula2);

            System.out.println("O resultado da equação foi: " + raizqua);
        }
}
