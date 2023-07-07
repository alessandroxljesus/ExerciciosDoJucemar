import java.util.Scanner;
public class atv2 {
    public static void main(String[] args) {

        double raio, pi, area;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o raio:");
        raio = ler.nextDouble();

        pi = 3.14;
        area = (pi * (raio * raio));

        System.out.println("Area = " + area);


    }
}
