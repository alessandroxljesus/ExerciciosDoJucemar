import java.util.Scanner;
public class atv9 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double litro, valor, result;

        System.out.println ("Digite a quantidade de litros: ");
        litro = ler.nextDouble();
        System.out.println ("Digite o valor do litro: ");
        valor = ler.nextDouble();

        result= litro * valor;

        System.out.println ("o valor total é: R$" + result);
    }

}
