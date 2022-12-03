package capitulo12;

import capitulo12.banco.Conta;
import capitulo12.banco.Titular;

public class Principal1 {
    public static void main(String[] args) {
        
        Conta conta1 = new Conta(new Titular("Fabio", "12345"), 1234, 1111);
        conta1.depositar(100);
        conta1.imprimirDemonstrativo();
    }
}
