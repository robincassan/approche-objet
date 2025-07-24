package TP24;

public class Main {
    public static void main(String[] args) {
        Dessin dessin = new Dessin();

        // Création de quelques figures
        dessin.add(new Segment(new Point(0, 0), new Point(1, 1)));
        dessin.add(new Rond(new Point(5, 5), 2));
        dessin.add(new Carre(new Point(1, 1), 2));
        dessin.add(new Rectangle(new Point(-1, -1), 2, 1));
        dessin.add(new Rond(new Point(0, 0), 1));

        System.out.println("=== Tri par distance à l'origine ===");
        for (Figure f : FigureUtils.trieProcheOrigine(dessin)) {
            System.out.printf("%s - distance : %.2f%n", f.getClass().getSimpleName(), f.distanceOrigine());
        }

        System.out.println("\n=== Tri par surface décroissante ===");
        for (Figure f : FigureUtils.trieDominant(dessin)) {
            System.out.printf("%s - surface : %.2f%n", f.getClass().getSimpleName(), f.surface());
        }
    }
}
