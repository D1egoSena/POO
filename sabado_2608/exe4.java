package poo.sabado_2608;
import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor;

        while (true) {
            System.out.print("Digite um valor numérico entre 0 e 5 (digite 0 para sair): ");
            valor = teclado.nextInt();

            if (valor == 0) {
                System.out.println("Saindo do Algoritmo...");
                break;
            } 
            else if (valor == 1) {
                System.out.println("Um");
            } 
            else if (valor == 2) {
                System.out.println("Dois");
            } 
            else if (valor == 3) {
                System.out.println("Três");
            } 
            else if (valor == 4) {
                System.out.println("Quatro");
            } 
            else if (valor == 5) {
                System.out.println("Cinco");
            } 
            else {
                System.out.println("Valor fora do intervalo. Tente novamente.");
            }
        }
        teclado.close();
    }
}
