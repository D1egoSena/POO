package Java.src.poo.atividade_2208.pratica.model;

public class Professor extends Funcionario {
    private String formacao;
    private String listaDisciplinas;
    
    public Professor(String nome, String rg, String cpf, String dataNascimento, String dataAdmissao, double salario, String formacao) {

        super(nome, rg, cpf, dataNascimento, dataAdmissao, salario);
        this.formacao = formacao;
        
    }
    
    public void setListaDisciplinas(String disciplinas) {
        this.listaDisciplinas = disciplinas;
    }
    
    public String getListaDisciplinas() {
        return listaDisciplinas;
    }
    
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Formacao: " + formacao + "\nDisciplinas: " + listaDisciplinas + "\nEndereco: " + endereco);
    }
}
