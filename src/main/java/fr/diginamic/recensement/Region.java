package fr.diginamic.recensement;

public class Region {
    private String nom;
    private int population;

    public Region(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public int getPopulation() {
        return population;
    }

    public void ajouterPopulation(int pop) {
        this.population += pop;
    }
}

