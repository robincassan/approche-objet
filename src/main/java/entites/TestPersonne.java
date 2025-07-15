package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(12, "Rue des Lilas", 75000, "Paris");
        AdressePostale adresse2 = new AdressePostale(45, "Avenue de la République", 69000, "Lyon");

        Personne personne1 = new Personne("Durand", "Claire", adresse1);
        Personne personne2 = new Personne("Martin", "Jean", adresse2);
        //Pour afficher
        System.out.println(personne1.prenom + " " + personne1.nom + " habite à " + personne1.adresse.ville);
        System.out.println(personne2.prenom + " " + personne2.nom + " habite à " + personne2.adresse.ville);
    }
}
