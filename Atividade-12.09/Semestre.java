package Atividade1209.model;

public class Semestre {
    private Avaliacao[] avaliacoes;

    public Semestre(Avaliacao[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public boolean validarPesos() {
        double somaPesos = 0;
        for (Avaliacao avaliacao : avaliacoes) {
            somaPesos += avaliacao.getPeso();
        }
        return somaPesos == 7.0;
    }

    public double calcularMedia() {
        double somaPontuacoes = 0;
        for (Avaliacao avaliacao : avaliacoes) {
            somaPontuacoes += avaliacao.calcularPontuacaoTotal();
        }
        return (somaPontuacoes / 7.0);
    }

    public String calcularResultado() {
        if (validarPesos() && calcularMedia() >= 7.0) {
            return "APROVADO";
        } 
        else {
            return "REPROVADO";
        }
    }
}