package capitulo14.contaspagar.pagamentos;

public class Beneficiario {

    private String nome;
    private String chavePix;
    private String contaBancaria;

    public Beneficiario(String nome, String chavePix, String contaBancaria) {
        this.nome = nome;
        this.chavePix = chavePix;
        this.contaBancaria = contaBancaria;
    }

    public String getChavePix() {
        return chavePix;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public String getNome() {
        return nome;
    }

    public boolean naoPossuiChavePix() {
        return getChavePix() == null || getChavePix().isEmpty();
    }

    public boolean naoPossuiContaBancaria() {
        return getContaBancaria() == null || getContaBancaria().isEmpty();
    }
}
