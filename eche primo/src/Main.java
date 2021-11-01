import java.util.*;
public class Main{
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        byte casos = 0, entra = 0;
        boolean esPrimo;
        
        casos = entrada.nextByte();
        for (byte i = 1; i <= casos; i++) {
            entra = entrada.nextByte();
            if(entra >= 2 && entra % 2 == 0 && entra % 1 == 0){
                System.out.println("Es primo");
            }
            else {
                System.out.println("No es primo");
            }
        }
    }
    
}
