package capitulo05;

public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Pessoa fabio = new Pessoa();
        fabio.nome = "Fabio";

        carro1.cor = "Branco";
        carro1.anoFabricacao = 2021;
        carro1.fabricante = "Fiat";
        carro1.modelo = "Pulse";
        carro1.pessoa = fabio;
        carro1.precoCompra = 120000;

        carro2.cor = "Azul";
        carro2.anoFabricacao = 2022;
        carro2.fabricante = "BMW";
        carro2.modelo = "X1";
        carro2.pessoa = fabio;
        carro2.precoCompra = 200000;

        carro1.calcularValorRevenda();
        carro2.calcularValorRevenda();
    }
}
