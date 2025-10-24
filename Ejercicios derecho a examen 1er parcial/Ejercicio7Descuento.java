import java.util.Scanner;
public class Ejercicio7Descuento {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Estamos aplicando un descuento del 15% sobre el total de la compre en nuestra tienda");
        System.out.println("Dime el total de tu compra para poder decirte cuento deberás pagar al final aplicando el descuento: ");
        double total = sc.nextDouble();

        double descuento = (total * 0.15);
        double precioFinal=(total- descuento );
        System.out.println("El precio final de tu compra aplicando el descuento es: $" + precioFinal);

    }
}
