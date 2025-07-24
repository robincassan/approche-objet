package fr.diginamic.operations;

public class Operations {
    private static double a;
    private static double b;
    private static char c;
    private static double resultat;

    public static double calcul(double x, double y, char operateur) {
        a = x;
        b = y;
        c = operateur;

        resultat = switch (c) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> b != 0 ? a / b : Double.NaN;
            default -> {
                System.out.println("Opérateur invalide.");
                yield Double.NaN;
            }
        };
        return resultat;
    }

    public static void affiche() {
        System.out.println(a + " " + c + " " + b + " = " + resultat);
    }
}
