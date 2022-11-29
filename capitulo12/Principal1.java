package capitulo12;

import capitulo12.banco.Conta;
import capitulo12.banco.Titular;

public class Principal1 {
    public static void main(String[] args) {
        
        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("Fabio", "12345"));
        conta1.setAgencia(1234);
        conta1.setNumero(1111);

        conta1.imprimirDemonstrativo();
        conta1.depositar(100);
        conta1.imprimirDemonstrativo();
        conta1.sacar(10);
        conta1.imprimirDemonstrativo();    
    }
}
