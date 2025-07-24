package TP14;

public class TestFigure {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Figure f = FigureUtils.getRandomFigure();
            f.affiche();
        }
    }
}
