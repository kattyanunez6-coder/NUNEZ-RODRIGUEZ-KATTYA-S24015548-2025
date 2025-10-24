import java.util.Scanner;
public class Ejercicio4Edad {
    public static void main (String [] args){
    int edad =0;
    int yeara =0;
    int year =0;
    Scanner sc=new Scanner (System.in);

    System.out.println("Vamos a calcular tu edad  ");
    System.out.println("Para hacerlo dime el año de tu nacimiento:  ");
    year=sc.nextInt();

    System.out.println("Dime el año actual");
    yeara=sc.nextInt();
    //operación
    edad=yeara-year;
    System.out.println("Tu edad es: " + edad + " años" );

    }
}
