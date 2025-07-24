package TP15;


public class Rond extends Figure implements Surfacable {
        private int rayon;

        // Constructeur
         public Rond(Point origine, int rayon) {
            super(origine);
            this.rayon = rayon;
        }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    // Méthode toString
        public String toString() {
            return "ROND " + origine + " rayon = " + rayon; //Ici le toString n'est
            // pas indispensable si on l'omet ça donne le même résultat
        }

        // Méthode affiche
        public void affiche() {
            System.out.println(this); //ici le toSting n'est pas indispensable
            // si on met juste le this java appellera la méthode toString et utilisera
            //celle qu'on a surchargé
        }
    }

