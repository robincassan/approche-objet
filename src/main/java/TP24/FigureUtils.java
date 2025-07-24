package TP24;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FigureUtils {

    // Tri par distance à l'origine (utilise Comparable<Figure>)
    public static List<Figure> trieProcheOrigine(Dessin d) {
        return d.getFigures()
                .stream()
                .sorted() // nécessite que Figure implémente Comparable<Figure>
                .collect(Collectors.toList());
    }

    // Tri par surface décroissante, supprime les figures sans surface
    public static List<Figure> trieDominant(Dessin d) {
        return d.getFigures()
                .stream()
                .filter(f -> f.surface() > 0)
                .sorted(Comparator.comparingDouble(Figure::surface).reversed())
                .collect(Collectors.toList());
    }
}