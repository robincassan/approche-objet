package TP21;

import java.util.Collection;

public class TestDessin {
    public static void main(String[] args) {
        Dessin dessin = new Dessin();

        Collection<Figure> figuresAleatoires = FigureUtils.genere(5);

        for (Figure f : figuresAleatoires) {
            dessin.add(f);
        }

        System.out.println("Figures du dessin :");
        for (Figure f : dessin.getFigures()) {
            System.out.println(f.getClass().getSimpleName() + " → Points : " + f.getPoints());
        }

        System.out.println("\nTous les points du dessin :");
        Collection<Point> tousLesPoints = FigureUtils.getPoints(dessin.getFigures());
        for (Point p : tousLesPoints) {
            System.out.println(p);
        }
    }
}
