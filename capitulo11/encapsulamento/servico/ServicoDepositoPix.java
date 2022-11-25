package capitulo11.encapsulamento.servico;

import capitulo11.encapsulamento.Cartao;
import capitulo11.encapsulamento.Recibo;

public class ServicoDepositoPix {

    public Recibo deposito(Cartao cartao, double valorDeposito) {
        //todo logica do pix
        
        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(String.format("Valor de depósito não pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }

        cartao.saldo += valorDeposito - Cartao.TARIFA_DEPOSITO;
        return new Recibo(cartao.titular, "Deposito", valorDeposito);
    }
}
