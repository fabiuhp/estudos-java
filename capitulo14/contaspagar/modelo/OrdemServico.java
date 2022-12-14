package capitulo14.contaspagar.modelo;

import capitulo14.contaspagar.pagamentos.Beneficiario;
import capitulo14.contaspagar.pagamentos.DocumentoPagavel;

public class OrdemServico implements DocumentoPagavel{
    
    private Beneficiario beneficiario;
    private double valorTotal;

    public OrdemServico(Beneficiario beneficiario, double valorTotal) {
        this.beneficiario = beneficiario;
        this.valorTotal = valorTotal;
    }

    @Override
    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    @Override
    public double getValorTotal() {
        return valorTotal;
    }
}
