import java.util.*;//Importa la librería que contiene escanner.

public class Calcular_doble_entero {//Define la clase principal.

    public static void main(String[] args) {//Define el método principal.
        
        Scanner teclado = new Scanner(System.in);//Crea la entrada para la recepción de los datos.
        
        //System.out.println("Ingresa un número entero.");//Solicita la entrada de los datos a procesar.
        
        float dato;//Crea una variable y se define el tipo de dato
        
        while(true){//Se crea un bucle para que se ejecuten las siguientes instrucciones hasta que sean válidas  
            System.out.println("Ingresa un número entero:");//Solicita al usuario que ingrese un dato para procesar
            dato = teclado.nextFloat();//Recepciona el dato ingresado y lo asigna a la variable anteriormente creada
            
            if(dato % 1 == 0){//Evalúa si el dato ingresado es entero
            System.out.printf("%nIngresaste el %.0f ", dato);//Muestra el dato ingresado 
            System.out.printf("%n");//Hace un salto de linea
            System.out.printf("%nEl doble de este es: %.0f", (dato*2));//Muestra el doble del dato ingresado
            System.out.printf("%nSu mitad es: %.1f" , (dato/2));//Muestra la mitad del dato ingresado
            System.out.printf("%n");//Hace un salto de linea
            
            break; //Finaliza el bucle
            }
            else{//Cuando el dato ingresado no es el esperado, ejecutará lo siguiente..
                System.out.println("No ingresaste un entero válido.");//Imprime una advertencia al usuario sobre el dato que ingreso
            
            }
        }
        
    }
    
}
