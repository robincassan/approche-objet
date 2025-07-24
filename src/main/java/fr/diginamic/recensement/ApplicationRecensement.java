package fr.diginamic.recensement;

import fr.diginamic.recensement.services.*;

import java.util.Scanner;

public class ApplicationRecensement {

    public static void main(String[] args) {


        Recensement recensement = RecensementChargeur.charger("src/main/java/fr/diginamic/recensement/recensement.csv");

        Scanner scanner = new Scanner(System.in);
        int choix = 0;

        while (choix != 9) {
            System.out.println("\nMenu :");
            System.out.println("1. Population d’une ville");
            System.out.println("2. Population d’un département");
            System.out.println("3. Population d’une région");
            System.out.println("4. Afficher les 10 régions les plus peuplées");
            System.out.println("5. Afficher les 10 départements les plus peuplés");
            System.out.println("6. Afficher les 10 villes les plus peuplées d’un département");
            System.out.println("7. Afficher les 10 villes les plus peuplées d’une région");
            System.out.println("8. Afficher les 10 villes les plus peuplées de France");
            System.out.println("9. Sortir");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // vide la ligne

            MenuService service = null;

            switch (choix) {
                case 1:
                    service = new RecherchePopulationVille();
                    break;
                case 2:
                    service = new RecherchePopulationDepartement();
                    break;
                case 3:
                    service = new RecherchePopulationRegion();
                    break;
                case 4:
                    service = new Top10RegionsPlusPeuplees();
                    break;
                case 5:
                    service = new Top10DepartementsPlusPeuples();
                    break;
                case 6:
                    service = new Top10VillesDepartement();
                    break;
                case 7:
                    service = new Top10VillesRegion();
                    break;
                case 8:
                    service = new Top10VillesFrance();
                    break;
                case 9:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide.");
            }

            if (service != null) {
                service.traiter(recensement, scanner);
            }
        }

        scanner.close();

    }
}
