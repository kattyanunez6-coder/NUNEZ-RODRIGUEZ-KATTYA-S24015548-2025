import java.util.Scanner;
public class Ejercicio18Llamada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la duración de la llamada, en minutos: ");
        int minutos = sc.nextInt();
        int total;

        if (minutos >= 0 && minutos <= 3) {
            total = 10;
        } else if (minutos > 3) {
            total = 10 + (minutos - 3) * 1;
        } else {

            System.out.println("Duración no válida.");
            return;
        }

        System.out.println("El total a pagar es: $" + total + ".00");
    }
}