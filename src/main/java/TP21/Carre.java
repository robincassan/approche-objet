package TP21;

import java.util.Arrays;
import java.util.Collection;

public class Carre extends Figure {
    private Point coin;
    private double cote;

    public Carre(Point coin, double cote) {
        this.coin = coin;
        this.cote = cote;
    }

    @Override
    public Collection<Point> getPoints() {
        Point coin2 = new Point(coin.getX() + cote, coin.getY());
        Point coin3 = new Point(coin.getX(), coin.getY() + cote);
        Point coin4 = new Point(coin.getX() + cote, coin.getY() + cote);
        return Arrays.asList(coin, coin2, coin3, coin4);
    }
}
