// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

package home_work_04;

import java.util.LinkedList;
import java.util.Random;

public class hw_4_1_linkedList_revers {
    public static void main(String[] args) 
    {
        int n = 10; // количество элементов
        LinkedList<Integer> ll_source = new LinkedList<Integer>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            ll_source.add(random.nextInt(100));
            // ll_source.add(random.nextInt(1, 100));
        }
        System.out.println("Исходный список: " + ll_source);

        ll_source = reverseLinkedList(ll_source);
        System.out.println("Перевернутый список: " + ll_source);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> ll_source) 
    {
        LinkedList<Integer> ll_reverse = new LinkedList<Integer>();

        for (int i = ll_source.size() - 1; i >= 0; i--) {
            ll_reverse.add(ll_source.get(i));
        }

        return ll_reverse;
    }
}

// пример использования метода LinkedList descendingIterator():

// import java.util.*;
  
// public class GFG1 {
//     public static void main(String[] argv)
//         throws Exception
//     {
  
//         try {
  
//             // creating object of TreeMap<Integer, String>
//             LinkedList<String> list = new LinkedList<String>();
  
//             // add some elements to list
//             list.add("A");
//             list.add("B");
//             list.add("C");
  
//             // print the linked list
//             System.out.println("LinkedList:" + list);
  
//             // set Iterator as descending
//             // using descendingIterator() method
//             Iterator x = list.descendingIterator();
  
//             // print list with descending order
//             while (x.hasNext()) {
//                 System.out.println("Value is : "
//                                    + x.next());
//             }
//         }
  
//         catch (NullPointerException e) {
//             System.out.println("Exception thrown : "
//                                + e);
//         }
//     }
// }