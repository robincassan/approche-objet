package TP12;


public class Carre {
    private Point p1, p2, p3, p4; // Les 4 sommets du carré

    public Carre(Point origine, int cote){
        int x = origine.getX();
        int y = origine.getY();

        this.p1 = origine;
        this.p2 = new Point(x + cote, y);
        this.p3 = new Point(x + cote, y + cote);
        this.p4 = new Point(x, y + cote);
    }

    @Override
    public String toString() {
        return "CARRE " + p1 + p2 + p3 + p4;
    }
    public void affiche(){
        System.out.println(this.toString());
    }

}
