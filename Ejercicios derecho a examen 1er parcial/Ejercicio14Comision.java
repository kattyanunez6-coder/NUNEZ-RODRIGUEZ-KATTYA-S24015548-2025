import java.util.Scanner;

public class Ejercicio14Comision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables
        double comisionTotal = 0;
        double valorVenta1, valorVenta2, valorVenta3, valorVenta4;
        double comision1, comision2, comision3, comision4;
        int categoria1, categoria2, categoria3, categoria4;


        // Venta 1
        System.out.print("Ingrese el valor de la venta 1: $");
        valorVenta1 = sc.nextDouble();

        if (valorVenta1 <= 10000000) {
            categoria1 = 1;
        } else if (valorVenta1 < 15000000) {
            categoria1 = 2;
        } else {
            categoria1 = 3;
        }

        // Calcula la comisión de venta 1
        switch (categoria1) {
            case 1:
                comision1 = valorVenta1 * 0.02;
                break;
            case 2:
                comision1 = valorVenta1 * 0.04;
                break;
            case 3:
                comision1 = valorVenta1 * 0.10;
                break;
            default:
                comision1 = 0;
        }

        // Venta 2
        System.out.print("Ingrese el valor de la venta 2: $");
        valorVenta2 = sc.nextDouble();

        if (valorVenta2 <= 10000000) {
            categoria2 = 1;
        } else if (valorVenta2 < 15000000) {
            categoria2 = 2;
        } else {
            categoria2 = 3;
        }

        // comisión de venta 2
        switch (categoria2) {
            case 1:
                comision2 = valorVenta2 * 0.02;
                break;
            case 2:
                comision2 = valorVenta2 * 0.04;
                break;
            case 3:
                comision2 = valorVenta2 * 0.10;
                break;
            default:
                comision2 = 0;
        }

        // Venta 3
        System.out.print("Ingrese el valor de la venta 3: $");
        valorVenta3 = sc.nextDouble();

        if (valorVenta3 <= 10000000) {
            categoria3 = 1;
        } else if (valorVenta3 < 15000000) {
            categoria3 = 2;
        } else {
            categoria3 = 3;
        }

        // comisión de venta 3
        switch (categoria3) {
            case 1:
                comision3 = valorVenta3 * 0.02;
                break;
            case 2:
                comision3 = valorVenta3 * 0.04;
                break;
            case 3:
                comision3 = valorVenta3 * 0.10;
                break;
            default:
                comision3 = 0;
        }

        // Venta 4
        System.out.print("Ingrese el valor de la venta 4: $");
        valorVenta4 = sc.nextDouble();

        if (valorVenta4 <= 10000000) {
            categoria4 = 1;
        } else if (valorVenta4 < 15000000) {
            categoria4 = 2;
        } else {
            categoria4 = 3;
        }

        // Calcula la comisión de venta 4
        switch (categoria4) {
            case 1:
                comision4 = valorVenta4 * 0.02;
                break;
            case 2:
                comision4 = valorVenta4 * 0.04;
                break;
            case 3:
                comision4 = valorVenta4 * 0.10;
                break;
            default:
                comision4 = 0;
        }

        //comisión total
        comisionTotal = comision1 + comision2 + comision3 + comision4;

        System.out.println(" ");
        System.out.println("Comisión por venta 1: $" + comision1);
        System.out.println("Comisión por venta 2: $" + comision2);
        System.out.println("Comisión por venta 3: $" + comision3);
        System.out.println("Comisión por venta 4: $" + comision4);
        System.out.println("------------------------------------------------");
        System.out.println("Total de comisiones: : $" + comisionTotal);

        sc.close();
    }
}
