package TP13;

public class TestEgalite {

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Point p3 = new Point(1, 1);

        System.out.println("Point : " + p1.equals(p2)); // true
        System.out.println("Point : " + p1.equals(p3)); // false

        Rectangle r1 = new Rectangle(new Point(0, 0), 2, 2);
        CarreHerite c1 = new CarreHerite(new Point(0, 0), 2);
        Carre c2 = new Carre(new Point(0, 0), 2);

        System.out.println("Rectangle == CarreHerite : " + r1.equals(c1)); // true
        System.out.println("CarreHerite == Rectangle : " + c1.equals(r1)); // true
        System.out.println("Carre == CarreHerite : " + c2.equals(c1));     // true
        System.out.println("CarreHerite == Carre : " + c1.equals(c2));     // true
    }
}
