package Atividade1209.model;

public class Main {
    public static void main(String[] args) {
        Avaliacao prova1 = new Avaliacao("Prova", 2.0);
        prova1.adicionarNota(7.0);

        Avaliacao prova2 = new Avaliacao("Prova", 2.0);
        prova2.adicionarNota(7.5);

        Avaliacao trabalho = new Avaliacao("Trabalho", 1.0);
        trabalho.adicionarNota(9.8);
        trabalho.adicionarNota(6.5);
        trabalho.adicionarNota(7.2);

        Avaliacao interdisciplinar = new Avaliacao("Interdisciplinar", 2.0);
        interdisciplinar.adicionarNota(8.0);
        interdisciplinar.adicionarNota(8.0);
        interdisciplinar.adicionarNota(8.0);
        interdisciplinar.adicionarNota(8.0);

        Avaliacao[] avaliacoes = {prova1, prova2, trabalho, interdisciplinar};

        Semestre semestre = new Semestre(avaliacoes);

        if (semestre.validarPesos()) {
            System.out.println("Peso das avaliações é válido.");
        } 
        else {
            System.out.println("Peso das avaliações não é válido.");
        }

        System.out.println( "\nMédia do semestre: " + semestre.calcularMedia() +
                            "\nResultado do semestre: " + semestre.calcularResultado());
    }
}
