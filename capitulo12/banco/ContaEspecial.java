package capitulo12.banco;

public class ContaEspecial extends ContaInvestimento {
    
    private double tarifaMensal;
    private double limiteChequeEspecial;

    public double getSaldoDisponível() {
        return getSaldo() + getLimiteChequeEspecial();
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
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }

    @Override
    public void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();
        System.out.printf("Saldo disponível: %.2f%n", getSaldoDisponível());
    }
}
