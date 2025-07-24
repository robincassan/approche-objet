package TP23;

import java.util.Collection;

public abstract class Figure {
    public abstract Collection<Point> getPoints();

    //Méthode à implémenter dans chaque sous-classe
    public abstract boolean couvre(Point p);

}
