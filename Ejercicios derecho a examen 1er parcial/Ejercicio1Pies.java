import java.util.Scanner;

public class Ejercicio1Pies {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedimos los metros
        System.out.println("Ingrese el numero de metros");
        double metros = scanner.nextDouble();

        double pies = metros  * 3.28084;

        int pies2 = (int) pies;
        double residuoPies = pies % 1;
        double pulgadas = (pies - pies2) * 12;

        System.out.println("Los pies son: " + pies);
        System.out.println("Las pulgadas son: "  + pulgadas);
    }



}
