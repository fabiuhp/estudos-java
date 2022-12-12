package capitulo13;

public class NotaFiscalServico extends NotaFiscal {
    
    public static final double ALIQUOTA_IMPOSTOS = 0.18;
    public static final int VALOR_MAXIMO_ISENCAO_FISCAL = 1000;
    private boolean intermunicipal;

    public NotaFiscalServico(String descricao, double valorTotal, boolean intermunicipal) {
        super(descricao, valorTotal);
        this.intermunicipal = intermunicipal;
    }

    public boolean isIntermunicipal() {
        return intermunicipal;
    }

    @Override
    public double calcularImpostos() {
        double valorImpostos = getValorTotal() * ALIQUOTA_IMPOSTOS;
        
        if (isIsentoImposto()) {
            valorImpostos = 0;
        }

        return valorImpostos;
    }

    private boolean isIsentoImposto() {
        return isIntermunicipal() && getValorTotal() <= VALOR_MAXIMO_ISENCAO_FISCAL;
    }
}
