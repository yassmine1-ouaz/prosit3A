/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit3a23;

/**
 *
 * @author octanet
 */
public class Vendeur extends Employe {
  public int tauxDeVente ;

   public Vendeur (int id, String nom, String adresse, int nbr_heure,int tauxDeVente){
    
         super(id,nom,adresse,nbr_heure);
        this.tauxDeVente=tauxDeVente;
    
}

    @Override
    public String toString() {
        return "Vendeur{" + "id=" + getId() + ", nom=" + getNom() + ", adresse=" + getAdresse() + ", nbr_heure= " + getNbr_heure() + " tauxDeVente= " + tauxDeVente + '}';
    }  
    
    public void salaire(){
     float  total;
   
            
    }
}
