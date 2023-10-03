package Excecao1;

public class CadastroAluno {
    private String nome;
    private String endereco;
    private String matricula;

    public CadastroAluno(String nome, String endereco, String matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.matricula = matricula;
    }

     public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereco;
    }

    public String getMatricula() {
        return matricula;
    }
}