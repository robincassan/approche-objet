package TP30;

import java.util.Arrays;
import java.util.Collection;

public class Rectangle extends Figure {
    protected Point coin;
    protected double largeur;
    protected double hauteur;

    public Rectangle(Point coin, double largeur, double hauteur) {
        super();
        this.coin = coin;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public Rectangle(Point coin, double largeur, double hauteur, Couleur couleur) {
        super(couleur);
        this.coin = coin;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double surface() {
        return largeur * hauteur;
    }

    @Override
    public double distanceOrigine() {
        return coin.distanceOrigine();
    }

    @Override
    public Collection<Point> getPoints() {
        Point p1 = coin;
        Point p2 = new Point(coin.getX() + (int)largeur, coin.getY());
        Point p3 = new Point(coin.getX() + (int)largeur, coin.getY() + (int)hauteur);
        Point p4 = new Point(coin.getX(), coin.getY() + (int)hauteur);
        return Arrays.asList(p1, p2, p3, p4);
    }

    @Override
    public boolean couvre(Point p) {
        double x = p.getX();
        double y = p.getY();
        return x >= coin.getX() && x <= coin.getX() + largeur &&
                y >= coin.getY() && y <= coin.getY() + hauteur;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;

        if (obj instanceof Rectangle) {
            return getPoints().equals(((Rectangle) obj).getPoints());
        }

        if (obj instanceof Carre) {
            return getPoints().equals(((Carre) obj).getPoints());
        }

        return false;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "coin=" + coin +
                ", largeur=" + largeur +
                ", hauteur=" + hauteur +
                ", couleur=" + couleur +
                '}';
    }

    public static Rectangle generateAleatoire() {
        Point coin = new Point((int)(Math.random() * 90), (int)(Math.random() * 90));
        double largeur = 1 + Math.random() * 10;
        double hauteur = 1 + Math.random() * 10;
        Couleur couleur = Couleur.getCouleurAleatoire();
        return new Rectangle(coin, largeur, hauteur, couleur);
    }
}