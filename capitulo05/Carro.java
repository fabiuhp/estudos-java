package capitulo05;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa pessoa;

    double calcularValorRevenda() {
        int vidaUtilEmAnos = 20;
        int tempoDeUsoEmAnos = 2022 - anoFabricacao;
        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);
        
        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }
}
