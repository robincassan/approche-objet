package fr.diginamic.recensement.services;

import fr.diginamic.recensement.*;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Nom de la région : ");
        String nom = scanner.nextLine();

        int total = recensement.getVilles().stream()
                .filter(v -> v.getNomRegion().equalsIgnoreCase(nom))
                .mapToInt(Ville::getPopulation)
                .sum();

        System.out.println("Population de la région " + nom + " : " + total);
    }
}
