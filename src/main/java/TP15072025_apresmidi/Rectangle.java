package TP15072025_apresmidi;

public class Rectangle {
    private Point basGauche;
    private int largeur;
    private int hauteur;

    // Constructeur
    public Rectangle(Point basGauche, int largeur, int hauteur) {
        this.basGauche = basGauche;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    // Point en bas à gauche (origine)
    public Point getPointBasGauche() {
        return basGauche;
    }

    // Point en bas à droite (x + largeur, y)
    public Point getPointBasDroit() {
        return new Point(basGauche.getX() + largeur, basGauche.getY());
    }

    // Point en haut à gauche (x, y + hauteur)
    public Point getPointHautGauche() {
        return new Point(basGauche.getX(), basGauche.getY() + hauteur);
    }

    // Point en haut à droite (x + largeur, y + hauteur)
    public Point getPointHautDroit() {
        return new Point(basGauche.getX() + largeur, basGauche.getY() + hauteur);
    }

    // toString personnalisé
    @Override
    public String toString() {
        return "RECT " +
                getPointBasGauche().toString() +
                getPointBasDroit().toString() +
                getPointHautDroit().toString() +
                getPointHautGauche().toString();
    }

    //  Affichage via toString()
    public void affiche() {
        System.out.println(this.toString());
    }

}
