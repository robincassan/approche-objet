package fr.diginamic.combat;

import java.util.Random;

public class CreatureFactory {
    public static Creature creerCreatureAleatoire() {
        Random r = new Random();
        int choix = r.nextInt(3);
        return switch (choix) {
            case 0 -> new Loup(r.nextInt(6) + 3, r.nextInt(6) + 5);       // force 3-8, sante 5-10
            case 1 -> new Gobelin(r.nextInt(6) + 5, r.nextInt(6) + 10);    // force 5-10, sante 10-15
            default -> new Troll(r.nextInt(6) + 10, r.nextInt(11) + 20);   // force 10-15, sante 20-30
        };
    }
}
