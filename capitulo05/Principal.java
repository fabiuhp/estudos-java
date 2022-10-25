package capitulo05;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.cor = "Branco";
        meuCarro.anoFabricacao = 2022;
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Pulse";

        System.out.println(meuCarro.fabricante);
    }
}
