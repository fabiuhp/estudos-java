package capitulo05.portaria;

public class Principal {
    public static void main(String[] args) {
        Visitante visitante = new Visitante();
        visitante.nome = "Joao";
        visitante.idade = 15;

        if (visitante.possuiAcesso()) {
            System.out.println("Acesso não permitido.");
        } else {
            System.out.println("Acesso liberado.");
        }
    }
}
