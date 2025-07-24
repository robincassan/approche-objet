package TP15072025_apresmidi;
import java.util.Random;

public class FigureUtil {
    private static final Random rand = new Random();

    public static Rond getRandomRond() {
        int x = rand.nextInt(100);        // entre 0 et 99
        int y = rand.nextInt(100);
        int rayon = rand.nextInt(50) + 1; // entre 1 et 50 (pas de rayon nul)

        Point centre = new Point(x, y);
        return new Rond(centre, rayon);
    }

    public static Rectangle getRandomRectangle() {
        int x = rand.nextInt(100);
        int y = rand.nextInt(100);
        int largeur = rand.nextInt(50) + 1;
        int hauteur = rand.nextInt(50) + 1;

        Point basGauche = new Point(x, y);
        return new Rectangle(basGauche, largeur, hauteur);
    }
}
