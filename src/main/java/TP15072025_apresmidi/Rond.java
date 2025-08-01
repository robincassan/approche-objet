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
            return "ROND " + centre.toString() + " , " + rayon; //Ici le toString n'est
            // pas indispensable si on l'omet ça donne le même résultat
        }

        // Méthode affiche
        public void affiche() {
            System.out.println(this.toString()); //ici le toSting n'est pas indispensable
            // si on met juste le this java appellera la méthode toString et utilisera
            //celle qu'on a surchargé
        }
    }

