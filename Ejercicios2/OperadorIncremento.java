package Ejercicios2;

public class OperadorIncremento {
    public static void main(String [] args ){
        int variable =15;
        System.out.println("Valor original de la variable= " + variable);
        //después de usar el operador de incremento
        variable++;           //incrementa en 1,variable =16
        System.out.println("variable ++ =" + variable);
        ++variable;           //incrementa en 1,variable =17
        System.out.println("++variable=" + variable);

    }
}
