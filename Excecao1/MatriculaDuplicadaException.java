package Excecao1;

public class MatriculaDuplicadaException extends Exception {
    public MatriculaDuplicadaException(String mensagem) {
        super("Matrícula " +mensagem+ " já cadastrada");
    }
}