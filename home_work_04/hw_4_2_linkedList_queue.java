// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

package home_work_04;

import java.util.LinkedList;

public class hw_4_2_linkedList_queue {
    public static void main(String[] args) {
        LinkedList <String> trainingList = new LinkedList<String>();
        enqueue(trainingList, "первый");
        enqueue(trainingList, "второй");
        enqueue(trainingList, "третий");
        enqueue(trainingList, "четвертый");
        enqueue(trainingList, "пятый");
        enqueue(trainingList, "шестой");
        enqueue(trainingList, "седьмой");
        enqueue(trainingList, "восьмой");
        System.out.printf("наш созданный LinkedList: %s", trainingList);
        System.out.println();
        System.out.printf("вернули и удалили 1-й элемент: %s", dequeue(trainingList));
        System.out.println();
        System.out.printf("проверяем наш LinkedList: %s", trainingList);
        System.out.println();
        System.out.printf("вернули 1-й элемент, не удаляя: %s", first(trainingList));
        System.out.println();
        System.out.printf("проверяем наш LinkedList: %s", trainingList);
    }   

    // помещает элемент в конец очереди
    public static void enqueue (LinkedList<String> newStr, String el) {
        newStr.addLast(el);  
        // newStr.add(el);
    }

    // возвращает первый элемент из очереди и удаляет его  
    public static String dequeue (LinkedList<String> newStr){
        return newStr.pollFirst(); // null если список пуст
    }

    // first() - возвращает первый элемент из очереди, не удаляя
    public static String first (LinkedList<String> newStr){
        return newStr.peekFirst();// null если список пуст
    }
}
// https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/util/LinkedList.html