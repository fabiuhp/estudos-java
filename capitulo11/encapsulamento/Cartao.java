package capitulo11.encapsulamento;

public class Cartao {
    
    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    private String titular;
    private double saldo;

    public Cartao(String titular) {
        this.titular = titular;
    }

    public String obterTitular() {
        return titular;
    }

    public double obterSaldo() {
        return saldo;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito < VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException("Deposito menor que valor minimo");
        }
        saldo += valorDeposito;
    }

    public void debitar(double valorDebito) {
        if (valorDebito > saldo) {
            throw new IllegalArgumentException("Debito maior que saldo");
        }
        saldo -= valorDebito - TARIFA_DEPOSITO;
    }
}
 