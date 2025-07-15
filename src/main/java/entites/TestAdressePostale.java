package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(12, "Rue des Lilas", 75000, "Paris");
        AdressePostale adresse2 = new AdressePostale(45, "Avenue de la République", 69000, "Lyon");
        // Pour afficher
        System.out.println(adresse1.libelleRue + ", " + adresse1.ville);
        System.out.println(adresse2.libelleRue + ", " + adresse2.ville);
    }
}
