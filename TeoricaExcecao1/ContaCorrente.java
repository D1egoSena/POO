package TeoricaExcecao1;

public class ContaCorrente {
    private float limite;
    private float saldo;
    private float valorLimite;

    public ContaCorrente(float limite, float valorLimite) {
        if (limite < 0 || valorLimite < 0) {
            throw new IllegalArgumentException("Limite e valorLimite não podem ser negativos");
        }
        this.limite = limite;
        this.valorLimite = valorLimite;
        this.saldo = 0;
    }

    public void sacar(float valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor de saque não pode ser negativo");
        }
        if (valor > saldo + limite) {
            throw new IllegalArgumentException("Saque excede o saldo disponível e o limite");
        }
        saldo -= valor;
    }

    public void depositar(float valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor de depósito não pode ser negativo");
        }
        saldo += valor;
    }

    public void setValorLimite(float valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor de limite não pode ser negativo");
        }
        if (valor < saldo) {
            throw new IllegalArgumentException("Novo limite não pode ser menor que o saldo atual");
        }
        this.valorLimite = valor;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public float getValorLimite() {
        return valorLimite;
    }

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(500, 1000);
        
        try {
            conta.depositar(200);
            conta.sacar(300);
            conta.setValorLimite(1500);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Limite: " + conta.getLimite());
        System.out.println("Valor Limite: " + conta.getValorLimite());
    }
}
