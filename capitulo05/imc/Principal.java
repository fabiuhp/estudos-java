package capitulo05.imc;

public class Principal {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
        calculadoraImc.altura = 1.82;
        calculadoraImc.peso = 175;

        IndiceMassaCorporal imc = calculadoraImc.calcular();

        if (imc.estaObeso()) {
            System.out.println("Obeso");
        }
    }

}
