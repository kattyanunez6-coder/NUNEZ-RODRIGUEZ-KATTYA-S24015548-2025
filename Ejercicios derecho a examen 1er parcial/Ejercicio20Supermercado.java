import  java.util.Scanner;

public class Ejercicio20Supermercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el total de la compra: ");
        double compraTotal= scanner.nextDouble();

        System.out.println("Ingresa un número al azar para el descuento: ");
        int numeroAzar = scanner.nextInt();

        // calcula el descuento y el total
        double descuento;
        if (numeroAzar  < 74) {
            descuento = compraTotal * 0.15;
        } else {
            descuento = compraTotal * 0.20;
        }

        System.out.println("El descuento total es: " + descuento);
        System.out.println("El total de la compra con descuento es: " + (compraTotal - descuento));
    }
}