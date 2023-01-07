package lec_06;

import java.util.HashSet;
import java.util.Set;

public class Ex_001_hashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1); // добавление
        set.add(12); 
        set.add(123); 
        set.add(1234); 
        set.add(1234); // добавит только 1 такой элемент. не повторяются

        System.out.println(set.contains(12)); // true - есть ли такой элемен

        set.add(null);

        System.out.println(set.size()); // 5
        System.out.println(set); // [null, 1, 1234, 123, 12]

        set.remove(12); // удалить 

        for (var item : set) 
        System.out.println(item); // null 1 1234 123

        set.clear();  // очистить
        System.out.println(set); // []
    }
}
