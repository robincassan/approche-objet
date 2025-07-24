package fr.diginamic.recensement.services;

import fr.diginamic.recensement.*;

import java.util.*;
import java.util.stream.Collectors;

public class Top10VillesDepartement extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Code du département : ");
        String code = scanner.nextLine();

        List<Ville> top = recensement.getVilles().stream()
                .filter(v -> v.getCodeDepartement().equalsIgnoreCase(code))
                .sorted(Comparator.comparingInt(Ville::getPopulation).reversed())
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Top 10 villes du département " + code + " :");
        top.forEach(System.out::println);
    }
}
