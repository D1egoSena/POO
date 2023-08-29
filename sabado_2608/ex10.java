package poo.sabado_2608;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = teclado.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = teclado.nextDouble();

        double soma = valor1 + valor2;

        if (soma > 10) {
            System.out.println("A soma dos valores é maior que 10. Resultado: " + soma);
        }
        else {
            System.out.println("A Soma dos valores é menor que 10");
        }
        teclado.close();
    }
}