package org.ieslosremedios.daw1.prog.ut5.practica5;
import java.util.*;
public class TADCola {
    private List cola=new LinkedList();

    public  void encolar(Object b){
        cola.add(b);
        System.out.println("Nuevo elemento añadida a la cola");
    }
    public  void desencolar(){
        cola.remove(0);
    }
    public  void frente(){

        System.out.println(cola.get(0));
    }
}
