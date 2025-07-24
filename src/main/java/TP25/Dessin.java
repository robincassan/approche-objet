package TP25;

import java.util.ArrayList;
import java.util.Collection;

public class Dessin {
    private Collection<Figure> figures;


    public Dessin(){
        //justification : ArrayList permet de conserver l'ordre d'ajout et est rapide en lecture/ajout
        this.figures = new ArrayList<>();
    }

    public boolean add(Figure figure){
        return figures.add(figure);
    }

    public Collection<Figure> getFigures() {
        return figures;
    }
}
