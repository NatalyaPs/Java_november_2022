package sem_09_OOP_3.task_3_ListIterator_Alex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add ("create");
        list.add ("update");
        list.add ("read");
        list.add ("delete");

        // task A
        Iterator<String> iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // task B
        System.out.println();
        ListIterator<String> iterator1 = list.listIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next().toUpperCase());  // +верхний регистр
        }

        // task B  - из конца в начало
        System.out.println();
        ListIterator<String> iterator2 = list.listIterator(list.size()); // здесь НЕ size - 1, т.к. size  после последнего
        while (iterator1.hasPrevious()) {
            System.out.println(iterator1.previous().toUpperCase());  // +верхний регистр
        }


        // System.out.println();
        // Scanner scanner = new Scanner(System.in);
        // ListIterator<String> listIterator = list.listIterator();

        // String action = scanner.next();

        // if (action.equals("f") && ) {

        // }

            // scanner.close();
    }
}
