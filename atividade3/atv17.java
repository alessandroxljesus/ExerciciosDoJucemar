import java.util.Scanner;
public class atv17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valor, result;
        int parcela;

        System.out.println ("Digite o valor: ");
        valor = ler.nextDouble();

        System.out.println ("Digite a quantidade de parcelas desejadas: ");
        parcela = ler.nextInt();

        result= valor/parcela;

        System.out.println ("o valor vai ser de " + result + " por " + parcela + " parcelas");
    }
}
