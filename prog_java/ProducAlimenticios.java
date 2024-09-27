package prog_java;

public class ProducAlimenticios {
    public static void main(String[] args) {
    int cantidad;
    double precio, total;

    System.out.println("ingrese el precio del articulo: ");
    cantidad = Integer.parseInt(System.console().readLine());

    System.out.println("ingrese la cantidad de los articulos: ");
    precio = Integer.parseInt(System.console().readLine());

    total = precio * cantidad;

    System.out.println("el cliente debe de abonar: "+total);


    }
    
}
