import java.util.Scanner;//Importa el paquete de la clase Scanner

public class Edad_Actual {//Define la clase principal

    public static void main(String[] args) {//Define el método principal
        
        Scanner teclado = new Scanner(System.in);//Se crea la entrada para la recepción de los datos
        
        System.out.println("Ingrese su edad.");//Solicita la acción a seguir
        
        int edad = teclado.nextInt();//Recepciona el dato ingresado y lo almacena en una varible
        
        System.out.println("Su edad para el próximo año es: " + (edad+1) + " años.");//Muestra y ejecuta la acción solicitada
        
    }
    
}
