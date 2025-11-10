package Ejercicios2;
public class PreIncremento {
    public static void main(String [] args ){
        int variable =5;
        System.out.println("Valor original de de la variable =" +  variable);
        //using pre-increment operador
        int preIncrement= ++variable;


        System.out.println("variable=" + variable );
        System.out.println("preIncrement= " + preIncrement );
        System.out.println(" ++preIncrement= " + ++preIncrement);
    }
}
