package org.aespinosa.ejemplos.list;

import com.axis.alumno.modelo.Alumno;

import java.util.LinkedList;
import java.util.ListIterator;

public class EjemploLinkedList {

    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("está vacía = " + enlazada.isEmpty());
        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andres", 3));

        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.addFirst(new Alumno("Zeus", 5));
        enlazada.addLast(new Alumno("Atenea", 6));
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("Primero = " + enlazada.getFirst());
        System.out.println("Último = " + enlazada.getLast());
        System.out.println("Indice 2 = " + enlazada.get(2));
        //ultimo Alumno
        //Alumno zeus = enlazada.pop();
        //Primer alumno
        //enlazada.pollLast();
        //primer alumno
        enlazada.removeFirst();
        //ultimo alumno
        enlazada.removeLast();
        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.remove(new Alumno("Jano", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        Alumno a = new Alumno("Lucas", 5);
        enlazada.addLast(a);
        System.out.println("Indice de Lucas = " + enlazada.indexOf(a));

        enlazada.remove(2);
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("Indice de Lucas = " + enlazada.indexOf(a));

        enlazada.set(3, new Alumno("Lalo", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());
            //recorer la lista hacia adelante y hacia atras
         ListIterator<Alumno> li = enlazada.listIterator();
        //inicio a fin
        while(li.hasNext()){
            Alumno alumno = li.next();
            System.out.println(alumno);
        }
        System.out.println("=================== Previous");
        //fin a inicio
        while(li.hasPrevious()){
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }
        
    }
}
