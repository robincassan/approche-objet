package TP20;

public class Segment extends Figure {
    private Point p1, p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public Point[] getPoints() {
        return new Point[] { p1, p2 };
    }
}
