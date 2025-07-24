package TP15;

public class Segment extends Figure {
    private int longueur;
    private boolean horizontal;

    public Point getFin() {
        if (horizontal) {
            return new Point(origine.getX() + longueur, origine.getY());
        } else {
            return new Point(origine.getX(), origine.getY() + longueur);
        }
    }

    public Segment(Point debut, int longueur, boolean horizontal){
        super(debut);
        this.longueur = longueur;
        this.horizontal = horizontal;
    }
    @Override
    public void affiche(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "SEGMENT " + "[" + origine + " à " + getFin() + "]";
    }
}
