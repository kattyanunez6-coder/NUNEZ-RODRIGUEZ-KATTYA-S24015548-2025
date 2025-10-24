import java.util.Scanner;

public class Ejercicio13Coeficientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el coeficiente A: ");
        double a = sc.nextDouble();

        // es error, no es cuadrática
        if (a == 0) {
            System.out.println("Error, la ecuación no es cuadrática.");
            sc.close();
            return;
        }

        System.out.println("Ingresa el coeficiente B: ");
        double b = sc.nextDouble();
        System.out.println("Ingresa el coeficiente C: ");
        double c = sc.nextDouble();

        double discriminante = b * b - 4 * a * c;
        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("La raíz 1 es: " + raiz1);
            System.out.println("La raíz 2 es: " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2*a);
            System.out.println("La raíz única es: " + raiz);
        } else {
            System.out.println("Las raíces son imaginarias");
        }
    }
}

