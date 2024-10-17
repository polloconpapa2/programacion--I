package prog_java;

public class Pregunta5 {
    
    public static String invertir(String cadena) {

        if (cadena.isEmpty()) {
            return cadena;
        } else {
            return invertir(cadena.substring(1)) + cadena.charAt(0);
        }
    }

    public static void main(String[] args) {
        String cadenaOriginal = "hola mundo";
        String cadenaInvertida = invertir(cadenaOriginal);
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }
}



