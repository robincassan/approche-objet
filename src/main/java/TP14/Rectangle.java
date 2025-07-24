package TP14;

public class Rectangle extends Figure {
    protected int largeur;
    protected int hauteur;

    public Rectangle(Point origine, int largeur, int hauteur) {
        super(origine);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return "RECTANGLE " + origine + " largeur=" + largeur + " hauteur=" + hauteur;
    }

    public void affiche() {
        System.out.println(this);
    }
}
