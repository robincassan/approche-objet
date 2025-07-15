package TP15072025_apresmidi;

public class TestRectangle {
    public static void main(String[] args) {
        Point origine = new Point(2, 3);
        Rectangle rect = new Rectangle(origine, 4, 5);

        rect.affiche(); // RECT [2;3][6;3][6;8][2;8]
    }
}
