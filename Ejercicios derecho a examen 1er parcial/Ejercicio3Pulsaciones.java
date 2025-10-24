import java.util.Scanner;
public class Ejercicio3Pulsaciones {
    public static void main (String[] args ){
    int edad =0;
    int pulsaciones =0;
    Scanner sc= new Scanner (System.in);

    System.out.println("Vamos a calcular las pulsaciones que debes tener por cada 10 segundos de ejercicio: ");
    System.out.println("Para hacerlo dime tu edad: ");
    edad =sc.nextInt();

    pulsaciones= (220-edad)/10;

    System.out.println("Las pulsaciones que debes tener son: " + pulsaciones +  " pulsaciones cada 10 segundos ");


    }


}
