import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        int n, total = 0, x = 0;
        int v, sumatoria = 0;
        
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();
        int a[] = new int[n],s[] = new int[n];
        
        for (int i = 0; i < n; i++){
            v = entrada.nextInt();//pedir valores en una sola entrada
            a[i] = v;
        }
        
        for (int j = n; j < a.length - 1; j--){
            sumatoria += a[j];
            s[j] = total;
           //System.out.println(total);
        }
        for (int k = s.length -2; k >= 0; k--){
            x = s[k];
            System.out.println(x);
        }
    }    
}
