package capitulo12.banco;

public class ContaInvestimento extends Conta {
    
    private double valorTotalRendimentos;

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public void creditarRendimentos(double percentualJuros) {
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        valorTotalRendimentos += valorRendimentos;
        
        depositar(valorRendimentos);
    }
}
