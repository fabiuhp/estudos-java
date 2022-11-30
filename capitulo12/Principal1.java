package capitulo12;

import capitulo12.banco.ContaEspecial;
import capitulo12.banco.Titular;

public class Principal1 {
    public static void main(String[] args) {
        
        ContaEspecial conta1 = new ContaEspecial();
        conta1.setTitular(new Titular("Fabio", "12345"));
        conta1.setAgencia(1234);
        conta1.setNumero(1111);
        conta1.depositar(100);
        conta1.creditarRendimentos(10);
        conta1.imprimirDemonstrativo();
    }
}
