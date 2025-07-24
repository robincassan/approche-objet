package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison();

        maison.ajouterPiece(new Chambre(12,0));
        maison.ajouterPiece(new Salon(20, 0));
        maison.ajouterPiece(new Cuisine(8,0));
        maison.ajouterPiece(new Chambre(15, 1));
        maison.ajouterPiece(new SalleDeBain(5, 1));
        maison.ajouterPiece(new WC(2, 1));

        // Tests
        System.out.println("Superficie totale : " + maison.getSuperficieTotale()); // 62
        System.out.println("Superficie étage 0 : " + maison.getSuperficieEtage(0)); // 40
        System.out.println("Superficie étage 1 : " + maison.getSuperficieEtage(1)); // 22
        System.out.println("Superficie des chambres : " + maison.getSuperficieParType("Chambre")); // 27
        System.out.println("Nombre de WC : " + maison.getNombrePieceParType("WC")); // 1

        // Test avec null
        maison.ajouterPiece(null); // Affiche un message d'erreur

        // Test avec données invalides
        maison.ajouterPiece(new Cuisine(-10, 0)); // Erreur superficie négative
        maison.ajouterPiece(new WC(2, -1));       // Erreur étage négatif
    }

}
