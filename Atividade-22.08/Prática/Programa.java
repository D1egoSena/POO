package Java.src.poo.atividade_2208.pratica.model;

public class Programa {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Diego", "123456", "02977715522", "30/01/2004", "01/01/2023", 5000.0);
        funcionario.setCargo("Analista e Desenvolverdor de Sistemas");
        funcionario.imprimeDados();
        System.out.println("\n");

        Professor professor = new Professor("Cléber", "654321", "987654321", "15/05/1985", "01/02/2014", 10000.0, "Doutorado");
        professor.setCargo("Professor");
        professor.setListaDisciplinas("Programação Orientada a Objetos");
        professor.endereco = "Rua Professor, 123";
        professor.imprimeDados();
        System.out.println("\n");
    }
}
