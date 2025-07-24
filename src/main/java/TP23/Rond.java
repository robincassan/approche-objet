package TP23;

import java.util.Collection;
import java.util.Collections;

public class Rond extends Figure {
    private Point centre;
    private double rayon;

    public Rond(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public Collection<Point> getPoints() {
        // Collections.singletonList() : collection immuable d’un seul élément.
        return Collections.singletonList(centre);
    }

    @Override
    public boolean couvre(Point p) {
        double dx = p.getX() - centre.getX();
        double dy = p.getY() - centre.getY();
        return (dx * dx + dy * dy ) <= rayon * rayon;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rond)) return false;
        Rond other = (Rond) obj;
        return this.rayon == other.rayon && this.centre.equals(other.centre);
    }
}


