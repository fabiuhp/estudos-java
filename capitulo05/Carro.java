package capitulo05;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    Pessoa pessoa;

    void calcularValorRevenda() {
        System.out.printf("Calcular valor de revenda de: %s %d%n", modelo, anoFabricacao);
    }
}
