import java.util.Scanner;
public class Ejercicio6Porcentaje {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int hombres;
        int mujeres;
        int total;

        System.out.println("Dime cuantos hombres hay en total: ");
        hombres = sc.nextInt();
        System.out.println("Dime cuantas mujeres hay en total: ");
        mujeres = sc.nextInt();

        total = hombres + mujeres;

        double porcentajeMujeres = ((double) mujeres / (double) total) * 100;
        System.out.println("El porcentaje de mujeres es: " + porcentajeMujeres + "%");
        double porcentajeHombres= ((double) hombres / (double) total) *100;
        System.out.println("El porcentaje de hombres es : " + porcentajeHombres + "%");

    }

}
