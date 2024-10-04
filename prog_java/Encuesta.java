package prog_java;

public class Encuesta {
    public static void main(String[] args) {
        
    
    int  edad1, edad2;
    String name1, name2;

    System.out.println("ingrese el primer nombre");
        name1 = System.console().readLine();

        System.out.println("ingrese el primer nombre");
        name2 = System.console().readLine();

        System.out.println("ingrese la primera edad");
        edad1 = Integer.parseInt(System.console().readLine());

        System.out.println("ingrese la primera edad");
        edad2 = Integer.parseInt(System.console().readLine());

        if  (edad1 > edad2) {
            System.out.println("la persona mayor es: "+ name1);
    
        } else {
            System.out.println("la persona mayor es: "+ name2);
        }
}
}