package fr.diginamic.combat;

public class Loup extends Creature{

    public Loup(int force, int sante) {
        super(force, sante);
    }

    @Override
    public int getScoreGagne() {
        return 1;
    }

    @Override
    public String getNom() {
        return "Loup";
    }
}
