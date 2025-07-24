package TP25;


public class Main {
    public static void main(String[] args) {
        Figure f1 = FigureUtils.getRandomRond("r1");
        Figure f2 = FigureUtils.getRandomRectangle("rect1");
        Figure f3 = FigureUtils.getRandomCarre("c1");

        System.out.println("Figure r1 : " + FigureUtils.get("r1"));
        System.out.println("Figure rect1 : " + FigureUtils.get("rect1"));
        System.out.println("Figure c1 : " + FigureUtils.get("c1"));
        System.out.println("Figure inconnue : " + FigureUtils.get("inconnu")); // null
    }
}


