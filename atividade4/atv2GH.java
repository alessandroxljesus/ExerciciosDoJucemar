import java.math.*;
public class atv2GH {
    public static void main(String[] args) {
        double anguloRad = Math.PI / 4.0; // 45 graus em radianos

        double sen = Math.sin(anguloRad);
        double cos = Math.cos(anguloRad);

        System.out.println("O seno de " + anguloRad + " radianos é: " + sen);
        System.out.println("O cosseno de " + anguloRad + " radianos é: " + cos);
    }
}

