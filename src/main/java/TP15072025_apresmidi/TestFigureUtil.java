package TP15072025_apresmidi;

public class TestFigureUtil {
    public static void main(String[] args) {
        Rond rond = FigureUtil.getRandomRond();
        Rectangle rect = FigureUtil.getRandomRectangle();

        rond.affiche();   // Exemple : ROND [42;73] , 19
        rect.affiche();   // Exemple : RECT [12;4][37;4][37;39][12;39]
    }
}