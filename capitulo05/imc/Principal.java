package capitulo05.imc;

public class Principal {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
        Paciente paciente = new Paciente();
        paciente.peso = 140;
        paciente.altura = 1.60;

        IndiceMassaCorporal imc = calculadoraImc.calcular(paciente);

        if (imc.estaObeso()) {
            System.out.println("Obeso");
        }
    }

}
