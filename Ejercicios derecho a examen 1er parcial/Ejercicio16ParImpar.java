import java.util.Scanner;
public class Ejercicio16ParImpar {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Dime un numero: ");
        numero =sc.nextInt();

        if (numero % 2 == 0)
            System.out.println("El numero: " + numero +  " es par");
        else
            System.out.println("El numero: " + numero + " es impar");


    }
}
