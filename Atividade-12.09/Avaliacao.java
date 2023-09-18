package Atividade1209.model;

public class Avaliacao {
    private String tipo;
    private double[] notas;
    private double peso;

    public Avaliacao(String tipo, double peso) {
        this.tipo = tipo;
        this.peso = peso;
        this.notas = new double[4];
    }

    public void adicionarNota(double nota) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == 0) {
                notas[i] = nota;
                break;
            }
        }
    }

    public double calcularNotaFinal() {
        double somaNotas = 0;
        int contador = 0;
        for (double nota : notas) {
            if (nota != 0) {
                somaNotas += nota;
                contador++;
            }
        }
        return contador > 0 ? somaNotas / contador : 0;
    }

    public double calcularPontuacaoTotal() {
        return calcularNotaFinal() * peso;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }
}