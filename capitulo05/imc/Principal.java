package capitulo05.imc;

public class Principal {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();

        IndiceMassaCorporal imc = calculadoraImc.calcular(175, 1.82);

        if (imc.estaObeso()) {
            System.out.println("Obeso");
        }
    }

}
