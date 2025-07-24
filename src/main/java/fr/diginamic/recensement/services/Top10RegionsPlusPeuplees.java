package fr.diginamic.recensement.services;

import fr.diginamic.recensement.*;

import java.util.*;
import java.util.stream.Collectors;

public class Top10RegionsPlusPeuplees extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        Map<String, Region> regions = new HashMap<>();

        for (Ville ville : recensement.getVilles()) {
            String nom = ville.getNomRegion();
            regions.putIfAbsent(nom, new Region(nom, 0));
            regions.get(nom).ajouterPopulation(ville.getPopulation());
        }

        List<Region> top = regions.values().stream()
                .sorted(Comparator.comparingInt(Region::getPopulation).reversed())
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Top 10 des régions les plus peuplées :");
        for (Region region : top) {
            System.out.println(region.getNom() + " : " + region.getPopulation() + " hab.");
        }
    }
}

