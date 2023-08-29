package poo.sabado_2608;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = teclado.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = teclado.nextDouble();

        double soma = valor1 + valor2;
        double resultadoFinal;

        if (soma >= 10) {
            resultadoFinal = soma + 5;
        } 
        else {
            resultadoFinal = soma - 7;
        }

        System.out.println("Resultado final: " + resultadoFinal);

        teclado.close();
    }
}