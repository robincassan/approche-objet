package TP21;

import java.util.Arrays;
import java.util.Collection;

public class Segment extends Figure {
    private Point p1, p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public Collection<Point> getPoints() {
        return Arrays.asList(p1, p2);
    }
}
