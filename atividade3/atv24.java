import java.util.Scanner;
public class atv24 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num, i, result;

        System.out.println("Digite um numero: ");
        num = ler.nextInt();

        for (i=1; i <= 10; i++){
            result = num * i;
            System.out.println(num + "x" + i + "=" + result);
        }

    }
}
