package prog_java;
public class Impuestos{
    public static void main(String[] args){
        int sueldo;

        System.out.println("ingrese sueldo de la persona: ");
        sueldo = Integer.parseInt(System.console().readLine());

        if  (sueldo > 3000) {
            System.out.println("debe pagar impuestos ");
    
        } else {
            System.out.println("no paga impuestos");
        }
        
    }
} 