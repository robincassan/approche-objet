package TP15;

public abstract class Figure {
    protected Point origine;

    public Figure(Point origine) {
        this.origine = origine;
    }

    public abstract void affiche();

    @Override
    public abstract String toString();
}