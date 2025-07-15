package TP15072025_apresmidi;

public class TestRond {
    public static void main(String[] args) {
        Point centre = new Point(5, 10);
        Rond rond = new Rond(centre, 8);

        rond.affiche(); // Affiche : ROND [5;10] , 8
    }
}
