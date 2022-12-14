package capitulo14.contaspagar.pagamentos;

public interface DocumentoPagavel {
    
    //public abstract é padrao em interface
    double getValorTotal();
    Beneficiario getBeneficiario();
}
