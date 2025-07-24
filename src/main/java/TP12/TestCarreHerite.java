package TP12;

public class TestCarreHerite {
    public static void main(String[] args) {
        Point origine = new Point(5, 5);
        CarreHerite carre = new CarreHerite(origine, 4);

        carre.affiche(); // Affiche : CARRE [5;5][9;5][9;9][5;9]

        Rectangle rect = new Rectangle(origine, 6, 3);
        rect.affiche();  // Affiche : RECT [5;5][11;5][11;8][5;8]
    }
}
