package fr.diginamic.maison;

public class Maison {
    private Piece[] pieces = new Piece[0];

    public void ajouterPiece(Piece piece){
        //ajouter une piece à la maison
        if (piece == null){
            System.out.println("erreur pièce null non ajoutée");
            return;
        }
        if (piece.getSuperficie() < 0 || piece.getNumEtage() < 0){
            System.out.println("Erreur la superficie ou le numéro d'étage ne peuvent être négatif");
            return;
        }
        Piece[] nouveauTableau = new Piece[pieces.length + 1];
        for (int i = 0; i < pieces.length; i++) {
            nouveauTableau[i] = pieces[i];
        }
        nouveauTableau[pieces.length] = piece;
        pieces = nouveauTableau;
    }

    public double getSuperficieTotale(){    //renvoie la superficie de la maison
        double total = 0;
        for (Piece p : pieces){
            total += p.getSuperficie();
        }
        return total;
    }

    public double getSuperficieEtage(int numEtage){    //renvoie la superficie d'un étage en paramètre
        double total = 0;
        for (Piece p : pieces){
            if (p.getNumEtage() == numEtage) {
                total += p.getSuperficie();
            }
        }
        return total;
    }

    public double getSuperficieParType(String type){ // renvoie la superficie globale d'un type
        double total = 0;
        for (Piece p : pieces){
            if (p.getType().equalsIgnoreCase(type)){
                total += p.getSuperficie();
            }
        }
        return total;
    }

    public int getNombrePieceParType(String type){   //renvoi le nombre de pièce d'un type
        int compteur = 0;
        for (Piece p : pieces){
            if (p.getType().equalsIgnoreCase(type)){
                compteur++;
            }
        }
        return compteur;
    }
}
