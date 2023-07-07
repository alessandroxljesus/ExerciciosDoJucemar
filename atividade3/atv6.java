import java.util.Scanner;
public class atv6 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int dia;
        double hora, minuto, segundo, hora1, dia1, minuto1, result;

        System.out.println("Digite a quantidade de dias: ");
        dia = ler.nextInt();

        System.out.println("Digite a quantidade de horas: ");
        hora = ler.nextDouble();

        System.out.println("Digite a quantidade de minutos: ");
        minuto = ler.nextDouble();

        System.out.println("Digite a quantidade de segundos: ");
        segundo = ler.nextDouble();

        dia1 = dia * 24 * 60 * 60;
        hora1= hora * 60 * 60;
        minuto1= minuto * 60;
        result = dia1 + hora1 + minuto1 + segundo;

        System.out.println("Quantidade de segundos: " + result);


    }
}
