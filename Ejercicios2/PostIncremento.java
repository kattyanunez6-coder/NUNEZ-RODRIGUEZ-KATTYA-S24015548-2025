package Ejercicios2;
public class PostIncremento {
    public static void main(String [] args ){
        int variable = 100;
        System.out.println("Valor original de la variable=" + variable);
        //usando el operador post-incremento
        int postIncrement = variable ++; // postIncremento = 100, VARIABLE = 101
        System.out.println("postincremento=" + postIncrement);
        System.out.println("variable =" + variable+ "\n");
        //posIncrement = 101
        System.out.println("postIncrement++ = " + postIncrement++);
        //posIncrement = 102
        System.out.println("postIncrement++ = " + postIncrement++);
        //posIncrement = 103
        System.out.println("postIncrement++ = " + postIncrement++);
        System.out.println("\nposIncrement=" + postIncrement);

    }

}
