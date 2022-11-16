package capitulo05.ciaaerea;

public class Principal {
    public static void main(String[] args) {
        Aeronave aeronave = new Aeronave();
        aeronave.totalAssentos = 100;
        aeronave.switchEstado();
        aeronave.switchEstado();
        aeronave.reservarAssentos(10);

        System.out.printf("GOL (%s): %d assentos disponíveis%n", aeronave.ativo ? "Ativo" : "Inativo", aeronave.calcularAssentosDisponiveis());
    }
}
