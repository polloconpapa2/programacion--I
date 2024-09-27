package prog_java;
public class OperacionBasica {
    public static void main(String[] args) {
        int numero1, numero2, numero3, numero4, suma, multiplicacion, producto;
        

        System.out.println("ingrese el primer numero");
        numero1 = Integer.parseInt(System.console().readLine());

        System.out.println("ingrese el primer numero");
        numero2 = Integer.parseInt(System.console().readLine());

        System.out.println("ingrese el primer numero");
        numero3 = Integer.parseInt(System.console().readLine());

        System.out.println("ingrese el primer numero");
        numero4 = Integer.parseInt(System.console().readLine());

        suma = numero1 + numero2;
        producto = numero3 * numero4;

        System.out.println( "la suma es: " +suma);
        System.out.println("el productor es: " +producto);

         
         }
    }
