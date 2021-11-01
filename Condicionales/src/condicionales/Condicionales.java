/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import java.util.Scanner;/**
 *
 * @author CARLOSAMA
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p;
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Quieres seguir programando? 1 = si, 2 = No:");
        p = entrada.nextInt();
        if (p == 1) {
            System.out.println("Que bien adelante ;)");
        }
        else
            if (p == 2) {
            System.out.println("Espero que vuelvas pronto :(");
        
        }
        // TODO code application logic here
    }
    
}
