package poo.sabado_2608;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do raio da circunferência: ");
        double raio = teclado.nextDouble();

        double pi = Math.PI;
        double area = pi * (raio * raio);

        System.out.println("A área da circunferência é: " + area);

        teclado.close();
    }
}