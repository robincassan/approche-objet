package TP26;

public class Main {
    public static void main(String[] args) {
        Dessin d = new Dessin();

        d.add(new Carre(new Point(10, 10), 20));
        d.add(new Rond(new Point(50, 50), 30));

        // Ce point est hors limites (x = 105)
        d.add(new Rectangle(new Point(105, 20), 10, 10));

        try {
            d.imprime();
        } catch (DessinHorsLimiteException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}


