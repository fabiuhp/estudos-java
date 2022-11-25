package capitulo11.encapsulamento;

import capitulo11.encapsulamento.servico.ServicoDepositoPix;
import capitulo11.encapsulamento.servico.ServicoPagamentoOnline;

public class Principal {
    
    public static void main(String[] args) {
        var supermercado = new Estabelecimento("Supermercado do Zé");
        var cartao = new Cartao("Joao Souza");


        //Eu posso burlar as regras por conta da falta de encapsulamento
        cartao.saldo = 500;
        // var servicoDepositoPix = new ServicoDepositoPix();
        // Recibo reciboDeposito = servicoDepositoPix.deposito(cartao, 500);

        // reciboDeposito.imprimir();


        var servicoPagamento = new ServicoPagamentoOnline();
        Recibo reciboPagamento = servicoPagamento.efetuarPagamento(supermercado, cartao, 100);

        reciboPagamento.imprimir();

        System.out.printf("Titular: %s%n", cartao.titular);
        System.out.printf("Saldo: %.2f%n", cartao.saldo);
    }
}
