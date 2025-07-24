package fr.diginamic.combat;

import java.util.Random;

public class PersonnageFactory {
    private static final Random r = new Random();

    public static Personnage creerPersonnage() {
        int force = r.nextInt(7) + 12; // 12 à 18
        int sante = r.nextInt(31) + 20; // 20 à 50
        Personnage perso = new Personnage(force, sante);
        return perso;
    }
}
