import java.util.*;
public class Main {
    
    public class nodo {
        private Integer value;
        public nodo izquierdo;
        private nodo derecho;
        
        public nodo(Integer value){
            this.value = value;
        }
        public Integer getValue(){
            return value;
        } 
        // funcion de recorrido preorden,  Raiz Izquierdo Derecho
        public void preorden(nodoArbol nodo){
            if (nodo == null)
                return;
            System.out.print("Nodo value => " + nodo.value);
            preorden(nodo.hijo1);
            preorden(nodo.hijo2);
        }
        // funcion recorrido inorden, Izquierdo Raiz Derecho
        public void inorden(nodoArbol nodo){
            if (nodo == null)
                return;
            inorden(nodo.hijo1);
            System.out.print("Nodo value => " + nodo.value);
            inorden(nodo.hijo2);
        }
        // funcion posorden; Izquierdo Derecho Raiz
        public void posorden(nodoArbol nodo){
            if(nodo == null)
                return;
            posorden(nodo.hijo1);
            posorden(nodo.hijo2);
            System.out.print("Nodo value => " + nodo.value);
            
        }
    }
    public static void main(String[] args) {
        
       
    }
    
    
}
