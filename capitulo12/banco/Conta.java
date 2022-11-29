package capitulo12.banco;

public class Conta {

    public static final int NORMAL = 0;
    public static final int INVESTIMENTO = 1;
    public static final int ESPECIAL = 2;
    
    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;
    private int tipo = NORMAL;

    //conta investimento
    private double valorTotalRendimentos;

    //conta especial
    private double tarifaMensal;
    private double limiteChequeEspecial;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getTipo() {
        return tipo;
    }

    public double getSaldoDisponível() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    public void setTipo(int tipo) {
        if (tipo > 2 && tipo < 0) {
            throw new IllegalArgumentException("Tipo inválido.");
        }

        this.tipo = tipo;

        if (this.tipo != ESPECIAL) {
            this.limiteChequeEspecial = 0;
        }
    }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        if (this.tipo != ESPECIAL) {
            throw new RuntimeException("Esta conta não permite cheque especial.");
        }
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void creditarRendimentos(double percentualJuros) {
        if (getTipo() == NORMAL) {
            throw new RuntimeException("Conta normal não tem rendimentos");
        }

        double valorRendimentos = getSaldo() * percentualJuros / 100;
        valorTotalRendimentos += valorRendimentos;
        
        depositar(valorRendimentos);
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }

        if (getSaldoDisponível() < getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente para saque.");
        }

        saldo -= valorSaque;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }

        saldo += valorDeposito;
    }

    public void debitarTarifaMensal() {
        if (getTipo() == ESPECIAL) {
            sacar(getTarifaMensal());
        } else {
            throw new IllegalArgumentException("Conta sem tarifa mensal.");
        }
    }

    public void imprimirDemonstrativo() {
        System.out.println();
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
        System.out.printf("Saldo disponível: %.2f%n", getSaldoDisponível());
    }
}
