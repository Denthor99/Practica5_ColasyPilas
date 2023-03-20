package org.ieslosremedios.daw1.prog.ut5.practica5;
import java.util.*;
import java.util.Queue;
public class TADCola {
    private List cola=new LinkedList();
    public  void encolar(List<Object> a, Object b){
        a.add(b);
        System.out.println("Nuevo elemento añadida a la cola");
    }
    public  void desencolar(Queue<Object> a){
        a.poll();
    }
    public  void frente(Queue<Object> a){
        System.out.println(a.peek());
    }
}
