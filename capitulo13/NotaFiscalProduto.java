package capitulo13;

public class NotaFiscalProduto extends NotaFiscal{

    private double valorFrete;

    public NotaFiscalProduto(String descricao, double valorTotal, double valorFrete) {
        super(descricao, valorTotal);
        this.valorFrete = valorFrete;
    }
    
    public double getValorFrete() {
        return valorFrete;
    }
}
