package fr.diginamic.recensement;

import java.util.List;

public class Recensement {
    //liste de toutes les villes du fichier
    private List<Ville> villes;

    public Recensement(List<Ville> villes) {
        this.villes = villes;
    }

    public List<Ville> getVilles() {
        return villes;
    }
}
