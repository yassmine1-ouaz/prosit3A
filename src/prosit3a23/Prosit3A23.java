package prosit3a23;

import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class Prosit3A23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produit p1 = new Produit();
        Produit p2 = new Produit(1021, "lait", "delice");
        Produit p3 = new Produit(2510, "Yaourt", "vitalait");
        Produit p4 = new Produit(3250, "tomate", "sicam", 1.2f);

        //p2.prix = 0.7f;
//        
//        
//        
////        p1.afficher();
////        
////        System.out.println("*************");
////        
////        p2.afficher();
////        System.out.println("*************");
////      
////        p3.afficher();
////          System.out.println("*************");
////      
////        p4.afficher();
//          System.out.println("*************");
//        System.out.println( p1.toString());
//    
//    
        Magasin aziza = new Magasin(1, "ESPRIT ");

        aziza.ajouterProduit(p4);
        aziza.ajouterProduit(p3);
        aziza.ajouterProduit(p2);
        aziza.ajouterProduit(new Produit(2, "tomate", "tomate"));

        System.out.println(aziza.toString());
        
        Magasin Carrefour = new Magasin(1,"Center ville");
        Magasin Monoprix = new Magasin(2, "Manzeh 6");
        
        
        Caissier cas1 = new Caissier(1, "cc", "aaa", 25, 15);
        Caissier cas2 = new Caissier(2, "ca", "aaa", 22, 12);
        Vendeur v1 = new Vendeur(1, "yassmine", "monastir", 16, 22);
        Responsable resp1 = new Responsable(1, "salma", "mahdia", 15, 30);
        
        Carrefour.ajouterEmploye(cas1);
        Carrefour.ajouterEmploye(cas2);
        Carrefour.ajouterEmploye(v1);
        Carrefour.ajouterEmploye(resp1);
        
        Caissier cas3 = new Caissier(1, "cass", "aaa", 22, 10);
        Vendeur v2 = new Vendeur(2, "saalma", "tunis", 15, 23);
        Vendeur v3 = new Vendeur(3, "salim", "tunis", 13, 22);
        Vendeur v4 = new Vendeur(4, "amira", "tunis", 14, 10);
        Responsable resp2 = new Responsable(15, "aaaaa", "sousse", 170, 30);
        
        Monoprix.ajouterEmploye(cas3);
        Monoprix.ajouterEmploye(v2);
        Monoprix.ajouterEmploye(v3);
        Monoprix.ajouterEmploye(v4);
        System.out.println(resp2.toString());

    }

}
