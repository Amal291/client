import proxy.BanqueWS;
import proxy.BanqueService;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args){
        //middlewear
        BanqueService stub=new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert( 777));
        Compte cp=stub.getCompte(7);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());

    }
}
