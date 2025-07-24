package fr.diginamic.essais;

import fr.diginamic.entities.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
    Theatre bataclan = new Theatre("Bataclan", 500,100,1000);
    bataclan.inscrire(50,10);
    bataclan.inscrire(50,10);
    bataclan.inscrire(300,10);
    bataclan.inscrire(300,10);

        System.out.println("Clients inscrit: " +bataclan.getClients() + "  recette totale : " +
    bataclan.getRecette());

    }

}
