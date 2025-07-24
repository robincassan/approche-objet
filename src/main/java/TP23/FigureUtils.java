package TP23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class FigureUtils {
    private static Random rand = new Random();

    public static Collection<Point> getPoints(Collection<Figure> figures) {
        Collection<Point> points = new ArrayList<>(); // Justification : permet les doublons, insertion rapide

        for (Figure figure : figures) {
            points.addAll(figure.getPoints());
        }
        return points;
    }

    public static Collection<Figure> genere(int n){
        Collection<Figure> figures = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int type = rand.nextInt(4); // 0 à 3
            Point p1 = new Point(rand.nextInt(100), rand.nextInt(100));
            switch (type) {
                case 0:
                    figures.add(new Rond(p1, rand.nextInt(20) + 1));
                    break;
                case 1:
                    Point p2 = new Point(rand.nextInt(100), rand.nextInt(100));
                    figures.add(new Segment(p1, p2));
                    break;
                case 2:
                    figures.add(new Rectangle(p1, rand.nextInt(20) + 1, rand.nextInt(20) + 1));
                    break;
                case 3:
                    figures.add(new Carre(p1, rand.nextInt(20) + 1));
                    break;
            }
        }
        return figures;
    }
    public static Figure getFigureEn(Point p, Dessin d) {
        Iterator<Figure> it = d.getFigures().iterator();

        while (it.hasNext()){
            Figure f = it.next();
            if (f.couvre(p)){
                return f; // on retourne la première figure qui couvre le point
            }
        }
        return null; // Aucune figure ne couvre ce point
    }
}
