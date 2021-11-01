/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional.numerico;

import java.util.Scanner;

public class CondicionalNumerico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int e;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese un valor entero");
        e = entrada.nextInt();
        if (e > 0) {
            System.out.println("Es valor ingresado es positivo");
        }
        else
            if (e < 0) {
                System.out.println("El valor agregado es negativo");
            }
                   
        else {
            System.out.println("El valor es nulo");
            }
             
         
    }
    
}
