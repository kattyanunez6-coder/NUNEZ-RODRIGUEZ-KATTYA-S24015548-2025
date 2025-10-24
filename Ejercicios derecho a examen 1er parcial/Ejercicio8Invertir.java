import java.util.Scanner;
public class Ejercicio8Invertir {
    public static void main(String[] args ){
     Scanner sc=new Scanner(System.in);

     System.out.println("Si deseas invertir en nuestro banco, puedes generar el 2% al mes. ");
     System.out.println("Dinos cuento es tu capital, para que podamos decirte cuanto vas a generar al mes.");
     double capital = sc.nextDouble();

     double crecimiento= capital* 0.02;
     double CapyCrecimiento= capital+crecimiento;

     System.out.println("El 2% de crecimiento de tu inversion serian:  $" + crecimiento );
     System.out.println("Y tu total al mes sumando el crecimiento serian: $" + CapyCrecimiento);



    }
}
