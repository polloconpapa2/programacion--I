package prog_java;

public class AreaRectangulo {
    public static void main(String[] args) {
        int base, altura, AreaRectangulo;

        System.out.println("ingrese la base: ");
        base = Integer.parseInt(System.console().readLine());

        System.out.println("ingrese la altura");
        altura = Integer.parseInt(System.console().readLine());

        AreaRectangulo = base * altura;

        System.out.println("El area del rectangulo es: " +AreaRectangulo);
    }
}
