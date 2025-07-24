package fr.diginamic.recensement.services;

import fr.diginamic.recensement.*;

import java.util.*;
import java.util.stream.Collectors;

public class Top10VillesRegion extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Nom de la région : ");
        String nom = scanner.nextLine();

        List<Ville> top = recensement.getVilles().stream()
                .filter(v -> v.getNomRegion().equalsIgnoreCase(nom))
                .sorted(Comparator.comparingInt(Ville::getPopulation).reversed())
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Top 10 villes de la région " + nom + " :");
        top.forEach(System.out::println);
    }
}
