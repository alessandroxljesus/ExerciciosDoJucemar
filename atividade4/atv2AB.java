import java.util.Scanner;
import java.math.*;

public class atv2AB {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        double arredondaCima, arredondaBaixo, FormulaCima, FormulaBaixo;

        System.out.println("Digite o valor do número que vai ser arredondado para cima: ");
        arredondaCima = input.nextDouble();
        System.out.println("Digite o valor do número que vai ser arredondado para baixo: ");
        arredondaBaixo = input.nextDouble();

        FormulaCima = Math.ceil(arredondaCima);
        FormulaBaixo = Math.floor(arredondaBaixo);

        System.out.println("O valor do número arredondado para cima foi: " + FormulaCima);
        System.out.println("O valor do número arredondado para baixo foi: " + FormulaBaixo);

    }
}
