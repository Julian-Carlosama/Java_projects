import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        short caso;
        String operacion;
        int digitoA, digitoB;
        int resultA = 0, resultB = 0, suma = 0, resta = 0;
        LinkedList<Integer> A = new LinkedList<>();
        LinkedList<Integer> B = new LinkedList<>();
        Iterator <Integer> recorre ;
        Scanner entrada = new Scanner(System.in);
        
        //caso = entrada.nextShort();
        int cas = 1, bina = 0;
        //while (cas <= caso){
            /*operacion = entrada.next();
            if (operacion.equals("+")){
                suma = resultA + resultB;  
            }
            else if (operacion.equals("-")){
                resta = resultA -resultB;
            }*/
            while(true){
                digitoA = entrada.nextInt();
                if (digitoA == 0 || digitoA == 1){
                    A.add(digitoA);
                    for (int j = 0; j < A.size(); j++){
                        bina = A.get(j);
                        resultA = (int) ((bina) * (Math.pow(2,j)));
                    }
                }
                else if (digitoA == -1){
                    continue;
                }
                System.out.println("ingrese digito b");
                digitoB = entrada.nextInt();
                if (digitoB == 0 || digitoB == 1){
                    B.add(digitoB);
                    for (int k = 0; k < B.size(); k++){
                        bina = B.get(k);
                        resultB = (int) ((bina) * (Math.pow(2,k)));
                    }
                }
                else if (digitoB == -1){
                    break;
                }
                System.out.println(resultA);
                //System.out.println(resultB);
            }
            cas ++;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*caso = entrada.nextShort();
        for (short i = 1; i <= caso; i++ ){
            operacion = entrada.next();
            if(operacion.equals("+")){
                suma = resultA + resultB;
            }
            else if(operacion.equals("-")){
                resta = resultA - resultB;
            }
            while (true){
                int digitoA = entrada.nextInt();
                if (digitoA == 0 || digitoA == 1){
                    A.add(digitoA);
                    
                    for (int j = 0; j < A.size(); j++) {
                        int sumaA = (int)(j*Math.pow(2,j));//sumar cada uno de los elementos y elevarlos a su respectiva potencia
                        resultA = sumaA;
                    }
                }
                else if(digitoA == -1){
                    break;
                }
            }
            while (true){
                int digitoB = entrada.nextInt();
                if (digitoB == 0 || digitoB == 1){
                    B.add(digitoB);
                    for (int j = 0; j < B.size(); j++) {
                        int sumaB = (int)(j*Math.pow(2,j));
                        resultB = sumaB;
                        
                    }
                }
                else if (digitoB == -1){
                    break;
                }
            }
            
            System.out.println(resultA);
            System.out.println(resultB);*/
        
            
            
        }
    }
}
