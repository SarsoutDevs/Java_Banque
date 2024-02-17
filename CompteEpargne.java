public class CompteEpargne extends Compte {
    private double benifice ;

    public CompteEpargne(String titulaire, double solde, double benifice){
        super(titulaire, solde) ;
        this.benifice = benifice ;
    }

    public double getBenefice(){
        return benifice ;
    }

    public void setBenefice(double benifice){
        this.benifice = benifice ;
    }

    public String calculBenefice(double benifice){
        return "Le benifice de " + this.getTitulaire() + " = " + this.getSolde() * benifice ;
    }

    public String toString() {
        return "CompteEpargne [benifice = " + benifice + "]" ;
    }
    
}
