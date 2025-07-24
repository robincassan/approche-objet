package fr.diginamic.recensement;

public class Ville {
    private String codeRegion;
    private String nomRegion;
    private String codeDepartement;
    private String codeCommune;
    private String nomCommune;
    private int population;

    public Ville(String codeRegion, String nomRegion, String codeDepartement,
                 String codeCommune, String nomCommune, int population) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.population = population;
    }

    public String getNomCommune() { return nomCommune; }
    public String getCodeDepartement() { return codeDepartement; }
    public String getNomRegion() { return nomRegion; }
    public int getPopulation() { return population; }

    @Override
    public String toString() {
        return nomCommune + " (" + codeDepartement + ", " + nomRegion + ") - " + population + " hab.";
    }
}
