import java.util.Scanner;
public class atv4 {
    public static void main(String[] args) {

        double graus, fahrenheit;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        graus = ler.nextDouble();

        fahrenheit = (graus * 1.8 + 32);

        System.out.println("a temperatura em fahrenheit é " + fahrenheit);

    }
}
