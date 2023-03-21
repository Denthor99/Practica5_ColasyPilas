package org.ieslosremedios.daw1.prog.ut5.practica5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> colas=new LinkedList<Integer>();
        colas.offer(1);
        colas.offer(2);
        colas.offer(3);
        colas.offer(4);
        System.out.println(colas);
        System.out.println(colas.peek());
        colas.poll();
        System.out.println(colas);
    }
}