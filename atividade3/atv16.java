import java.util.Scanner;
public class atv16 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double valorproduto, result, result2;
        int porc;

        System.out.println("Digite o valor do produto:");
        valorproduto = ler.nextDouble();

        System.out.println("Digite a porcentagem do desconto: ");
        porc = ler.nextInt();

        result = (valorproduto/100) * porc;
        result2 = valorproduto - result;

        System.out.println("Valor do Acréscimo " + result2);
    }
}
