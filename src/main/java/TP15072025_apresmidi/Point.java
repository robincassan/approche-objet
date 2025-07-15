package TP15072025_apresmidi;

public class Point {
    int x;
    int y;

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
