package TP20;

public class Carre extends Figure {
    private Point coin;
    private double cote;

    public Carre(Point coin, double cote) {
        this.coin = coin;
        this.cote = cote;
    }

    @Override
    public Point[] getPoints() {
        Point coin2 = new Point(coin.getX() + cote, coin.getY());
        Point coin3 = new Point(coin.getX(), coin.getY() + cote);
        Point coin4 = new Point(coin.getX() + cote, coin.getY() + cote);
        return new Point[] { coin, coin2, coin3, coin4 };
    }
}
