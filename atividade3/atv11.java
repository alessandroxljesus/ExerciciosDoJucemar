import java.util.Scanner;
public class atv11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num,result;

        System.out.println ("Digite um número: ");
        num = ler.nextInt();

        result = num * num;

        System.out.println("A raiz quadrada de " + num + " é " + result);
    }

}
