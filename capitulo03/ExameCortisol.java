import java.util.Scanner;

public class ExameCortisol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cortisol: ");
        double cortisol = sc.nextDouble();
        sc.close();

        // Cortisol ideal é de 6 a 18.4
        // Uso de operadores de comparação && ou || (and/or)
        boolean resultadoNormal = cortisol  >= 6 && cortisol <= 18.4;

        System.out.printf("Cortisol está normal? %b%n", resultadoNormal);
    }
}
