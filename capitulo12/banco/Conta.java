package capitulo12.banco;

public class Conta {
    
    private Titular titular;
    private int agencia;
    private int numero;
    protected double saldo;

    public Conta(Titular titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public Titular getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean possuiGratuidadeImpressao() {
        return false;
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }

        if (getSaldo() < valorSaque) {
            throw new IllegalArgumentException("Saldo insuficiente para saque.");
        }

        saldo -= valorSaque;
    }

    public final void depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }

        saldo += valorDeposito;
    }

    public void imprimirDemonstrativo() {
        System.out.println();
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }

    @Override
    public String toString() {
        return String.format("Conta(titular=%s, agencia=%d, numero=%d)", 
        titular.getNome(), agencia, numero);
    }
}
