package capitulo14.contaspagar;

import capitulo14.contaspagar.modelo.Holerite;
import capitulo14.contaspagar.modelo.OrdemServico;
import capitulo14.contaspagar.pagamentos.Beneficiario;
import capitulo14.contaspagar.pagamentos.Pix;
import capitulo14.contaspagar.pagamentos.Transferencia;
import capitulo14.contaspagar.servico.ServicoContaPagar;

public class Main {
    public static void main(String[] args) {
        ServicoContaPagar pagamentoPix = new ServicoContaPagar(new Pix());
        ServicoContaPagar pagamentoTed = new ServicoContaPagar(new Transferencia());
        Beneficiario beneficiario = new Beneficiario("Fabio", "abc123", "123");
        Holerite holerite = new Holerite(beneficiario, 100, 168);

        Beneficiario fornecedor = new Beneficiario("Consultoria ABC", "123", "1234");
        OrdemServico ordemServico = new OrdemServico(fornecedor, 100);


        pagamentoPix.pagar(holerite);
        pagamentoTed.pagar(ordemServico);
    }
}
