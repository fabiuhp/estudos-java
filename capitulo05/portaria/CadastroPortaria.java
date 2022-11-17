package capitulo05.portaria;

public class CadastroPortaria {
    static final int TEMPO_EXPIRAR_PADRAO_MESES = 1;

    void cadastrar(final Visitante visitante) {
        this.cadastrar(visitante, TEMPO_EXPIRAR_PADRAO_MESES);
    }

    void cadastrar(final Visitante visitante, final int tempoExpiracaoEmMeses) {
        final var tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;
        System.out.printf("Visitante %s cadastrado para %d dias%n", visitante.nome, tempoExpiracaoEmDias);
    }
}
