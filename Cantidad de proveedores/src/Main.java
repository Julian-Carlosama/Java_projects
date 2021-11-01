import java.util.*;
public class Main {
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        
        int nit;
        TreeSet <Integer> arb = new TreeSet <>();
        
        while(true){
            nit = entrada.nextInt();
            if (nit == -1){
                break;
            }
            else{
                arb.add(nit);
            }
            
        }
        System.out.println(arb.size());
        
    }
}
