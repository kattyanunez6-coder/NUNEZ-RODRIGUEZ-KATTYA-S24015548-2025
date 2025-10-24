import java.util.Scanner;

public class Ejercicio15Valoracion {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Ingresa la nota numérica (0.0 - 5.0): ");

        double nota = sc.nextDouble();
        char valoracion;

        int categoriaNota = 0;

        if (nota >= 0.0 && nota <= 1.0) {
            categoriaNota = 1; // P
        } else if (nota >= 1.1 && nota <= 2.0) {
            categoriaNota = 2; // M
        } else if (nota >= 2.1 && nota <= 2.9) {
            categoriaNota = 3; // R
        } else if (nota >= 3.0 && nota <= 4.0) {
            categoriaNota = 4; // B
        } else if (nota >= 4.1 && nota <= 5.0) {
            categoriaNota = 5; // E
        }

        switch (categoriaNota) {
            case 1:
                valoracion = 'P';
                System.out.println("La valoración: " + valoracion + " (Pésimo)");
                break;
            case 2:
                valoracion = 'M';
                System.out.println("Valoración: " + valoracion + " (Mal)");
                break;
            case 3:
                valoracion = 'R';
                System.out.println("Valoración: " + valoracion + " (Regular)");
                break;
            case 4:
                valoracion = 'B';
                System.out.println("Valoración: " + valoracion + " (Bien)");
                break;
            case 5:
                valoracion = 'E';
                System.out.println("Valoración: " + valoracion + " (Excelente)");
                break;
            default:
                System.out.println("Error: La nota ingresada está fuera del rango válido (0.0 - 5.0)");
        }

        sc.close();
    }
}