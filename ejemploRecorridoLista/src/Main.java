
import java.util.*;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int entra, n = 0;

        LinkedList<Integer> datos = new LinkedList<>();
        Iterator<Integer> iterador;
        Scanner entrada = new Scanner(System.in);

        JOptionPane.showInputDialog(null,"ingrese los datos");
        
        while (true){
            entra = entrada.nextInt();
            if (entra != 0){
                datos.add(entra);
            }
            else {
                break;
            }
        }
        iterador = datos.listIterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

    }

}
/*import java.util.*;
public class Main {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Iterator<Integer> myiterador;
        LinkedList inventario = new LinkedList();
        LinkedList tener = new LinkedList();
        String grito;int entra,sale;
        while(true){
            grito = entrada.next();
            if("entra".equals(grito)){
                entra = entrada.nextInt();
                inventario.add(entra);
            }
            else if("sale".equals(grito)){
                sale = entrada.nextInt();
                myiterador = inventario.iterator();
                while(myiterador.hasNext()){
                    int valor = myiterador.next();
                    if(valor == sale){
                        inventario.remove(inventario.indexOf(valor));
                    }
                }
            }
            else if("tenemos".equals(grito)){
                tener.add("tenemos");
                myiterador = inventario.iterator();
                while(myiterador.hasNext()){
                    int m = myiterador.next();
                    tener.add(m);
                }
            }
            else{
                break;
            }
        }
        myiterador = tener.iterator();
        while(myiterador.hasNext()){
            System.out.println(myiterador.next());
        }
    }
}*/