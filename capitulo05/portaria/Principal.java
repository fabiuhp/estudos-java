package capitulo05.portaria;

public class Principal {
    public static void main(String[] args) {
        Visitante visitante = new Visitante();
        visitante.nome = "Joao";
        visitante.idade = 15;

        CadastroPortaria cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(visitante, 10);
        cadastroPortaria.cadastrar(visitante);
    }
}
