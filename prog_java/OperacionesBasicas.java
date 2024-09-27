package prog_java;

public class OperacionesBasicas {
    public static void main(String[] args) {
        int numero1, numero2, suma, resta, multiplicacion;
        double division;

        System.out.println("ingrese el primer numero");
        numero1 = Integer.parseInt(System.console().readLine());

        System.out.println("ingrese el primer numero");
        numero2 = Integer.parseInt(System.console().readLine());

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;

        System.out.println( suma);
        System.out.println( resta);
        System.out.println( multiplicacion);
        System.out.println( division);

    }
    
}
