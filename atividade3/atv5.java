import java.util.Scanner;
public class atv5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double qntddehrs, valorporhr, salariodiario;

        System.out.println("Digite quantidades de horas trabalhados por um dia: ");
        qntddehrs = ler.nextDouble();

        System.out.println("Digite valor ganho por hora: ");
        valorporhr = ler. nextDouble();

        salariodiario = qntddehrs * valorporhr;

        System.out.println("Valor ganho por dia: " + salariodiario);
    }
}
