package capitulo12;

import capitulo12.banco.Conta;
import capitulo12.banco.Titular;

public class Principal2 {
    public static void main(String[] args) {
        
        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("Fabio", "12345"));
        conta1.setAgencia(1234);
        conta1.setNumero(1111);
        conta1.setTipo(Conta.ESPECIAL);
        conta1.setLimiteChequeEspecial(100);
        conta1.setTarifaMensal(10);

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();
        conta1.creditarRendimentos(10);
        conta1.imprimirDemonstrativo();

        conta1.sacar(200);
        conta1.debitarTarifaMensal();
        conta1.imprimirDemonstrativo();
    }
}
