package fr.diginamic.combat;

import java.util.Random;

public class PotionUtil {
    public static Potion potionSoin() {
        return new Potion(PotionType.SOIN, new Random().nextInt(6) + 5, 0); // +5 à +10
    }

    public static Potion potionAttaqueMineure() {
        return new Potion(PotionType.ATTAQUE_MINEURE, 3, 1);
    }

    public static Potion potionAttaqueMajeure() {
        return new Potion(PotionType.ATTAQUE_MAJEURE, 5, 2);
    }
}
