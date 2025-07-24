package fr.diginamic.chaines;

import fr.diginamic.entities.Salarie;

public class ManipulationChaine {
    public static void main(String[] args) {

    String chaine = "Durand;Marcel;2 523.5";
    // affichage du premier caractere de la chaine
    char premierCaractere = chaine.charAt(0);
    System.out.println("Premier caractère : "+ premierCaractere);
    //affichage de la longueur de la chaine
    System.out.println("Longueur de la chaine : " +   chaine.length());
    //afficher l'index du premier ; de la chaine
    System.out.println(chaine.indexOf(';'));
    //extraction du nom de famille de la chaine
    System.out.println(chaine.substring(0,chaine.indexOf(';')));
    //affichage nom de famille en majuscule
    System.out.println(chaine.substring(0,chaine.indexOf(';')).toUpperCase());
    //affichage en minuscule
    System.out.println(chaine.substring(0,chaine.indexOf(';')).toLowerCase());
    //découpage de la chaine de caractère en morceau
    String[] mots = chaine.split(";");
    for (String mot : mots){
            System.out.println(mot);
        }
    //Création d'une instance de salarié à partir des infos de la chaine
    Salarie salarie = new Salarie(mots[0], mots[1], Double.parseDouble(mots[2].replace(" ","")));
        System.out.println("salarié crée : " + salarie);
    }
}
