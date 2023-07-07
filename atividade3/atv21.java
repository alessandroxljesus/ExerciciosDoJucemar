import java.util.Scanner;
public class atv21 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double alt, result;
        double peso;

        System.out.println ("Digite seu peso: ");
        peso = ler.nextDouble();

        System.out.println ("Digite sua altura: ");
        alt = ler.nextDouble();

        result= peso/ (alt * alt);
        System.out.println( "Seu IMC é: " + result);
    }
}
