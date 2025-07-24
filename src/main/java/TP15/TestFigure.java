package TP15;


public class TestFigure {
    public static void main(String[] args) {
        System.out.println("=== Figures aléatoires ===");
        for (int i = 0; i < 5; i++) {
            Figure f = FigureUtils.getRandomFigure();
            f.affiche();
        }

        System.out.println("\n=== Surfacables aléatoires ===");
        for (int i = 0; i < 5; i++) {
            Surfacable s = FigureUtils.getRandomSurfacable();
            System.out.println(s + "-> surface = " + s.surface());
        }
    }
}
