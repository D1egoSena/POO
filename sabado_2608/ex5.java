package poo.sabado_2608;
import java.util.Scanner;

public class ex5 {

	public static void main (String args[]) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe um número : ");
		
		int valor1 = teclado.nextInt();

		System.out.println("Informe outro número : ");

		int valor2 = teclado.nextInt();

		if (valor1 > valor2) {

			System.out.println("O número maior é o " + valor1);

		}
		else if (valor2 > valor1) {

			System.out.println("O número maior é o " + valor2);

		}
		else {

			System.out.println("O dois números são iguais");

		}
		teclado.close();
	}
}