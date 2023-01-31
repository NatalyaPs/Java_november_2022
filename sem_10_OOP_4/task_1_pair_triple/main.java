/*
1. Пара хранит в себе два значения произвольных типов, например,Pair<Integer, String> или Pair<Float, Double>. 
Напишите самодельный класс Pair, используя обобщения. У него должны быть конструкторы, геттеры и toString ().

2. Тройка хранит в себе три значения произвольных типов, например,Triple<Integer, Integer, Integer>. Напишите самодельный класс Triple.

3. Напишите функцию, которая возвращает тройку случайных целых чисел в диапазоне от 0 до 255 (то есть случайный цвет).
*/

package sem_10_OOP_4.task_1_pair_triple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        // сделали для проверки
        Pair<Integer, String> pair1 = new Pair<>(1, "abc");
        Pair<Integer, String> pair2 = new Pair<>(2, "def");

        System.out.println(pair1 + "\n" + pair2);
        
        // изменяемый список
        List<Triple<Integer, Double, String>> tripleList1 = new ArrayList<>();
        tripleList1.add(new Triple<>(250, 3.0, "bmv"));  // ripleList1.add(new Triple<Integer,Double,String>(250, 3.0, "bmv")); был такой вариант ,но можно сократить, т.к. задано уже в List
        tripleList1.add(new Triple<>(220, 2.5, "audi"));
        tripleList1.add(new Triple<>(700, 1.4, "lada"));

        // неизменяемый список
        List<Triple<Integer, Double, String>> tripleList2 = Arrays.asList(
            new Triple<>(100, 5.0, "fff"),  // new Triple<Integer,Double,String>(100, 5.0, "fff"), был такой вариант ,но можно сократить, т.к. задано уже в List
            new Triple<>(200, 7.5, "kkk"),
            new Triple<>(300, 8.4, "bbb")
        );
        
        System.out.println(tripleList1);
        System.out.println(tripleList2);

        System.out.println(randomColor());
    }

    private static Triple<Integer, Integer, Integer> randomColor() {
        // Random random = new Random(47);   // число 47 в рандоме - магическое - Алексей :)
        // return new Triple<>(new Random().nextInt(256), new Random().nextInt(256),new Random().nextInt(256));
        return new Triple<>(getNumber(), getNumber(), getNumber());
    }

    private static int getNumber() {
        return new Random().nextInt(256);
    }
}
