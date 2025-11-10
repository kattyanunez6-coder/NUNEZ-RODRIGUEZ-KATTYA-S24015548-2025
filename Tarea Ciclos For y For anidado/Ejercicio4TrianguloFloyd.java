package Tarea;
import java.util.Scanner;
public class Ejercicio4TrianguloFloyd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime la altura: ");
        int altura = sc.nextInt();

        int tmp = 1;

        for (int fila = 1; fila <= altura; fila++) {
            for (int ast = 1; ast <= fila; ast++) {
                System.out.print(tmp++ + " ");
            }
            System.out.println();
        }
    }
}

