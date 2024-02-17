public class SoldeInsuffisantException extends Exception {
    public SoldeInsuffisantException(){
        super("Votre solde est insuffisant !!!");
    }

    public SoldeInsuffisantException(String msg){
        super(msg);
    }
}