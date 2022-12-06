
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

package sem_4_dz;
import java.io.*;
import java.util.LinkedList;

public class sem_4_dz_2 {
    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<Object>();
        linkedList.add(911);
        linkedList.add("Hello");
        linkedList.add(3.14);
        linkedList.add("Bye");
        linkedList.add("Great");
        linkedList.add(112);

        System.out.println("Исходный список: " + linkedList);
        enqueue(linkedList, 231);
        dequeue(linkedList);
        first(linkedList);
        System.out.println("Конечный список: " + linkedList);

    }
    public static void enqueue(LinkedList list, Object element) { 
        list.addLast(element);
    }

    public static void dequeue(LinkedList list) { 
        System.out.println(list.get(0));
        list.removeFirst();
    }

    public static void first(LinkedList list) { 
        System.out.println(list.get(0));
    }

}
