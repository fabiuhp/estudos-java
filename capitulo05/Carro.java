package capitulo05;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa pessoa;

    int calcularTempoDeUsoEmAnos() {
        return 2022 - anoFabricacao;
    }

    double calcularIpva() {
        int tempoUsoAnos = calcularTempoDeUsoEmAnos();
        double percentual = 0.04;

        if (tempoUsoAnos >= 10) {
            return 0;
        }
        return calcularValorRevenda() * percentual;
    }

    double calcularValorRevenda() {
        int vidaUtilEmAnos = 20;
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();

        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }

    void imprimirResumoDepreciacao() {
        if (precoCompra <= 0) {
            System.out.println("Carro com preço de compra zerado. Sem resumo.");
            return;
        }

        System.out.printf("Valor revenda: %6.2f%n", calcularValorRevenda());
        System.out.printf("Tempo de uso em anos: %d%n", calcularTempoDeUsoEmAnos());
        System.out.printf("Valor IPVA: %.2f%n", calcularIpva());
    }
}
