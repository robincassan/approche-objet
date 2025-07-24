package fr.diginamic.recensement.services;

import fr.diginamic.recensement.*;

import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Code du département : ");
        String code = scanner.nextLine();

        int total = recensement.getVilles().stream()
                .filter(v -> v.getCodeDepartement().equalsIgnoreCase(code))
                .mapToInt(Ville::getPopulation)
                .sum();

        System.out.println("Population du département " + code + " : " + total);
    }
}
