package fr.diginamic.combat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personnage perso = null;

        while (true) {
            System.out.println("""
                === MENU ===
                1. Créer personnage
                2. Combattre une créature
                3. Prendre une potion
                4. Afficher score
                5. Quitter
                """);

            String choix = scanner.nextLine();

            switch (choix) {
                case "1" -> {
                    perso = PersonnageFactory.creerPersonnage();
                    System.out.println("Personnage créé !");
                }
                case "2" -> {
                    if (perso == null) {
                        System.out.println("Créez un personnage d'abord !");
                    } else if (!perso.estVivant()) {
                        System.out.println("Votre personnage est mort avec un score de " + perso.getScore());
                    } else {
                        Creature creature = CreatureFactory.creerCreatureAleatoire();
                        Combat.lancer(perso, creature);
                    }
                }
                case "3" -> {
                    if (perso != null) perso.utiliserPotion();
                }
                case "4" -> {
                    if (perso != null) System.out.println("Score : " + perso.getScore());
                }
                case "5" -> {
                    System.out.println("Au revoir !");
                    return;
                }
                default -> System.out.println("Option invalide.");
            }
        }
    }
}