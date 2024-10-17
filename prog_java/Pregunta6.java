package prog_java;

public class Pregunta6 {
    

        public static void main(String[] args) {


            System.out.print("Ingresa un número: ");
            int numero = Integer.parseInt(System.console().readLine()); 

            // Guardamos el número original para comparar después
            int original = numero;

            // Calculamos el número de dígitos
            int numeroDeDigitos = 0;
            int temp = numero;
            while (temp != 0) {
                temp /= 10;
                numeroDeDigitos++;
            }

            // Calculamos la suma de los dígitos elevados a la potencia del número de dígitos
            int suma = 0;
            temp = numero;
            while (temp != 0) {
                int digito = temp % 10;
                suma += Math.pow(digito, numeroDeDigitos);
                temp /= 10;
            }

            // Comparamos si la suma es igual al número original
            if (suma == original) {
                System.out.println(original + " es un número de Armstrong.");
            } else {
                System.out.println(original + " no es un número de Armstrong.");
            }

        }
    }
