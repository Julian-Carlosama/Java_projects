import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> baraja = new LinkedList<>();
        LinkedList<String> usuario = new LinkedList<>();
        LinkedList<String> jugador_2 = new LinkedList<>();
        LinkedList<String> jugador_3 = new LinkedList<>();
        LinkedList<String> jugador_4 = new LinkedList<>();
        Iterator<String> recorrer;
        Scanner entrada = new Scanner(System.in);

        String[] numero = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] pintas = {"corazon","pica","trebol","diamante"};
        
        for (int i = 0; i < 13; i++) {
            baraja.add(numero[i] + " corazon");
            baraja.add(numero[i] + " corazon");
        }

        for (int i = 0; i < 13; i++) {
            baraja.add(numero[i] + " trebol");
            baraja.add(numero[i] + " trebol");
        }

        for (int i = 0; i < 13; i++) {
            baraja.add(numero[i] + " pica");
            baraja.add(numero[i] + " pica");
        }

        for (int i = 0; i < 13; i++) {
            baraja.add(numero[i] + " diamante");
            baraja.add(numero[i] + " diamante");
        }

        Collections.shuffle(baraja);

        for (int i = 0; i < 32; i++) {
            if (i >= 0 && i < 8) {
                usuario.add(baraja.getLast());
                baraja.removeLast();
            } else if (i >= 8 && i < 16) {
                jugador_2.add(baraja.getLast());
                baraja.removeLast();
            } else if (i >= 16 && i < 24) {
                jugador_3.add(baraja.getLast());
                baraja.removeLast();
            } else if (i >= 24 && i < 32) {
                jugador_4.add(baraja.getLast());
                baraja.removeLast();
            }
        }
        String carta = baraja.getLast(); 
        baraja.removeLast();
        int turno = 0;
        
        while(usuario.size()!=0 || jugador_2.size()!=0 || jugador_3.size()!=0 || jugador_4.size()!=0){
            mainloop:
            if(turno == 0){
                
                recorrer = usuario.iterator();
                String carta_parts[] = carta.split(" ");
                
                while(recorrer.hasNext()){
                    String q = recorrer.next();
                    String usuario_parts[] = q.split(" ");
                    if(usuario_parts[0].equals(carta_parts[0]) || usuario_parts[1].equals(carta_parts[1])){
                        System.out.println("                                                                  ");
                        System.out.println("|---------------------------------------------------------------------------------------------------------------------|");
                        System.out.println("                               |-----------------------|");
                        System.out.println("                               "+"| cartas jugador 3: "+jugador_3.size()+"   |");
                        System.out.println("                               |-----------------------|");
                        System.out.println("");
                        System.out.println("|-----------------------|                                     |-----------------------|");
                        System.out.println("| cartas jugador 2: "+jugador_2.size()+"   |        |-------------------|        "+"| cartas jugador 4: "+jugador_4.size()+"   |");
                        System.out.println("|-----------------------|            Carta en juego           |-----------------------|                 ");
                        System.out.println("                                       "+carta+"         ");
                        System.out.println("                                 |-------------------|      ");
                        System.out.println("");
                        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------|");
                        System.out.println("| Tus cartas : "+(usuario)+" tienes "+usuario.size()+" cartas");
                        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------|");
                        System.out.println("Es tu turno");
                        System.out.println("                            ");
                        System.out.println("¿Desea Arrastrar una carta del mazo?: si, no.");
                        
                        String decision = entrada.next();
                        
                        if (decision.equals("si")){
                            
                            usuario.addFirst(baraja.getLast());
                            baraja.removeLast();
                            System.out.println("|---------------------------------------------------------------------------------------------------------------------|");
                            System.out.println("                               |-----------------------|");
                            System.out.println("                               "+"| cartas jugador 3: "+jugador_3.size()+"   |");
                            System.out.println("                               |-----------------------|");
                            System.out.println("");
                            System.out.println("|-----------------------|                                     |-----------------------|");
                            System.out.println("| cartas jugador 2: "+jugador_2.size()+"   |        |-------------------|        "+"| cartas jugador 4: "+jugador_4.size()+"   |");
                            System.out.println("|-----------------------|            Carta en juego           |-----------------------|                 ");
                            System.out.println("                                       "+carta+"         ");
                            System.out.println("                                 |-------------------|      ");
                            System.out.println("");
                            System.out.println("|-------------------------------------------------------------------------------------------------------------------------------|");
                            System.out.println("| Tus cartas : "+(usuario)+" tienes "+usuario.size()+" cartas");
                            System.out.println("|-------------------------------------------------------------------------------------------------------------------------------|");
                            
                            System.out.println("                            ");
                            
                            turno =turno+1;
                            break mainloop;
                             
                        }
                        else if (decision.equals("no")){
                            System.out.println("seleccione una carta de su mano");
                            String usuario_elemento_1 = entrada.next();
                            String usuario_elemento_2 = entrada.next();
                            for(int i = 0; i < 13;){
                                if(usuario_elemento_1.equals(numero[i])){
                                    for(int j = 0; j < 4;){
                                        if(usuario_elemento_2.equals(pintas[j])){
                                                if(usuario_elemento_1.equals(carta_parts[0]) || usuario_elemento_2.equals(carta_parts[1])){
                                                    baraja.addFirst(carta);
                                                    carta = usuario_elemento_1 +" "+ usuario_elemento_2;
                                                    usuario.remove(usuario.indexOf(carta));
                                                    /*System.out.println("                                                                  ");
                                                    System.out.println("|-------------------------------------------------------------------------------------------------------------------------------|");
                                                    System.out.println("                               |-----------------------|");
                                                    System.out.println("                               "+"| cartas jugador 3: "+jugador_3.size()+"   |");
                                                    System.out.println("                               |-----------------------|");
                                                    System.out.println("");
                                                    System.out.println("|-----------------------|                                     |-----------------------|");
                                                    System.out.println("| cartas jugador 2: "+jugador_2.size()+"   |        |-------------------|        "+"| cartas jugador 4: "+jugador_4.size()+"    |");
                                                    System.out.println("|-----------------------|            Carta en juego           |-----------------------|                 ");
                                                    System.out.println("                                       "+carta+"         ");
                                                    System.out.println("                                 |-------------------|      ");
                                                    System.out.println("");
                                                    System.out.println("|-------------------------------------------------------------------------------------------------------------------------------|");
                                                    System.out.println("| Tus cartas : "+(usuario)+ " tienes "+usuario.size()+" cartas");
                                                    System.out.println("|-------------------------------------------------------------------------------------------------------------------------------|");
                                                    System.out.println("                     ");*/
                                                    turno = turno+1;
                                                    break mainloop;
                                                }
                                                else{
                                                    System.out.println("no tienes posibles movimientos, tomaste un carta del mazo");
                                                    usuario.addFirst(baraja.getLast());
                                                    baraja.removeLast();
                                                    turno=turno+1;
                                                    break mainloop;
                                                }
                                            
                                            
                                            
                                        }
                                        else if(j == 3 ){
                                            System.out.println("Ingrese una carta valida");
                                            j=0;
                                            break mainloop;
                                        }
                                    
                                        else if(!usuario_elemento_2.equals(pintas[j])){
                                            j=j+1;
                                        }
                                    }
                                
                                }
                            
                                else if(i == 12){
                                    System.out.println("Ingrese una carta valida");
                                    i=0;
                                break;
                                }
                            
                                else if(!usuario_elemento_1.equals(numero[i])){
                                    i = i+1;
                                
                                }   
                            }
                        }
                        else if (!decision.equals("si") && !decision.equals("no")){
                            System.out.println("ERROR: la opcion es invalida, escriba bien no sea bruto!");
                            break mainloop;
                        }
                        String usuario_elemento_1 = entrada.next();
                        String usuario_elemento_2 = entrada.next();
                        for(int i = 0; i < 13;){
                            if(usuario_elemento_1.equals(numero[i])){
                                for(int j = 0; j < 4;){
                                    if(usuario_elemento_2.equals(pintas[j])){
                                            if(usuario_elemento_1.equals(carta_parts[0]) || usuario_elemento_2.equals(carta_parts[1])){
                                                baraja.addFirst(carta);
                                                carta = usuario_elemento_1 +" "+ usuario_elemento_2;
                                                usuario.remove(usuario.indexOf(carta));
                                                /*System.out.println("                                                                  ");
                                                System.out.println("|-------------------------------------------------------------------------------------------------------------------------------|");
                                                System.out.println("                               |-----------------------|");
                                                System.out.println("                               "+"| cartas jugador 3: "+jugador_3.size()+"   |");
                                                System.out.println("                               |-----------------------|");
                                                System.out.println("");
                                                System.out.println("|-----------------------|                                     |-----------------------|");
                                                System.out.println("| cartas jugador 2: "+jugador_2.size()+"   |        |-------------------|        "+"| cartas jugador 4: "+jugador_4.size()+"    |");
                                                System.out.println("|-----------------------|            Carta en juego           |-----------------------|                 ");
                                                System.out.println("                                       "+carta+"         ");
                                                System.out.println("                                 |-------------------|      ");
                                                System.out.println("");
                                                System.out.println("|-------------------------------------------------------------------------------------------------------------------------------|");
                                                System.out.println("| Tus cartas : "+(usuario)+ " tienes "+usuario.size()+" cartas");
                                                System.out.println("|-------------------------------------------------------------------------------------------------------------------------------|");
                                                System.out.println("                     ");*/
                                                turno = turno+1;
                                                break mainloop;
                                            }
                                            else{
                                                System.out.println("no tienes posibles movimientos, tomaste un carta del mazo");
                                                usuario.addFirst(baraja.getLast());
                                                baraja.removeLast();
                                                turno=turno+1;
                                                break mainloop;
                                            }
                                            
                                            
                                            
                                    }
                                    else if(j == 3 ){
                                        System.out.println("Ingrese una carta valida");
                                        j=0;
                                        break mainloop;
                                    }
                                    
                                    else if(!usuario_elemento_2.equals(pintas[j])){
                                        j=j+1;
                                    }
                                }
                                
                            }
                            
                            else if(i == 12){
                                System.out.println("Ingrese una carta valida");
                                i=0;
                                break;
                            }
                            
                            else if(!usuario_elemento_1.equals(numero[i])){
                                i = i+1;
                                
                            }   
                        }
                    }
                }
            }
            else if(turno == 1){
                String carta_parts[] = carta.split(" ");
                recorrer = jugador_2.iterator();
                while(recorrer.hasNext()){
                    String q = recorrer.next();
                    String jugador_2_parts[] = q.split(" ");
                    if(jugador_2_parts[0].equals(carta_parts[0])||jugador_2_parts[1].equals(carta_parts[1])){
                        baraja.addFirst(carta);
                        carta = jugador_2_parts[0]+" "+jugador_2_parts[1];
                        jugador_2.remove(jugador_2.indexOf(carta));
                        turno = turno+1;
                        break mainloop;
                    }
                    else if(!jugador_2_parts[0].equals(carta_parts[0]) && !jugador_2_parts[1].equals(carta_parts[1])){
                        jugador_2.add(baraja.getLast());
                        baraja.removeLast();
                        if(jugador_2_parts[0].equals(carta_parts[0])||jugador_2_parts[1].equals(carta_parts[1])){
                            baraja.addFirst(carta);
                            carta = jugador_2_parts[0]+" "+jugador_2_parts[1];
                            jugador_2.remove(jugador_2.indexOf(carta));
                            turno=turno+1;
                            break mainloop;
                        }
                        else{
                            turno=turno+1;
                            break mainloop;
                        }
                    }
                }
            }
            
            else if(turno==2){
                String carta_parts[] = carta.split(" ");
                recorrer=jugador_3.iterator();
                while(recorrer.hasNext()){
                    String q = recorrer.next();
                    String jugador_3_parts[] = q.split(" ");
                    if(jugador_3_parts[0].equals(carta_parts[0])||jugador_3_parts[1].equals(carta_parts[1])){
                        baraja.addFirst(carta);
                        carta = jugador_3_parts[0]+" "+jugador_3_parts[1];
                        jugador_3.remove(jugador_3.indexOf(carta));
                        turno=turno+1;
                        break mainloop;
                    }
                    else if(!jugador_3_parts[0].equals(carta_parts[0]) && !jugador_3_parts[1].equals(carta_parts[1])){
                        jugador_3.add(baraja.getLast());
                        baraja.removeLast();
                        if(jugador_3_parts[0].equals(carta_parts[0])||jugador_3_parts[1].equals(carta_parts[1])){
                            baraja.addFirst(carta);
                            carta = jugador_3_parts[0]+" "+jugador_3_parts[1];
                            jugador_3.remove(jugador_3.indexOf(carta));
                            turno=turno+1;
                            break mainloop;
                        }
                        else{
                            turno=turno+1;
                            break mainloop;
                        }
                    }
                }
            }
            
            else if(turno==3){
                String carta_parts[] = carta.split(" ");
                recorrer=jugador_4.iterator();
                while(recorrer.hasNext()){
                    String q = recorrer.next();
                    String jugador_4_parts[] = q.split(" ");
                    if(jugador_4_parts[0].equals(carta_parts[0])||jugador_4_parts[1].equals(carta_parts[1])){
                        baraja.addFirst(carta);
                        carta = jugador_4_parts[0]+" "+jugador_4_parts[1];
                        jugador_4.remove(jugador_4.indexOf(carta));
                        turno=0;
                        break mainloop;
                    }
                    else if(!jugador_4_parts[0].equals(carta_parts[0]) && !jugador_4_parts[1].equals(carta_parts[1])){
                        jugador_4.add(baraja.getLast());
                        baraja.removeLast();
                        if(jugador_4_parts[0].equals(carta_parts[0])||jugador_4_parts[1].equals(carta_parts[1])){
                            baraja.addFirst(carta);
                            carta = jugador_4_parts[0]+" "+jugador_4_parts[1];
                            jugador_4.remove(jugador_4.indexOf(carta));
                            turno=0;
                            break mainloop;
                        }
                        else{
                            turno=0;
                            break mainloop;
                        }
                    }
                }
            }
        }
    }
}
