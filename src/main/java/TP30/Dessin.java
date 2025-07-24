package TP30;

import java.util.ArrayList;
import java.util.Collection;

public class Dessin {
    private Collection<Figure> figures;


    public Dessin() {
        //justification : ArrayList permet de conserver l'ordre d'ajout et est rapide en lecture/ajout
        this.figures = new ArrayList<>();
    }

    public boolean add(Figure figure) {
        return figures.add(figure);
    }

    public Collection<Figure> getFigures() {
        return figures;
    }

    // Nouvelle méthode pour imprimer les figures avec vérification
    public void imprime() throws DessinHorsLimiteException {
        for (Figure fig : figures) {
            for (Point p : fig.getPoints()) {
                if (p.getX() < 0 || p.getX() > 99 || p.getY() < 0 || p.getY() > 99) {
                    throw new DessinHorsLimiteException("Figure hors limites : " + fig);
                }
            }
            System.out.println(fig);
        }
    }
}
