
package es_par_o_impar;
import java.util.*;

public class Es_par_o_impar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String opcion;
        
        while(true){
            System.out.println("Desea agregar un numero");
            System.out.println("Escribe si para ejecutar o escrine no para no hacer nada.");
            opcion = entrada.nextLine();
            String si;
            String no;
            
            if(opcion.equals("si")){

                System.out.println("Ingresa un numero del 1 al 10");
                byte n = entrada.nextByte();
                if( n >= 1 && n <= 10 ){
                    if(n % 2 == 0){
                        System.out.println("El número es par");
                    }
                    else{
                        System.out.println("El número es impar");
                    }
                }
                else {
                    System.out.println("El numero ingresado no está en el rango de 1 a 10!"); 
                }
            }
            else if(opcion.equals("no")){
                System.out.println("Hasta luego.");
                break; 
                }
            
        }
    }
    
}
