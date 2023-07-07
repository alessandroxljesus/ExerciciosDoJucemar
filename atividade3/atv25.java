import java.util.Scanner;
//4,79
public class atv25 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double real, dolar, result;

        System.out.println("Digite valor em dólar: ");
        dolar = ler.nextDouble();

        real = 4.79;
        result = dolar * real;

        System.out.println("Valor em real: " + result);


    }
}
