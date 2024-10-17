package prog_java;
public class Pregunta4 {
    public static void main(String[] args) {

        double numdeci;
        int parteEntera, residuo;
        String binarioEntero = "", binarioDecimal = "";

        System.out.println("Ingresa el número decimal: ");
        numdeci = Double.parseDouble(System.console().readLine()); 

        // Separar la parte entera de la parte decimal
        parteEntera = (int) numdeci;  // Obtener la parte entera
        double parteDecimal = numdeci - parteEntera;  // Obtener la parte decimal

        // Convertir la parte entera a binario
        while (parteEntera > 0) {
            residuo = parteEntera % 2;
            binarioEntero = residuo + binarioEntero;
            parteEntera = parteEntera / 2;
        }

        // Si el número tiene parte entera 0, indicarlo
        if (binarioEntero.isEmpty()) {
            binarioEntero = "0";
        }

        // Convertir la parte decimal a binario
        while (parteDecimal > 0 && binarioDecimal.length() < 10) {  // Limitar a 10 dígitos decimales para evitar bucles infinitos
            parteDecimal = parteDecimal * 2;
            int bit = (int) parteDecimal;  // Obtener la parte entera después de multiplicar
            binarioDecimal = binarioDecimal + bit;  // Concatenar el bit resultante
            parteDecimal = parteDecimal - bit;  // Restar la parte entera para continuar con la fracción
        }

        // Mostrar el número binario completo
        if (!binarioDecimal.isEmpty()) {
            System.out.println("El número binario es: " + binarioEntero + "." + binarioDecimal);
        } else {
            System.out.println("El número binario es: " + binarioEntero);
        }
    }
}

