package prog_java;

public class Perimetro {
    public static void main(String[] args) {
        


    int perimetro, lado;

    System.out.println("ingrese la longitud del lado del cuadrado ");
    lado = Integer.parseInt(System.console().readLine());

    perimetro = 4 * lado;

    
    System.out.println("El perimetro es: "+perimetro);  
    }
 
}
