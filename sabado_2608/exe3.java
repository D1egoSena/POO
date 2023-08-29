package poo.sabado_2608;
import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int menorNumero = Integer.MAX_VALUE;

        for (int i = 1; i <= 50; i++) {
            System.out.print("Digite o " + i + "º número (entre 1 e 100): ");
            int numero = teclado.nextInt();

            if (numero >= 1 && numero <= 100) {
                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            } else {
                System.out.println("Número fora do intervalo. Tente novamente.");
                i--;
            }
        }

        System.out.println("O menor número digitado é: " + menorNumero);

        teclado.close();
    }
}