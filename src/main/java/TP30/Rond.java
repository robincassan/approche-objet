package TP30;

import java.util.Arrays;
import java.util.Collection;

public class Rond extends Figure {
    private Point centre;
    private double rayon;

    public Rond(Point centre, double rayon) {
        super();
        this.centre = centre;
        this.rayon = rayon;
    }

    public Rond(Point centre, double rayon, Couleur couleur) {
        super(couleur);
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public double distanceOrigine() {
        return centre.distanceOrigine();
    }

    @Override
    public Collection<Point> getPoints() {
        return Arrays.asList(centre);
    }

    @Override
    public boolean couvre(Point p) {
        return centre.distance(p) <= rayon;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Rond)) return false;

        Rond other = (Rond) obj;
        return this.rayon == other.rayon && this.centre.equals(other.centre);
    }

    @Override
    public String toString() {
        return "Rond{" +
                "centre=" + centre +
                ", rayon=" + rayon +
                ", couleur=" + couleur +
                '}';
    }

    public static Rond generateAleatoire() {
        Point centre = new Point((int)(Math.random() * 100), (int)(Math.random() * 100));
        double rayon = 1 + Math.random() * 20;
        Couleur couleur = Couleur.getCouleurAleatoire();
        return new Rond(centre, rayon, couleur);
    }
}


