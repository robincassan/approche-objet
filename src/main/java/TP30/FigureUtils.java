package TP30;

import java.util.HashMap;
import java.util.Map;

public class FigureUtils {
    private static final Map<String, Figure> figureMap = new HashMap<>();

    // Génère un rond aléatoire et l'enregistre avec un ID
    public static Rond getRandomRond(String id) {
        Point centre = new Point(Math.random() * 100, Math.random() * 100);
        double rayon = Math.random() * 50 + 1;
        Rond rond = new Rond(centre, rayon);
        figureMap.put(id, rond);
        return rond;
    }

    public static Rectangle getRandomRectangle(String id) {
        Point coin = new Point(Math.random() * 100, Math.random() * 100);
        double largeur = Math.random() * 100 + 10;
        double hauteur = Math.random() * 100 + 10;
        Rectangle rect = new Rectangle(coin, largeur, hauteur);
        figureMap.put(id, rect);
        return rect;
    }

    public static Carre getRandomCarre(String id) {
        Point coin = new Point(Math.random() * 100, Math.random() * 100);
        double cote = Math.random() * 100 + 10;
        Carre carre = new Carre(coin, cote);
        figureMap.put(id, carre);
        return carre;
    }

    public static Segment getRandomSegment(String id) {
        Point p1 = new Point(Math.random() * 100, Math.random() * 100);
        Point p2 = new Point(Math.random() * 100, Math.random() * 100);
        Segment seg = new Segment(p1, p2);
        figureMap.put(id, seg);
        return seg;
    }

    // Accès par ID
    public static Figure get(String id) {
        return figureMap.get(id); // null si non trouvé
    }
}
