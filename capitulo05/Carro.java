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
        return calcularValorRevenda() * 0.04;
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
        System.out.printf("Valor revenda: %6.2f%n", calcularValorRevenda());
        System.out.printf("Tempo de uso em anos: %d%n", calcularTempoDeUsoEmAnos());
        System.out.printf("Valor IPVA: %.2f%n", calcularIpva());
    }
}
