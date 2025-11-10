package Tarea;
import java.util.Scanner;
public class Ejercicio3Piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime la altura: ");
        int altura = sc.nextInt();

        for (int fila = 1; fila <= altura; fila++) {
            for (int espacio = 1; espacio <= altura - fila; espacio++ ) {
                System.out.print(" ");
            }
            for (int ast =1; ast <= 2 * fila - 1; ast++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


