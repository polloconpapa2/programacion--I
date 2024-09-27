package prog_java;

public class CajeroAutomatico {
    public static void main(String[] args) {
        
    
    int monto, cants10, cants20, cants50;
        

        System.out.println("ingrese la cantidad: ");
        monto = Integer.parseInt(System.console().readLine());

        cants50 = monto / 50;
        monto = monto% 50;

        cants20 = monto / 20;
        monto = monto% 20;
        
        cants10 = monto / 10;
        monto = monto% 10;

       

        
        

        System.out.println("los billetes de 10 son: "+cants10);  
        System.out.println("los billetes de 20 son: "+cants20);
        System.out.println("los billetes de 50 son: "+cants50); 
           
}
}
