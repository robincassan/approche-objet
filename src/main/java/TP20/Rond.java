package TP20;

public class Rond extends Figure {
    private Point centre;
    private double rayon;

    public Rond(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public Point[] getPoints() {
        return new Point[] { centre };
    }
}


