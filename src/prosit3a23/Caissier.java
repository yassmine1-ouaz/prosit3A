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
public class Caissier extends Employe {
    
    int num_caisse ;
     public Caissier(int id, String nom, String adresse, int nbr_heure, int num_caisse){
        
        super(id,nom,adresse,nbr_heure);
        this.num_caisse= num_caisse;
       
    }
     
     
         @Override
    public String toString() {
        return "Caissier{"+ "id=" + getId() + ", nom=" + getNom() + ", adresse=" + getAdresse() + ", nbr_heure= " + getNbr_heure()  + " num_caisse= " + num_caisse + '}';
    }
    
}
