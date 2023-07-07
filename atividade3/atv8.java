import java.util.Scanner;
public class atv8 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double valorproduto, result, result2;

        System.out.println("Digite o valor do produto:");
        valorproduto = ler.nextDouble();

      result = (valorproduto/100) * 10;
      result2 = valorproduto - result;

        System.out.println(result2);
    }
}
