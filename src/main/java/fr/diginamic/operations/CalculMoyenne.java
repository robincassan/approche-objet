package fr.diginamic.operations;

public class CalculMoyenne {
    private double[] tableau;
    private int taille;

    public CalculMoyenne(){
        tableau = new double[0];
        taille = 0;
    }

    public void ajout(double valeur){
        //créer un nouveau tableau agrandi
        double[] nouveauTableau = new double[taille + 1];
        //copie des anciennes valeurs
        for (int i = 0; i < taille ; i++) {
            nouveauTableau[i] = tableau[i];
        }
        //ajout nouvelle valeur à la fin
        nouveauTableau[taille] = valeur;
        //remplacer l'ancien tableau
        tableau = nouveauTableau;
        taille++;
    }

    public double calcul(){
        if (taille == 0) return 0;
        double somme = 0;
        for (double val : tableau){
            somme += val;
        }
        return somme / taille;
    }
}
