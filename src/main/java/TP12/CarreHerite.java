package TP12;
public class CarreHerite extends Rectangle {

    public CarreHerite(Point origine, int cote) {
        super(origine, cote, cote); // carré = largeur = hauteur
    }

    @Override
    protected String getType() {
        return "CARRE";
    }

    @Override
    public void affiche() {
        System.out.println(this.toString());
    }

}