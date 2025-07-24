package TP26;

import java.util.Collection;

public abstract class Figure implements Comparable<Figure>{
    public static final Point ORIGINE = new Point(0, 0);

    //Méthode à implémenter dans chaque sous-classe
    public abstract Collection<Point> getPoints();
    public abstract boolean couvre(Point p);

    public double distanceOrigine() {
        return getPoints()
                .stream()
                .mapToDouble(p -> p.distance(ORIGINE))
                .min()
                .orElse(Double.MAX_VALUE); // cas extrême si aucune coordonnée (devrait pas arriver)
    }

    // Comparaison par distance à l’origine (pour le tri naturel)
    @Override
    public int compareTo(Figure other) {
        return Double.compare(this.distanceOrigine(), other.distanceOrigine());
    }

    // Surface de la figure (exigée pour trieDominant)
    public abstract double surface();

}
