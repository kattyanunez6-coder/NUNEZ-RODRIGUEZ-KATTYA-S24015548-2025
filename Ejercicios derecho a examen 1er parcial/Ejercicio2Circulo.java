import java.util.Scanner;
public class Ejercicio2Circulo {
  public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     double radio, longitud =0,area=0,Pi=3.1516;
     System.out.println("Ingresa los centímetros : ");
     radio=sc.nextDouble();

     longitud = (2 * Pi ) * radio;
      area =Pi * (radio*radio);

System.out.println("La longitud de la circunferencia es: " + longitud + " y su area es: " + area );




  }


}
