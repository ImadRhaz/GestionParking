
package Classes;


public class Moto extends Vehicule {
      private int vitessMax;
    public Moto(String marque, String immatriculation, String modele,int vitessMax) {
        super(marque, immatriculation, modele);
        this.vitessMax=vitessMax;
    }
    
   
    public int getVitessMax() {
        return vitessMax;
    }

    public void setVitessMax(int vitessMax) {
        this.vitessMax = vitessMax;
    }
      @Override
    public String toString() {
       String affichage ="   la moto "+getMarque()+"   "+getModele()+"   d'imatriculation   "+getImmatriculation()+"  VitessMax est   : "+getVitessMax() ;
     return affichage;
    }

    
}
