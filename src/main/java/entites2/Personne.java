package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    // Constructeur
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    // constructeur sans adresse
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public void afficherNomPrenom(){
        System.out.println(prenom+" "+nom.toUpperCase());
    }
    public void modifierNom(String nouveauNom){
        this.nom = nouveauNom;
    }
    public void modiferPrenom(String nouveauPrenom){
        this.prenom = nouveauPrenom;
    }
    public void modifierAdresse(AdressePostale nouvelleAdresse){
        this.adresse = nouvelleAdresse;
    }
    //getter pour le nom
    public String getNom(){
        return this.nom;
    }
    //getter pour le prénom
    public String getPrenom(){
        return this.prenom;
    }
    //getter pour l'adresse
    public AdressePostale getAdresse(){
        return this.adresse;
    }
}
