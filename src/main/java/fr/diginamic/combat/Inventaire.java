package fr.diginamic.combat;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventaire {
    private ArrayList<Potion> potions = new ArrayList<>();

    public void ajouterPotion(Potion p) {
        potions.add(p);
    }

    public void utiliserPotion(Personnage p) {
        if (potions.isEmpty()) {
            System.out.println("Aucune potion.");
            return;
        }

        System.out.println("Potions disponibles :");
        for (int i = 0; i < potions.size(); i++) {
            System.out.println((i + 1) + ". " + potions.get(i));
        }

        System.out.print("Choisissez la potion à utiliser : ");
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();

        if (choix < 1 || choix > potions.size()) {
            System.out.println("Choix invalide.");
            return;
        }

        Potion potion = potions.remove(choix - 1);
        potion.appliquer(p);
        System.out.println("Potion utilisée !");
    }
}
