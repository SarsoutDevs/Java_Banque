import java.util.ArrayList;
import java.util.List;

public class Banque {
    private String nom ;
    private List<Compte> listCompte ;

    
    public Banque(String nom){
        this.nom = nom ;
        this.listCompte = new ArrayList<Compte>() ;
    }

    
    public void ajouterCompte(Compte c){
        this.listCompte.add(c) ;
    }


    public String toString() {
        return "Banque [nom = " + nom + " , listCompte = " + listCompte + "]" ;
    }
}
