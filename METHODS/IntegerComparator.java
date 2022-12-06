package METHODS;

import java.util.Comparator;

// сравниватель целых чисел
// если o1 < o2 , то должен вернуть отрицательное число
// если o1 > o2 , то должен вернуть положительное число
// если o1 = o2 , то должен вернуть 0
// можно через обычный цикл: if, else if, else if. Если <, то вернуть -1; если >, то вернуть +1; если =, то вернуть 0

public class IntegerComparator implements Comparator<Integer>{ //наш самодельный класс интеджер компаратор реализует интерфейс компаратор

    @Override
    public int compare(Integer o1, Integer o2) {
        // TODO Auto-generated method stub
        return o1 - o2; // по возрастанию
        // return o2 - o1 // по убыванию
    }
    
}