import java.util.Scanner;
public class atv3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Digite a base: ");
        base = ler.nextDouble();
        System.out.println("Digite a altura: ");
        altura = ler.nextDouble();

        area = ((base * altura) / 2);

        System.out.println("\n" + area);


    }
}
