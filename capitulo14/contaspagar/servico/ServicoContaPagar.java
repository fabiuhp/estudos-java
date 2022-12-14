package capitulo14.contaspagar.servico;

import capitulo14.contaspagar.pagamentos.DocumentoPagavel;
import capitulo14.contaspagar.pagamentos.MetodoPagamento;

public class ServicoContaPagar {
    
    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento) {
        metodoPagamento.pagar(documento);
    }
}
