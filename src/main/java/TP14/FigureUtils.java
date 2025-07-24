package TP14;

import java.util.Random;

public class FigureUtils {

    public static Figure getRandomFigure() {
        Random rand = new Random();
        int type = rand.nextInt(3); // 0 = Rond, 1 = Rectangle, 2 = Carre

        Point origine = new Point(rand.nextInt(10), rand.nextInt(10));

        switch (type) {
            case 0:
                return new Rond(origine, rand.nextInt(10) + 1);
            case 1:
                return new Rectangle(origine, rand.nextInt(10) + 1, rand.nextInt(10) + 1);
            case 2:
            default:
                return new Carre(origine, rand.nextInt(10) + 1);
        }
    }
}
