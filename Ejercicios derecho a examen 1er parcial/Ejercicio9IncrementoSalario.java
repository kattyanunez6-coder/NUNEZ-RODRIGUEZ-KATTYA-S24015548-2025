import java.util.Scanner;
public class Ejercicio9IncrementoSalario {
    public static void main(String[] args ){
    Scanner sc = new Scanner (System.in);


        System.out.println("Vamos a calcular tu nuevo sueldo aplicando un incremento del 25% a tu sueldo anterior.");
        System.out.println("Dime tu sueldo anterior:");
        double sueldoAnterior = sc.nextDouble();

        double porcentaje = sueldoAnterior*0.25;

        double nuevoSueldo = sueldoAnterior + porcentaje;
        System.out.println("Tu nuevo sueldo es: $" + nuevoSueldo );
    }
}
