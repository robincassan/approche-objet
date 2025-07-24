package fr.diginamic.recensement.services;

import fr.diginamic.recensement.*;

import java.util.*;
import java.util.stream.Collectors;

public class Top10DepartementsPlusPeuples extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        Map<String, Departement> departements = new HashMap<>();

        for (Ville ville : recensement.getVilles()) {
            String code = ville.getCodeDepartement();
            departements.putIfAbsent(code, new Departement(code, 0));
            departements.get(code).ajouterPopulation(ville.getPopulation());
        }

        List<Departement> top = departements.values().stream()
                .sorted(Comparator.comparingInt(Departement::getPopulation).reversed())
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Top 10 des départements les plus peuplés :");
        for (Departement d : top) {
            System.out.println("Département " + d.getCode() + " : " + d.getPopulation() + " hab.");
        }
    }
}
