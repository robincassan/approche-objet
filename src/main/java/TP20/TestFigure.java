package TP20;

    public class TestFigure {
        public static void main(String[] args) {
            Point p1 = new Point(0, 0);
            Point p2 = new Point(3, 4);
            Point p3 = new Point(5, 5);

            Figure rond = new Rond(p1, 2);
            Figure segment = new Segment(p1, p2);
            Figure rectangle = new Rectangle(p3, 4, 2);
            Figure carre = new Carre(new Point(10, 10), 3);

            Point[] points = FigureUtils.getPoints(rond, segment, rectangle, carre);

            for (Point p : points) {
                System.out.println(p);
            }
        }
    }

