package Java.src.poo.atividade_assincrona3.model;

class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private int matricula;
    private double salario;
    private String dataContratacao;

    private static int geraMatricula = 0;

    public Funcionario(String nome, double salarioBase, double horasTrabalhadas) {
        this.nome = nome;
        this.salario = calcularSalario(salarioBase, horasTrabalhadas);

        geraMatricula++;
        this.matricula = geraMatricula;
    }

    private double calcularSalario(double salarioBase, double horasTrabalhadas) {
        Calculo calculo = new Calculo();
        calculo.calculaSalario(salarioBase, horasTrabalhadas);
        return calculo.getTotalSalario();
    }

    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário: " + salario);
        System.out.println("Data de contratação: " + dataContratacao);
    }
}
