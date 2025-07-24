package fr.diginamic.combat;

import java.util.Random;

public class Personnage {
    private int force;
    private int sante;
    private int score;
    private int bonusAttaque = 0;
    private int dureeBonus = 0;
    private Inventaire inventaire = new Inventaire();

    public Personnage(int force, int sante) {
        this.force = force;
        this.sante = sante;
        this.score = 0;
        inventaire.ajouterPotion(PotionUtil.potionSoin());
        inventaire.ajouterPotion(PotionUtil.potionAttaqueMineure());
        inventaire.ajouterPotion(PotionUtil.potionAttaqueMajeure());
    }

    public boolean estVivant() {
        return sante > 0;
    }

    public int attaque() {
        Random r = new Random();
        int attaqueBase = force + r.nextInt(10) + 1 + bonusAttaque;
        return attaqueBase;
    }

    public void subirDegats(int degats) {
        sante -= degats;
        if (sante < 0) sante = 0;
    }

    public void soigner(int quantite) {
        sante += quantite;
    }

    public void appliquerBonusAttaque(int bonus, int duree) {
        this.bonusAttaque = bonus;
        this.dureeBonus = duree;
    }

    public void decrementerBonus() {
        if (dureeBonus > 0) {
            dureeBonus--;
            if (dureeBonus == 0) bonusAttaque = 0;
        }
    }

    public void ajouterScore(int points) {
        score += points;
    }

    public void utiliserPotion() {
        inventaire.utiliserPotion(this);
    }

    // Getters
    public int getSante() { return sante; }
    public int getScore() { return score; }
    public Inventaire getInventaire() { return inventaire; }
}