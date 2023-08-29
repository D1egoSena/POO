package poo.sabado_2608;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a distância da viagem em quilômetros: ");
        double distancia = teclado.nextDouble();

        System.out.print("Digite o preço do litro da gasolina: ");
        double precoGasolina = teclado.nextDouble();

        double eficienciaCarro = 12.0;
        double litrosGasolina = distancia / eficienciaCarro;
        double custoViagem = litrosGasolina * precoGasolina;

        System.out.println("Quantidade de gasolina necessária: " + litrosGasolina + " litros");
        System.out.println("Custo da viagem: R$ " + custoViagem);

        teclado.close();
    }
}