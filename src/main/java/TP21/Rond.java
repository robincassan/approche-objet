package TP21;

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
}


