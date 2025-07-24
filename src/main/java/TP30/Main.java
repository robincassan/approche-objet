package TP30;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();

        // Génération aléatoire de figures avec couleurs
        figures.add(Carre.generateAleatoire());
        figures.add(Rectangle.generateAleatoire());
        figures.add(Rond.generateAleatoire());
        figures.add(Segment.generateAleatoire());

        System.out.println("▶️ Figures générées :");
        for (Figure f : figures) {
            System.out.println(f + " | surface = " + f.surface() + ", distanceOrigine = " + f.distanceOrigine());
        }

        System.out.println("\n🔁 Tri par distance à l'origine :");
        Collections.sort(figures);
        for (Figure f : figures) {
            System.out.println(f + " | distanceOrigine = " + f.distanceOrigine());
        }

        System.out.println("\n🟰 Comparaison d'égalité :");
        Figure f1 = new Carre(new Point(0, 0), 10, Couleur.ROUGE);
        Figure f2 = new Carre(new Point(0, 0), 10, Couleur.ROUGE);
        Figure f3 = new Carre(new Point(0, 0), 10, Couleur.BLEU);

        System.out.println("f1 == f2 ? " + f1.equals(f2)); // true
        System.out.println("f1 == f3 ? " + f1.equals(f3)); // false
    }
}



