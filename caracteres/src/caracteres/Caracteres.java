/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracteres;

import java.util.Scanner;

/**
 *
 * @author CARLOSAMA
 */
public class Caracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre_uno = "";
        String nombre_dos = "";
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Porfavor ingrese el primer nombre: ");
        nombre_uno = entrada.nextLine();
        
        System.out.print("Porfavor ingrese el segundo nombre: ");
        nombre_dos = entrada.nextLine();
        
        if (nombre_uno.equals (nombre_dos)){
            System.out.print("Los nombres son iguales. ");
        }
        else{
            System.out.print("Los nombres son dierentes. ");
        }
        
        
        
        
        
        // TODO code application logic here
    }
    
}
