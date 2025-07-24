package TP15072025_apresmidi;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(3, 7);
        Point p2 = new Point(-2, 0);

        System.out.println("Point 1 : " + p1); // Affiche [3;7]
        System.out.println("Point 2 : " + p2); // Affiche [-2;0]

        System.out.println("Coordonnées de p1 : x=" + p1.getX() + ", y=" + p1.getY());

        Point p = new Point();
        System.out.println("Point par défaut : " + p); // [25;25]
    }
}
