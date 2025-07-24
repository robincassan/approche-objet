package fr.diginamic.recensement.services;

import fr.diginamic.recensement.*;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le nom de la ville : ");
        String nomVille = scanner.nextLine();

        boolean trouvee = false;

        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomCommune().equalsIgnoreCase(nomVille)) {
                System.out.println("Population de " + nomVille + " : " + ville.getPopulation());
                trouvee = true;
                break;
            }
        }

        if (!trouvee) {
            System.out.println("Ville non trouvée.");
        }
    }
}
