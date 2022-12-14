package capitulo12;

import capitulo12.banco.ContaEspecial;
import capitulo12.banco.Titular;

public class Principal1 {
    public static void main(String[] args) {
        
        ContaEspecial conta1 = new ContaEspecial(new Titular("Fabio", "12345"), 1234, 1111, 10);
        conta1.depositar(100);
        conta1.imprimirDemonstrativo();
    }
}
