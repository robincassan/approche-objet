package fr.diginamic.combat;

public class Troll extends Creature{

    public Troll(int force, int sante) {
        super( force, sante);
    }

    @Override
    public int getScoreGagne() {
        return 5;
    }

    @Override
    public String getNom() {
        return "Troll";
    }
}
