package TP20;

import TP15.Surfacable;


public class FigureUtils {

    public static Point[] getPoints(Figure... figures) {
        // 1er passage : compter le nombre total de points
        int totalPoints = 0;
        for (Figure f : figures) {
            totalPoints += f.getPoints().length;
        }

        // 2e passage : remplir le tableau
        Point[] result = new Point[totalPoints];
        int index = 0;
        for (Figure f : figures) {
            for (Point p : f.getPoints()) {
                result[index++] = p;
            }
        }

        return result;
    }
}
