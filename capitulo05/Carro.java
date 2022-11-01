package capitulo05;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa pessoa;

    void calcularValorRevenda() {
        int vidaUtilEmAnos = 20;
        int tempoDeUsoEmAnos = 2022 - anoFabricacao;
        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);
        
        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        System.out.printf("Calcular valor de revenda de: %s %d%n", modelo, anoFabricacao);
        System.out.printf("Tempo de uso em anos: %d%n", tempoDeUsoEmAnos);
        System.out.printf("Valor revenda: %6.2f%n", valorRevenda);
    }
}
