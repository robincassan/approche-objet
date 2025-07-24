package TP12;

public class TestCarre {
    public static void main(String[] args) {
        Point origine = new Point(2,3);
        Carre carre = new Carre(origine, 5);

        carre.affiche(); //Affiche CARRE avec coordonnées de ses 4 sommets
    }
}
