import java.util.Scanner;
public class atv12 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double valorproduto, result, result2;

        System.out.println("Digite o valor do produto:");
        valorproduto = ler.nextDouble();

        result = (valorproduto/100) * 15;

        System.out.println("Valor do Acréscimo " + result);
    }
}