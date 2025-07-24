package TP30;

import java.util.Arrays;
import java.util.Collection;


public class Segment extends Figure {
    private Point p1, p2;

    public Segment(Point p1, Point p2) {
        super();
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(Point p1, Point p2, Couleur couleur) {
        super(couleur);
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public double surface() {
        return 0;
    }

    @Override
    public double distanceOrigine() {
        return Math.min(p1.distanceOrigine(), p2.distanceOrigine());
    }

    @Override
    public Collection<Point> getPoints() {
        return Arrays.asList(p1, p2);
    }

    @Override
    public boolean couvre(Point p) {
        double total = p1.distance(p2);
        double d1 = p1.distance(p);
        double d2 = p2.distance(p);
        return Math.abs((d1 + d2) - total) < 1e-6;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Segment)) return false;
        Segment other = (Segment) obj;
        return (p1.equals(other.p1) && p2.equals(other.p2)) || (p1.equals(other.p2) && p2.equals(other.p1));
    }

    @Override
    public String toString() {
        return "Segment[" + p1 + " -> " + p2 + "], " + couleur;
    }

    public static Segment generateAleatoire() {
        Point p1 = new Point((int)(Math.random() * 100), (int)(Math.random() * 100));
        Point p2 = new Point((int)(Math.random() * 100), (int)(Math.random() * 100));
        Couleur couleur = Couleur.getCouleurAleatoire();
        return new Segment(p1, p2, couleur);
    }
}
