package Java.src.poo.atividade_assincrona3.model;

public class Calculo {
    private double totalSalario;
    
    public void calculaSalario(double salarioBase, double horasTrabalhadas) {
        totalSalario = salarioBase * horasTrabalhadas;
    }
    
    public double getTotalSalario() {
        return totalSalario;
    }
}