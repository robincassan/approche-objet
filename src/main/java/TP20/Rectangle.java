package TP20;

public class Rectangle extends Figure {
    private Point coin;
    private double largeur, hauteur;

    public Rectangle(Point coin, double largeur, double hauteur) {
        this.coin = coin;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public Point[] getPoints() {
        Point coin2 = new Point(coin.getX() + largeur, coin.getY());
        Point coin3 = new Point(coin.getX(), coin.getY() + hauteur);
        Point coin4 = new Point(coin.getX() + largeur, coin.getY() + hauteur);
        return new Point[] { coin, coin2, coin3, coin4 };
    }
}
