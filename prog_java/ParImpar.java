package prog_java;

public class ParImpar {
    public static void main(String[] args) {

        int numero;
        System.out.println("ingrese el primer numero: ");
        numero = Integer.parseInt(System.console().readLine());

        if (numero % 2 == 0) {
            System.out.println("El numero ingresado es Par");
        }else{
            System.out.println("El numero ingresado es Impar"); 
        }

    }
}