package capitulo05;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        Pessoa fabio = new Pessoa();
        fabio.nome = "Fabio";

        meuCarro.cor = "Branco";
        meuCarro.anoFabricacao = 2022;
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Pulse";
        meuCarro.pessoa = fabio;

        meuCarro.calcularValorRevenda();
    }
}
