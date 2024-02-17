public class TestGestionBanque {
    public static void main(String[] args){
        Compte c1 = new Compte("Hamdi", 2000) ;
        Compte c2 = new Compte("Fares", 1000) ;

        System.out.println(c1.toString());


        CompteEpargne ce = new CompteEpargne("Hamdi", 2000, 0.05) ;
        ce.calculBenefice(0.05);
        System.out.println(ce.calculBenefice(0.05)) ;


        c1.crediter(500);
        System.out.println(c1.toString());


        try {
            c1.debiter(4000);
            System.out.println(c1.toString());
        }

        catch (SoldeInsuffisantException e) {
            System.out.println(e);
        }


        Banque b = new Banque("Attijari Bank") ;

        b.ajouterCompte(c1);
        b.ajouterCompte(c2);

        System.out.println(b.toString()) ;
    }
}
