import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        short n, i, b, c;
        
        n = entrada.nextShort();
        short a[] = new short[n];
        
        for (i = 0; i < n; i++){
            a[i] = entrada.nextShort();  
        }
        System.out.println("arreglo ordenado");
        Arrays.sort(a);
        for (i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println("numero a buscar");
        b = entrada.nextShort();
        c = (short) Arrays.binarySearch(a, b);
        if (c >= 0){
            System.out.println("se encuentra");
        }
        else {
            System.out.println("no se encuentra");
        }
    }
}
