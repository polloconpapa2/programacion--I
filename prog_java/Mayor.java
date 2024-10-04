package prog_java;

public class Mayor {
    public static void main(String[] args) {
        int numero1, numero2;
       

        System.out.println("ingrese el primer numero");
        numero1 = Integer.parseInt(System.console().readLine());

        System.out.println("ingrese el primer numero");
        numero2 = Integer.parseInt(System.console().readLine());

        if  (numero1 > numero2) {
            System.out.println("el numero"+ numero1+ " es el mayor");
    
        } else {
            System.out.println("el numero"+ numero2+ " es el mayor");
        }
}
}
