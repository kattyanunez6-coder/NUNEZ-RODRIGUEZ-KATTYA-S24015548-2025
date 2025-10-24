
import java.util.Scanner;
public class Ejercicio5Temperatura {
    public static void main (String[] args){
     double temperaturaCenti;
     double fahrenheit;
     double temperaturaAbsoluta;
     Scanner sc = new Scanner (System.in);

     System.out.println("Dime la temperatura: ");
     temperaturaCenti=sc.nextDouble();

     fahrenheit = (temperaturaCenti * 9/5 ) + 32 ;
     temperaturaAbsoluta = temperaturaCenti + 273.15;

     System.out.println("La temperatura Fahrenheit es: " + fahrenheit + "°F" );
     System.out.println("La temperatura Absoluta (Kelvin) es: " + temperaturaAbsoluta + "K");

    }


}
