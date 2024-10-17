
package prog_java;
public class Pregunta3 {
    
  public static void main(String[] args) {
      int limite, numero;

        System.out.println("Ingresa numero limite: ");
        limite = Integer.parseInt(System.console().readLine()); 

        System.out.println("Ingresa numero para comprar: ");
        numero = Integer.parseInt(System.console().readLine()); 

        if (numero < limite) {
            System.out.println("El número " + numero + " se encuentra en el rango");
        } else {
            System.out.println("El número " + numero + " excede el límite permitido");
    }
}
}