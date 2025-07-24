package TP15;

public class Rectangle extends Figure implements Surfacable {
    protected int largeur;
    protected int hauteur;

    public Rectangle(Point origine, int largeur, int hauteur) {
        super(origine);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double surface() {
        return largeur * hauteur;
    }

    @Override
    public String toString() {
        return "RECTANGLE " + origine + " largeur=" + largeur + " hauteur=" + hauteur;
    }

    public void affiche() {
        System.out.println(this);
    }
}
