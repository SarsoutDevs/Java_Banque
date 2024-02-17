public class Compte{
    private String titulaire;
    private double solde ;

    public Compte(String titulaire){
        this.titulaire = titulaire ;
    }

    public Compte(String titulaire, double solde){
        this.titulaire = titulaire ;
        this.solde = solde ;
    }

    public String getTitulaire(){
        return titulaire ;
    }

    public void setTitulaire(String titulaire){
        this.titulaire = titulaire ;
    }

    public double getSolde(){
        return solde ;
    }

    public void setSolde(double solde){
        this.solde = solde ;
    }

    public void debiter(double montant) throws SoldeInsuffisantException{
        if(montant> this.getSolde()){
            throw new SoldeInsuffisantException() ;
        }

        else{
            this.solde -= montant ;
        }
    }

    public void crediter(double montant){
        this.solde += montant ;
    }

    

    public String toString(){
        return "Le client " + titulaire + " , Votre et son solde = " + solde + " DT" ;
    }
}