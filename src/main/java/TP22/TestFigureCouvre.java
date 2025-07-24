package TP22;

public class TestFigureCouvre {
    public static void main(String[] args) {
        Dessin dessin = new Dessin();
        dessin.add(new Rond(new Point(10, 10), 5));
        dessin.add(new Carre(new Point(0,0),4));
        dessin.add(new Rectangle(new Point(20, 20),10, 5));

        Point test = new Point(11, 11);
        Figure f = FigureUtils.getFigureEn(test, dessin);

        if (f != null){
            System.out.println("La figure " + f.getClass().getSimpleName() + " couvre le point " + test);
        }else{
            System.out.println("Aucune figure ne couvre le point " + test);
        }
    }
}
