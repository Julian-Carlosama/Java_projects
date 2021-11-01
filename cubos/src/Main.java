import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        byte n;
        int i;
        
        
        
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextByte();
        
        i = n*n*(n+1)*(n+1)/4;
        System.out.println(i);
        
    }
    
}
