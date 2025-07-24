package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {

        Operations.calcul(1,2,'+'); //test de l'addition
        Operations.affiche();
        Operations.calcul(1,2,'-'); //test de la soustraction
        Operations.affiche();
        Operations.calcul(1,2,'/'); //test de la division
        Operations.affiche();
        Operations.calcul(1,0,'/'); //test de la division par zéro
        Operations.affiche();
        Operations.calcul(1,2,'*'); //test de la multiplication
        Operations.affiche();
        Operations.calcul(1,2,'^'); //test d'un caractère non valide
        Operations.affiche();

    }
}
