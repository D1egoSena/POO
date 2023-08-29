package poo.sabado_2608;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da hora/aula: ");
        double valorHoraAula = teclado.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = teclado.nextInt();

        System.out.print("Digite o percentual de desconto do INSS (%): ");
        double percentualDescontoINSS = teclado.nextDouble();

        double salarioBruto = valorHoraAula * horasTrabalhadas;
        double descontoINSS = (percentualDescontoINSS / 100) * salarioBruto;
        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Desconto do INSS: R$ " + descontoINSS);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        teclado.close();
    }
}