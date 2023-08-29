package poo.sabado_2608;
import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] votosCandidatos = new int[4];
        int votosNulos = 0;
        int votosBrancos = 0;

        while (true) {
            System.out.print("Digite o código do candidato (5 para branco e 0 para finalizar): ");
            int codigo = teclado.nextInt();

            if (codigo == 0) {
                break;
            } 
            else if (codigo >= 1 && codigo <= 4) {
                votosCandidatos[codigo - 1]++; 
            } 
            else if (codigo == 5) {
                votosBrancos++;
            } 
            else {
                votosNulos++;
            }
        }

        System.out.println("Total de votos para cada candidato:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votosCandidatos[i] + " votos");
        }
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBrancos);

        teclado.close();
    }
}