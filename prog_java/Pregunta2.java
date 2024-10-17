package prog_java;

public class Pregunta2 {

    public static void main(String[] args) {

        int edad;

        System.out.println("ingresa tu edad: ");
        edad = Integer.parseInt(System.console().readLine()); 

        if (edad > 30) {
            System.out.println("Nunca es tarde para aprender. ¿Que curso tomaremos?");
        } 

        if (edad >= 18 && edad <= 29) {
            System.out.println("Es un momento excelente para impulsar tu carrera.");
        } 

        if (edad < 18) {

            System.out.println("¿Sabes hacia dónde dirigir tu futuro? Seguro puedo ayudarte");
        } 

    }
}
