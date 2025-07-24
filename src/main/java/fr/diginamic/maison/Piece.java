package fr.diginamic.maison;

public abstract class Piece {
    private double superficie;
    private int numEtage; //le rdc est à 0

    public Piece(double superficie, int numEtage){
        this.superficie = superficie;
        this.numEtage = numEtage;
    }
    public double getSuperficie(){
        return superficie;
    }

    public int getNumEtage() {
        return numEtage;
    }
    public abstract String getType(); //Pour identifier le type (ex : "Chambre", "Cuisine")
}
