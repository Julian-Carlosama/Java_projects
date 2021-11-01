/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional.simple;

import java.util.Scanner;/**
 *
 * @author CARLOSAMA
 */
public class CondicionalSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese un valor entero de p");
        p = entrada.nextInt();
        if (p % 2 == 0) {
            System.out.println("El numero p ingresado es par");
        }
        else 
            System.out.println("El valor ingresado de p es impar");
                }
        // TODO code application logic here
    }
    

