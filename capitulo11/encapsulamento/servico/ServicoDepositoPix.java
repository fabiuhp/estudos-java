package capitulo11.encapsulamento.servico;

import capitulo11.encapsulamento.Cartao;
import capitulo11.encapsulamento.Recibo;

public class ServicoDepositoPix {

    public Recibo deposito(Cartao cartao, double valorDeposito) {
        cartao.depositar(valorDeposito);
        return new Recibo(cartao.getTitular(), "Deposito", valorDeposito);
    }
}
