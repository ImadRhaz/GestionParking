
package Classes;


public class Voiture extends Vehicule  {
    private int nombrePortes;
    
    public Voiture(String marque, String immatriculation, String modele,int nombrePortes) {
        super(marque, immatriculation, modele);
        this.nombrePortes=nombrePortes;
    }

    public int getNombrePortes() {
        return nombrePortes;
    }

    public void setNombrePortes(int nombrePortes) {
        this.nombrePortes = nombrePortes;
    }

    @Override
    public String toString() {
       String affichage ="  la voiture "+getMarque()+"   "+getModele()+"  d'imatriculation   "+getImmatriculation()+"  contient "+getNombrePortes()+"  de portes  " ;
     return affichage;
    }
}
    
    

