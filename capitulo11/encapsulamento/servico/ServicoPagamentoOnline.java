package capitulo11.encapsulamento.servico;

import capitulo11.encapsulamento.Cartao;
import capitulo11.encapsulamento.Estabelecimento;
import capitulo11.encapsulamento.Recibo;

public class ServicoPagamentoOnline {
    
    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor) {
        cartao.debitar(valor);
        return new Recibo(cartao.obterTitular(), "Pagamento", valor);
    }
}
