import java.util.Scanner;

public class Ejercicio19Hospital {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el presupuesto anual: ");
        double presupuesto = sc.nextDouble();

        double ginecologia = presupuesto * 0.40;
        double traumatologia = presupuesto * 0.30;
        double pediatria = presupuesto * 0.30;

        System.out.println("El presupuesto para Ginecología es: " + ginecologia);
        System.out.println("El presupuesto para Traumatología es: " + traumatologia);
        System.out.println("El presupuesto para pediatría es: " + pediatria);
    }
}
