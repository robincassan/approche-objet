package TP13;

public class Rectangle {
    protected Point origine;
    protected int largeur;
    protected int hauteur;

    public Rectangle(Point origine, int largeur, int hauteur) {
        this.origine = origine;
        this.largeur = largeur;
        this.hauteur = hauteur;
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
        return "RECTANGLE " + origine + " largeur=" + largeur + " hauteur=" + hauteur;
    }

    public void affiche() {
        System.out.println(this);
    }
}
