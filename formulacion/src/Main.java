import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        short n, q = 0, p = 0;
        n = entrada.nextShort();
        short a[] = new short[n];
        
        for (short i = 0; i < a.length; i++){
            a[i] = entrada.nextShort();
            if (a[i] >= 0){
                q += a[i];
            }
            else {
                p += a[i];
            }
        }
        System.out.println("positivos " + q + ", " + "negativos " + p);
    } 
}
