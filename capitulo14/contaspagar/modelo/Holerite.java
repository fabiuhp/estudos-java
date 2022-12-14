package capitulo14.contaspagar.modelo;

import capitulo14.contaspagar.pagamentos.Beneficiario;
import capitulo14.contaspagar.pagamentos.DocumentoPagavel;

public class Holerite implements DocumentoPagavel{

    private Beneficiario beneficiario;
    private double valorHora;
    private int quantidadeHoras;

    public Holerite(Beneficiario beneficiario, double valorHora, int quantidadeHoras) {
        this.beneficiario = beneficiario;
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    }

    @Override
    public double getValorTotal() {
        return getValorHora() * getQuantidadeHoras();
    }

    @Override
    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }
}
