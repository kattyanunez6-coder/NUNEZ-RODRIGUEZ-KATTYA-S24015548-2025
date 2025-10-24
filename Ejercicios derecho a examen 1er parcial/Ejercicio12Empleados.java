import java.util.Scanner;

public class Ejercicio12Empleados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la categoría del empleado, elige entre el (1-4): ");
        int categoria = sc.nextInt();
        System.out.print("Ingresa el número de horas trabajadas en el mes: ");
        int horasT = sc.nextInt();

        double tarifaHora = 0;
        double salarioBase, salarioFinal, descuentoSalud, subsidio = 0;


        switch (categoria) {
            case 1:
                tarifaHora = 20000;
                break;
            case 2:
                tarifaHora = 15000;
                break;
            case 3:
                tarifaHora = 10000;
                break;
            case 4:
                tarifaHora = 7500;
                break;
            default:
                System.out.println("No existe la categoria del 1 al 4");
                return;
        }

        // salario base
        salarioBase = horasT * tarifaHora;

        // verificar si aplica subsidio
        if (salarioBase < 1000000) {
            subsidio = salarioBase * 0.15;
        }
       //descuento
        descuentoSalud = salarioBase * 0.072;

        // salario final
        salarioFinal = salarioBase + subsidio - descuentoSalud;

        System.out.println("RESULTADOS DE NÓMINA:");
        System.out.println("Categoría del empleado es : " + categoria);
        System.out.println("Valor por hora: $" + tarifaHora);
        System.out.println("Horas trabajadas: " + horasT);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Subsidio 15%: $" + subsidio);
        System.out.println("Descuento salud del 7.2%: $" + descuentoSalud);
        System.out.println("El salario total a pagar es: : $" + salarioFinal);

        sc.close();
    }
}