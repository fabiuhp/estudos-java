package capitulo05.precificacao;

public class Principal {
    public static void main(String[] args) {
        Produto prod1 = new Produto();
        Produto prod2 = new Produto();

        // prod1.custoEmbalagem = 10.5;
        // prod1.custoEmbalagem = 15;
        Produto.custoEmbalagem = 10;

        prod1.imprimirCustoEmbalagem();
        prod2.imprimirCustoEmbalagem();
    }
}
