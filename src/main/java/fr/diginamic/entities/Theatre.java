package fr.diginamic.entities;

public class Theatre {
    private String name;
    private int capacity;
    private int clients;
    private double recette;

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getClients() {
        return clients;
    }

    public double getRecette() {
        return recette;
    }

    public Theatre(String name, int capacity, int clients, double recette){
       this.name = name;
       this.capacity = capacity;
       this.clients = clients;
       this.recette = recette;
    }

    public void inscrire(int clients, double price){
        if (clients <= (capacity - this.clients)) {
            this.clients += clients;
            recette += (clients * price);
        }else {
            System.out.println("La capacité du théatre est dépassée nouvelle inscription impossible");
        }
    }
}
