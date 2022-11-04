package capitulo05.imc;

public class IndiceMassaCorporal {
    double resultado;
    double peso;
    double altura;

    boolean estaObeso() {
        return resultado >= 30;
    }

    boolean abaixoPesoIdeal() {
        return resultado < 18.5;
    }
}
