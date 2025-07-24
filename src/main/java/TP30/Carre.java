package TP30;

import java.util.Arrays;
import java.util.Collection;

public class Carre extends Figure {
    protected Point coin;
    protected double cote;

    public Carre(Point coin, double cote) {
        super();
        this.coin = coin;
        this.cote = cote;
    }

    public Carre(Point coin, double cote, Couleur couleur) {
        super(couleur);
        this.coin = coin;
        this.cote = cote;
    }

    @Override
    public double surface() {
        return cote * cote;
    }

    @Override
    public double distanceOrigine() {
        return coin.distanceOrigine();
    }

    @Override
    public Collection<Point> getPoints() {
        Point p1 = coin;
        Point p2 = new Point(coin.getX() + (int)cote, coin.getY());
        Point p3 = new Point(coin.getX() + (int)cote, coin.getY() + (int)cote);
        Point p4 = new Point(coin.getX(), coin.getY() + (int)cote);
        return Arrays.asList(p1, p2, p3, p4);
    }

    @Override
    public boolean couvre(Point p) {
        double x = p.getX();
        double y = p.getY();
        return x >= coin.getX() && x <= coin.getX() + cote &&
                y >= coin.getY() && y <= coin.getY() + cote;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;

        if (obj instanceof Carre) {
            Carre other = (Carre) obj;
            return getPoints().equals(other.getPoints());
        }

        if (obj instanceof Rectangle) {
            return getPoints().equals(((Rectangle) obj).getPoints());
        }

        return false;
    }

    @Override
    public String toString() {
        return "Carre{" +
                "coin=" + coin +
                ", cote=" + cote +
                ", couleur=" + couleur +
                '}';
    }

    public static Carre generateAleatoire() {
        Point coin = new Point((int)(Math.random() * 90), (int)(Math.random() * 90));
        double cote = 1 + Math.random() * 10;
        Couleur couleur = Couleur.getCouleurAleatoire();
        return new Carre(coin, cote, couleur);
    }
}

