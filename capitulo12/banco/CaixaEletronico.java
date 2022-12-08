package capitulo12.banco;

public class CaixaEletronico {

    public static final double TARIFA_TRANSFERENCIA = 10;
    public static final double TARIFA_IMPRESSAO_DEMONSTRATIVO = 5;

    public void transferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia) {
    }

    public void imprimirDemonstrativo(Conta conta) {
        if (conta instanceof ContaInvestimento contaInvestimento && contaInvestimento.getValorTotalRendimentos() > 0) {
            System.out.println("Impressão de demonstrativo gratuita.");
        } else {
            debitarTarifaImpressaoDemonstrativo(conta);
        }
        conta.imprimirDemonstrativo();
    }

    private void debitarTarifaImpressaoDemonstrativo(Conta conta) {
        System.out.printf("Custo da impressão: R$%.2f%n", TARIFA_IMPRESSAO_DEMONSTRATIVO);
        conta.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);
    }
}
