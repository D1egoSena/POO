package Java.src.poo.atividade_2208.pratica.model;

public class Funcionario {
    private static int geraMatricula = 100;
    
    private String nome;
    private String rg;
    private String cpf;
    private String dataNascimento;
    private String dataAdmissao;
    private double salario;
    private int matricula;
    private String cargo;
    protected String endereco;
    
    public Funcionario(String nome, String rg, String cpf, String dataNascimento, String dataAdmissao, double salario) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.matricula = geraMatricula++;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public String toString() {
        return "Matricula: " + matricula + "\nNome: " + nome;
    }
    
    public void imprimeDados() {
        System.out.println( "NOME: " +nome+
                            "\nRG: " +rg+
                            "\nCPF: " +cpf+
                            "\nAdmissao: " +dataAdmissao+
                            "\nNascimento: " +dataNascimento+
                            "\nSalario: " +salario+
                            "\nCargo: " +cargo+
                            "\nMatricula: " +matricula);
    }
}
