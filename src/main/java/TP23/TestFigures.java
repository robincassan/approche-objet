package TP23;

public class TestFigures {
    public static void main(String[] args) {
        Point origine = new Point(0, 0);
        Rond rond = new Rond(origine, 3);
        Carre carre = new Carre(origine, 2);
        Rectangle rect = new Rectangle(origine, 2, 2);
        Rectangle autreRect = new Rectangle(origine, 3, 2);

        System.out.println("carre == rect ? " + carre.equals(rect));      // true
        System.out.println("rect == carre ? " + rect.equals(carre));      // true
        System.out.println("rect == autreRect ? " + rect.equals(autreRect)); // false
        System.out.println("rect == rond ? " + rect.equals(rond)); //false
        System.out.println("rond == rect ? " + rond.equals(rect)); //false

        Point test1 = new Point(1, 1);
        Point test2 = new Point(3, 3);
        System.out.println("carre couvre (1,1) ? " + carre.couvre(test1)); // true
        System.out.println("carre couvre (3,3) ? " + carre.couvre(test2)); // false
    }
}
