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
public class Responsable extends Employe{
    int prime;
    
     
    public Responsable (int id, String nom, String adresse, int nbr_heure,int prime){
    
          super(id,nom,adresse,nbr_heure);
        this.prime=prime;
    
    } 

    
      @Override
    public String toString() {
        return "Responsable{"+ "id=" + getId() + ", nom=" + getNom() + ", adresse=" + getAdresse() + ", nbr_heure= "  + getNbr_heure()  + " prime= " + prime + '}';
    }
    
     public void salaire(){
     int   nb_heure_sup=0;
     
        System.out.println("Salaire = ");
        
    }
}
