package prog_java;

public class Pregunta1 {
    public static void main(String[] args) {


               

                int base, altura, are1a, lado , operacion;
                Double areaTriangulo, areaRectangulo,areaCuadrado;
        
                
        
                System.out.println("Ingrese el poligono que desee calcular: ");
                System.out.println("1. Area del triangulo");
                System.out.println("2. Area del cuadrado");
                System.out.println("3. Area del rectangulo");
                operacion = Integer.parseInt( System.console().readLine());
        
              
        
                if (operacion == 1) {
                    System.out.println("Ingrese la base: ");
                    base = Integer.parseInt( System.console().readLine());
                    System.out.println("Ingrese la altura: ");
                    altura = Integer.parseInt( System.console().readLine());
                    areaTriangulo= (double) ((base * altura)/2);
                    System.out.println("Area es: "+areaTriangulo);
                }
        
              
        
                if (operacion == 2) {
                    System.out.println("Ingrese el lado: ");
                    lado = Integer.parseInt( System.console().readLine());
                    areaCuadrado= (double) (lado * lado);
                    System.out.println("Area es: "+areaCuadrado);
                }
        
              
        
                if (operacion == 3) {
                    System.out.println("Ingrese la ancho: ");
                    base= Integer.parseInt( System.console().readLine());
                    System.out.println("Ingrese la altura: ");
                    altura = Integer.parseInt( System.console().readLine());
                    areaRectangulo= (double) (base * altura);
                    System.out.println("Area es: "+areaRectangulo);
                }
            }
        }