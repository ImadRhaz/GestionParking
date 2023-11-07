
package Classes;


public abstract class Vehicule {
    //Les attributs 
    protected String marque;
        protected String immatriculation;
            protected String modele;
 //
    public Vehicule(String marque, String immatriculation, String modele) {
        this.marque = marque;
        this.immatriculation = immatriculation;
        this.modele = modele;
    }
            
            
  //Geters et seters 
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }
            


    
}
