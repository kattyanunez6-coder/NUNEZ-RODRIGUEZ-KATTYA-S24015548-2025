package Tarea;
import java.util.Scanner;
public class Ejercicio2Exponente {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int resultado =1;
        System.out.println("Dime el primer numero el cual sera el numero base");
        int base =sc.nextInt();
        System.out.println("Dime el segundo numero el cual sera el exponente");
        int expo =sc.nextInt();

        if (expo < 0){
            System.out.println("numero no valido debe ser mayor a 0");

        }
        for (int i = 1; i <= expo; i++) {
            resultado *= base;
        }

        System.out.println(base + " ^ " + expo + " = " + resultado);

        sc.close();
    }
}

