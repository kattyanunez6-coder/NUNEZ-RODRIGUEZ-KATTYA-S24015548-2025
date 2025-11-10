package Tarea;
import java.util.Scanner;
public class Ej1FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            double num;
            System.out.println("Dime un numero");
            num = sc.nextDouble();

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz ");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(+num);
            }
        }
    }
}

