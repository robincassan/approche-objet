package TP15072025_apresmidi;

public class Point {
    int x;
    int y;
    public static final int INIT_X = 25;
    public static final int INIT_Y = 25;

    public Point() {
        this.x = INIT_X;
        this.y = INIT_Y;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    //getter sur X
    public int getX(){
        return this.x;
    }
    //getter sur Y
    public int getY(){
        return this.y;
    }
    //affichage des coordonnées
    public String toString(){
        return "[" + x + ";" + y + "]";
    }
}
