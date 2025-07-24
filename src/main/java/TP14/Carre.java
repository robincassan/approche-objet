package TP14;

public class Carre extends Figure {
    private int cote;

    public Carre(Point origine, int cote) {
        super(origine);
        this.cote = cote;
    }

    @Override
    public String toString() {
        return "CARRE " + origine + " côté=" + cote;
    }

    public void affiche() {
        System.out.println(this);
    }
}
