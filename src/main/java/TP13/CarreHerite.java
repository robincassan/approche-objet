package TP13;

public class CarreHerite extends Rectangle {

    public CarreHerite(Point origine, int cote) {
        super(origine, cote, cote);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) obj;
        return this.origine.equals(other.origine)
                && this.largeur == other.largeur
                && this.hauteur == other.hauteur;
    }

    @Override
    public String toString() {
        return "CARRE_HERITE " + origine + " côté=" + largeur;
    }

    @Override
    public void affiche() {
        System.out.println(this);
    }
}
