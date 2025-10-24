import java.util.Scanner;
public class Ejercicio11Valores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el valor 1");
        double valor1 = sc.nextDouble();
        System.out.println("Dime el valor 2");
        double valor2 = sc.nextDouble();
        System.out.println("Dime el valor 3");
        double valor3 = sc.nextDouble();


            //determinamos el valor mayor
            if ((valor1 > valor2) && (valor1 > valor3)) {
                System.out.println("El valor mayor es: " + valor1);
            } else if (valor2 > valor3) {
                System.out.println("El valor mayor es: " + valor2);
            } else {
                System.out.println("El mayor es: " + valor3);
            }

            //determinamos el valor menor
            if ((valor1 < valor2) && (valor1 < valor3)) {
                System.out.println("El valor menor es: " + valor1);
            } else if ((valor2 < valor1) && (valor2 < valor3)) {
                System.out.println("El valor menor es: " + valor2);
            } else {
                System.out.println("El menor es: " + valor3);
            }

            // promedio
            double promedio = (valor1 + valor2 + valor3) / 3;
            System.out.println("El promedio es: " + promedio);

            //se verifica si los 3 valores son iguales
            if ((valor1 == valor2) && (valor2 == valor3)) {
            System.out.println("Los tres valores son iguales");
            }


        sc.close();
    }
}