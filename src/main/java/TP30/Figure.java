package TP30;

import java.util.Collection;

public abstract class Figure implements Comparable<Figure> {
    protected Couleur couleur;

    public Figure() {
        this.couleur = Couleur.getCouleurDefaut();
    }

    public Figure(Couleur couleur) {
        this.couleur = (couleur != null) ? couleur : Couleur.getCouleurDefaut();
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public abstract double surface();

    public abstract double distanceOrigine();

    public abstract Collection<Point> getPoints();

    public abstract boolean couvre(Point p);

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Figure)) return false;
        Figure other = (Figure) obj;
        return this.couleur == other.couleur;
    }

    @Override
    public String toString() {
        return "Couleur: " + couleur;
    }

    @Override
    public int compareTo(Figure autre) {
        return Double.compare(this.distanceOrigine(), autre.distanceOrigine());
    }
}
