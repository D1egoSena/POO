package poo.sabado_2608;
import java.util.Scanner;

public class ex6{

    public static void main (String args[]) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a nota da primeira prova: ");
		
		float prova1 = teclado.nextInt();

        System.out.println("Digite a nota da segunda prova: ");
		
		float prova2 = teclado.nextInt();

        System.out.println("Digite a nota do trabalho: ");
		
		float trabalho = teclado.nextInt();

        float media = ((prova1 + prova2 + trabalho) / 3);

        if (media >= 7) {

            System.out.println("Aprovado");

        }
        else {

            System.out.println("Reprovado");

        }

        teclado.close();
    }
}