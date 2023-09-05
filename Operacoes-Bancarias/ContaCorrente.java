package OperaçõesBancarias.model;

public class ContaCorrente {
    private double saldo = 0;

    public void executarOperacao(Operacao opr) {
        saldo += opr.operar();
    }

    public double getSaldo() {
        return saldo;
    }
}