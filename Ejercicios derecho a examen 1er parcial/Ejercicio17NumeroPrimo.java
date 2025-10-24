import java.util.Scanner;
public class Ejercicio17NumeroPrimo {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Dime un número: " );
    int n = sc.nextInt();

    if(n<=1){
        System.out.println(n + " no es primo");
        return;
    }
    int i =2;
    while (i<= Math.sqrt(n)){
        if (n% i ==0) {
          System.out.println(n + " no es primo");
           return;
        }
        i++;

    }
    System.out.println(n + " es primo");
    }
}

