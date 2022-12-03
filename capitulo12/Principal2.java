package capitulo12;

import capitulo12.banco.ContaInvestimento;
import capitulo12.banco.Titular;

public class Principal2 {
    public static void main(String[] args) {
        
        ContaInvestimento conta1 = new ContaInvestimento(new Titular("Fabio", "12345"), 1234, 1111);

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(200);
        conta1.creditarRendimentos(10);
        conta1.imprimirDemonstrativo();
    }
}
