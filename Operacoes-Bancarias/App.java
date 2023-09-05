package OperaçõesBancarias.model;

public class App {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        ContaCorrente conta3 = new ContaCorrente();

        Banco banco = new Banco("Correntista1", conta1, "Correntista2", conta2, "Correntista3", conta3);

        banco.creditar("Correntista1", 5000.0);
        banco.debitar("Correntista2", 1000.0);
        banco.transferir("Correntista1", "Correntista3", 330.0);

        System.out.println( "\nSaldo Correntista1: " + banco.getSaldo("Correntista1") +
                            "\nSaldo Correntista2: " + banco.getSaldo("Correntista2") +
                            "\nSaldo Correntista3: " + banco.getSaldo("Correntista3"));
    }
}
