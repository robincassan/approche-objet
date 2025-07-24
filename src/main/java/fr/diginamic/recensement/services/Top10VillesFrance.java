package fr.diginamic.recensement.services;

import fr.diginamic.recensement.*;

import java.util.*;
import java.util.stream.Collectors;

public class Top10VillesFrance extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        List<Ville> top = recensement.getVilles().stream()
                .sorted(Comparator.comparingInt(Ville::getPopulation).reversed())
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Top 10 villes de France :");
        top.forEach(System.out::println);
    }
}

