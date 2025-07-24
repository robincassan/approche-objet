package TP24;

import java.util.Arrays;
import java.util.Collection;

public class Rectangle extends Figure {
    protected Point coin;
    protected double largeur;
    protected double hauteur;

    public Rectangle(Point coin, double largeur, double hauteur) {
        this.coin = coin;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double surface() {
        return largeur * hauteur;
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
        if (this == obj) return true;

        if (obj instanceof Rectangle) {
            return getPoints().equals(((Rectangle) obj).getPoints());
        }

        if (obj instanceof Carre) {
            return getPoints().equals(((Carre) obj).getPoints());
        }

        return false;
    }
}
