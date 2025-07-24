package TP25;

import java.util.Arrays;
import java.util.Collection;

public class Segment extends Figure {
    private Point p1, p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public double surface() {
        return 0;
    }

    @Override
    public Collection<Point> getPoints() {
        return Arrays.asList(p1, p2);
    }

    @Override
    public boolean couvre(Point p) {
        return p.equals(p1) || p.equals(p2);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Segment)) return false;
        Segment other = (Segment) obj;
        return this.p1.equals(other.p1) && this.p2.equals(other.p2);
    }
}
