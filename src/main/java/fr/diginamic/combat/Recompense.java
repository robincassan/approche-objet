package fr.diginamic.combat;

import java.util.Random;

public class Recompense {
    public static void attribuer(Personnage p) {
        Random r = new Random();
        if (r.nextBoolean()) {
            int choix = r.nextInt(4);
            switch (choix) {
                case 0 -> p.getInventaire().ajouterPotion(PotionUtil.potionSoin());
                case 1 -> p.getInventaire().ajouterPotion(PotionUtil.potionAttaqueMineure());
                case 2 -> p.getInventaire().ajouterPotion(PotionUtil.potionAttaqueMajeure());
                case 3 -> p.ajouterScore(5);
            }
            System.out.println("Vous avez reçu une récompense !");
        } else {
            System.out.println("Pas de récompense cette fois.");
        }
    }
}
