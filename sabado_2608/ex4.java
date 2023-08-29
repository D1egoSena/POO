package poo.sabado_2608;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a temperatura do corpo: ");
        double temperatura = teclado.nextDouble();

        if (temperatura > 37.0) {
            System.out.println("O paciente está com febre.");
        } else {
            System.out.println("A temperatura do paciente está normal.");
        }

        teclado.close();
    }
}