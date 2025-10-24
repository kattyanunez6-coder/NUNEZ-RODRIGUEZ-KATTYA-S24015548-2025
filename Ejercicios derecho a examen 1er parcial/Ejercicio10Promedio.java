import java.util.Scanner;
public class Ejercicio10Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese las calificaciones de las 3 materias más difíciles:");
        System.out.print("Calificación materia difícil 1: ");
        double materiaD1 = scanner.nextDouble();
        System.out.print("Calificación materia difícil 2: ");
        double materiaD2 = scanner.nextDouble();
        System.out.print("Calificación materia difícil 3: ");
        double materiaD3 = scanner.nextDouble();

        double promedioDif = (materiaD1 + materiaD2 + materiaD3) / 3;

        // En esta parte simulé que son 5 materias en total.
        System.out.println("Ingrese las calificaciónes de las 2 materias que faltan: ");

        System.out.print("Calificación materia 4: ");
        double materia4 = scanner.nextDouble();
        System.out.print("Calificación materia 5: ");
        double materia5 = scanner.nextDouble();


        double sumaT = materiaD1 + materiaD2 + materiaD3 +
                materia4 + materia5;
        double promedioGeneral = sumaT / 5;

        // Mostramos los resultados
        System.out.println("RESULTADOS:");
        System.out.println("Promedio de las materias más difíciles: " + promedioDif);
        System.out.println("Promedio general: " + promedioGeneral);

        scanner.close();
    }
}