package fr.diginamic.combat;

import java.util.Random;

public abstract class Creature {
    protected int force;
    protected int sante;

    public Creature(int force, int sante) {
        this.force = force;
        this.sante = sante;
    }

    public int attaque() {
        Random r = new Random();
        return force + r.nextInt(10) + 1;
    }

    public void subirDegats(int degats) {
        sante -= degats;
        if (sante < 0) sante = 0;
    }

    public boolean estVivant() {
        return sante > 0;
    }

    public abstract int getScoreGagne();
    public abstract String getNom();
}
