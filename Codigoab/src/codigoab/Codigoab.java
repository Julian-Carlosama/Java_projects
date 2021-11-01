/*El siguiente codigo es una construcion anvanzada de la programacion en java. 
 * Vamos con el primer paso.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigoab;

import java.util.Scanner;

/**
 *
 * @author CARLOSAMA
 */
public class Codigoab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int entero;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero que este en el rango de -200 a 200");
        
       
        entero = entrada.nextInt();
        
        
        System.out.println("el numero entero elevado al cuadrado es: " +  (entero)*2);
       
    }      // TODO code application logic here
}
    

