package poo.sabado_2608;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o peso (em kg): ");
        double peso = teclado.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = teclado.nextDouble();

        double imc = peso / (altura * altura);

        if (imc > 30.0) {
            System.out.println("O usuário está obeso.");
        } 
        else {
            System.out.println("O usuário não está obeso.");
        }

        teclado.close();
    }
}