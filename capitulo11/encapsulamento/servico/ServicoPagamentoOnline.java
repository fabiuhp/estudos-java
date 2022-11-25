package capitulo11.encapsulamento.servico;

import capitulo11.encapsulamento.Cartao;
import capitulo11.encapsulamento.Estabelecimento;
import capitulo11.encapsulamento.Recibo;

public class ServicoPagamentoOnline {
    
    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor) {
        if (cartao.saldo < valor) {
            throw new RuntimeException("Saldo insuficiente.");
        }
        
        cartao.saldo -= valor;

        //TODO realiza outras logicas quaisquer

        return new Recibo(cartao.titular, "Pagamento", valor);
    }
}
