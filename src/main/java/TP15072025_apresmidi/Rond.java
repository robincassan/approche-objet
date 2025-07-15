package TP15072025_apresmidi;

public class Rond {
        private Point centre;
        private int rayon;

        // Constructeur
    public Rond(Point centre, int rayon) {
            this.centre = centre;
            this.rayon = rayon;
        }

        // Méthode toString
        public String toString() {
            return "ROND " + centre.toString() + " , " + rayon;
        }

        // Méthode affiche
        public void affiche() {
            System.out.println(this.toString());
        }
    }

