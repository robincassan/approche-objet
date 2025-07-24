package TP13;

public class Carre {
    private Point sommet;
    private int cote;

    public Carre(Point sommet, int cote) {
        this.sommet = sommet;
        this.cote = cote;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) obj;
        return this.sommet.equals(other.origine)
                && other.largeur == cote
                && other.hauteur == cote;
    }

    @Override
    public String toString() {
        return "CARRE " + sommet + " côté=" + cote;
    }

    public void affiche() {
        System.out.println(this);
    }
}
