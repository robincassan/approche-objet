package TP25;

import java.util.Arrays;
import java.util.Collection;

public class Carre extends Figure {
    protected Point coin;
    protected double cote;

    public Carre(Point coin, double cote) {
        this.coin = coin;
        this.cote = cote;
    }

    @Override
    public double surface() {
        return cote * cote;
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
