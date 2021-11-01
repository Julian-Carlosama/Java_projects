import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        short n = entrada.nextShort();
        int a[] = new int[n];
        
        int x = entrada.nextInt();
        for(int i = 0; i < n; i++){
                a[i] = x;
                break;
        }
        int sumatoria =0;
        for(int i = 0; i < a.length; i--){
            sumatoria = a[i]++;
            
            
            
        }
        System.out.println(sumatoria);
    }  
}
