package poo.sabado_2608;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();
        
        if (idade > 18) {
            System.out.println("Você pode tirar a carteira de motorista.");
        } 
        else {
            System.out.println("Você ainda não pode tirar a carteira de motorista.");
        }
        
        teclado.close();
    }
}