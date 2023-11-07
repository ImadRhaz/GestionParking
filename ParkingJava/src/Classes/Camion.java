
package Classes;


public class Camion extends Vehicule {
    private boolean remorque;
    
    public Camion(String marque, String immatriculation, String modele,boolean remorque) {
        super(marque, immatriculation, modele);
        this.remorque=remorque;
    }

    public boolean isRemorque() {
        return remorque;
    }

    public void setRemorque(boolean remorque) {
        this.remorque = remorque;
    }
    
      @Override
    public String toString() {
        String affichage;
        if (isRemorque())
       affichage ="  la camion "+getMarque()+"   "+getModele()+"  d'imatriculation  "+getImmatriculation()+ "\t  Contient un remorque  " ;
        else 
         affichage ="  la camion "+getMarque()+"   "+getModele()+"  d'imatriculation   "+getImmatriculation()+ " \t  ne Contientpas un remorque" ;

     return affichage;
    }

    
    
}
