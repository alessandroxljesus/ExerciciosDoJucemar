import java.util.Scanner;
public class atv18 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int idade, ano, anonasc;

        System.out.println("Digite sua idade:");
        idade = ler.nextInt();

        System.out.println("Digite ano em que estamos: \n");
        ano =ler.nextInt();

        anonasc = ano - idade;

        System.out.println(anonasc);
    }
}
