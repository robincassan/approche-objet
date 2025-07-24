package TP22;

import java.util.Arrays;
import java.util.Collection;

public class Rectangle extends Figure {
    private Point coin;
    private double largeur, hauteur;

    public Rectangle(Point coin, double largeur, double hauteur) {
        this.coin = coin;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public Collection<Point> getPoints() {
        Point coin2 = new Point(coin.getX() + largeur, coin.getY());
        Point coin3 = new Point(coin.getX(), coin.getY() + hauteur);
        Point coin4 = new Point(coin.getX() + largeur, coin.getY() + hauteur);
        return Arrays.asList(coin, coin2, coin3, coin4);
    }

    @Override
    public boolean couvre(Point p) {
        double x = p.getX();
        double y = p.getY();

        return x >= coin.getX() &&
                x <= coin.getX() + largeur &&
                y >= coin.getY() &&
                y <= coin.getY() + hauteur;
    }
}
