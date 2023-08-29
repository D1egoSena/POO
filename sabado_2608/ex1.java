package poo.sabado_2608;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = teclado.nextDouble();
        
        double salarioHora = 20.0;
        double salarioTotal = horasTrabalhadas * salarioHora;
        
        System.out.println("O salário do operário é: R$ " + salarioTotal);
        
        teclado.close();
    }
}
