package TP15;

public class Carre extends Figure implements Surfacable{
    private int cote;

    public Carre(Point origine, int cote) {
        super(origine);
        this.cote = cote;
    }

    @Override
    public double surface(){
        return cote * cote;
    }

    @Override
    public String toString() {
        return "CARRE " + origine + " côté=" + cote;
    }

    public void affiche() {
        System.out.println(this);
    }
}
