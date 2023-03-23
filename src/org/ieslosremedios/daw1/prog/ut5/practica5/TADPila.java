package org.ieslosremedios.daw1.prog.ut5.practica5;

import java.util.*;

public class TADPila {
    private List pila=new LinkedList();

    public  void encolar(Object b){
        pila.add(b);
        System.out.println("Nuevo elemento añadida a la cola");
    }
    public  void desencolar(){
        pila.remove(pila.size()-1);
    }
    public  void frente(){

        System.out.println(pila.get(pila.size()-1));
    }
}
