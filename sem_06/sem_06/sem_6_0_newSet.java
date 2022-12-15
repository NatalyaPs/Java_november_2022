// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.

package sem_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class sem_6_0_newSet {

    public static void main (String[] args){   // public class Sets
        
        System.out.println(new HashSet<> (Arrays.asList (6, 5, 1, 2, 3, 2, 4, 6, 5, 3))); // [1, 2, 3, 4, 5, 6] - отсортированы по возрастанию
        
        System.out.println(new TreeSet<> (Arrays.asList (6, 5, 1, 2, 3, 2, 4, 6, 5, 3))); // [1, 2, 3, 4, 5, 6] - отсортированы по возрастанию
        
        System.out.println(new LinkedHashSet<> (Arrays.asList (6, 5, 1, 2, 3, 2, 4, 6, 5, 3)));  // [6, 5, 1, 2, 3, 4] - упорядочены по времени добавления
       
    }
}
