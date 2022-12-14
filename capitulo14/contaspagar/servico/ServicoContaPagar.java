package capitulo14.contaspagar.servico;

import capitulo14.contaspagar.pagamentos.Beneficiario;
import capitulo14.contaspagar.pagamentos.DocumentoPagavel;

public class ServicoContaPagar {

    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiChavePix()) {
            throw new RuntimeException("Beneficiário não possui chave pix");
        }

        System.out.printf("DEBUG: Efetuando pix para %s no valor de %.2f com a chave %s%n", beneficiario.getNome(),
                documento.getValorTotal(), beneficiario.getChavePix());
    }
}
