package fr.diginamic.recensement;

import java.io.*;
import java.util.*;

public class RecensementChargeur {

    public static Recensement charger(String cheminFichier) {
        List<Ville> villes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(cheminFichier))) {
            String ligne = reader.readLine(); // sauter l'en-tête

            while ((ligne = reader.readLine()) != null) {
                String[] tokens = ligne.split(";");
                String codeRegion = tokens[0];
                String nomRegion = tokens[1];
                String codeDepartement = tokens[2];
                String codeCommune = tokens[5];
                String nomCommune = tokens[6];
                int population = Integer.parseInt(tokens[9].replaceAll(" ", ""));

                Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, population);
                villes.add(ville);
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Erreur de lecture du fichier : " + e.getMessage());
        }

        return new Recensement(villes);
    }
}

