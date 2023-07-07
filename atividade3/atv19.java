import java.util.Scanner;
public class atv19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int meses, idade, result;

        System.out.println ("Digite sua idade: ");
        idade = ler.nextInt();

        System.out.println("Digite quantos meses faz que você fez aniversario pela ultima vez: ");
        meses = ler.nextInt();

        idade = idade * 12;
        result = (idade + meses) * 30;

        System.out.println("você viveu aproximandamente " + result + " dias");


    }
}
