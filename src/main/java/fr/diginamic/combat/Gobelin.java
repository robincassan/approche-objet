package fr.diginamic.combat;

public class Gobelin extends Creature{

    public Gobelin(int force, int sante) {
        super(force, sante);
    }

    @Override
    public int getScoreGagne() {
        return 2;
    }

    @Override
    public String getNom() {
        return "Gobelin";
    }
}
