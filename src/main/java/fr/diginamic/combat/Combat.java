package fr.diginamic.combat;

public class Combat {
    public static void lancer(Personnage p, Creature c) {
        System.out.println("Vous combattez un " + c.getNom());

        while (p.estVivant() && c.estVivant()) {
            int attaqueP = p.attaque();
            int attaqueC = c.attaque();

            if (attaqueP > attaqueC) {
                int degats = attaqueP - attaqueC;
                c.subirDegats(degats);
                System.out.println("Vous infligez " + degats + " à " + c.getNom());
            } else if (attaqueC > attaqueP) {
                int degats = attaqueC - attaqueP;
                p.subirDegats(degats);
                System.out.println(c.getNom() + " vous inflige " + degats);
            } else {
                System.out.println("Égalité ce tour !");
            }

            p.decrementerBonus();
        }

        if (!p.estVivant()) {
            System.out.println("Vous êtes mort. Score final : " + p.getScore());
        } else {
            p.ajouterScore(c.getScoreGagne());
            System.out.println("Victoire ! Score : " + p.getScore());
            Recompense.attribuer(p);
        }
    }
}