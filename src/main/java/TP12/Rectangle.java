package TP12;

public class Rectangle{
    protected Point p1, p2, p3, p4;

    public Rectangle(Point origine, int largeur, int hauteur) {
        int x = origine.getX();
        int y = origine.getY();

        this.p1 = origine;
        this.p2 = new Point(x + largeur, y);
        this.p3 = new Point(x + largeur, y + hauteur);
        this.p4 = new Point(x, y + hauteur);
    }

    protected String getType() {
        return "RECT";
    }

    @Override
    public String toString() {
        return getType() + " " + p1 + p2 + p3 + p4;
    }

    public void affiche() {
        System.out.println(this.toString());
    }

}
