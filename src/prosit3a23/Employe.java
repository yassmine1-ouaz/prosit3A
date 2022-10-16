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
public class Employe {
    
    private int id;
    private String nom;
    private String adresse;
    private int nbr_heure;

    public Employe(int id, String nom, String adresse, int nbr_heure) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heure = nbr_heure;
    }

    
    
    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nbr_heure=" + nbr_heure + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbr_heure() {
        return nbr_heure;
    }

    public void setNbr_heure(int nbr_heure) {
        this.nbr_heure = nbr_heure;
    }
    
}
