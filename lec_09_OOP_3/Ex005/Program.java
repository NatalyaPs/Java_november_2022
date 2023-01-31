package lec_09_OOP_3.Ex005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        Random r = new Random();

        // // #region Collections.sort(numbers);             // сортируем коллекцию чисел

        List<Integer> numbers = new ArrayList<>();   
        for (int i = 0; i < 10; i++) {
            numbers.add(r.nextInt(1,20));
        }

        System.out.println(numbers);
        Collections.sort(numbers);                  // сортируем коллекцию чисел
        System.out.println(numbers);
        // // #endregion
        // // ------------------------------------------------------------

        // // #region Comparable<Worker>              // сортируем коллекцию работников // методом compareTo в классе Работник
        // List<Worker> db = new ArrayList<>();
        // for (int i = 0; i < 5; i++) {
        //     db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18,31),
        //     r.nextInt(10000)));
        // }
        // System.out.println(db);

        // Collections.sort(db);        // отсортировалось по возрасту, т.к. в классе Работник есть имплементация Компарабл. По возрасту
        // // Array.sort(...)

        // System.out.println(db);

        // #endregion
        // // --------------------------------------------------------------

        // #region Comparable<Worker>                // сортируем коллекцию работников  // класс AgeComporator

        List<Worker> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18, 31), r.nextInt(10000)));
        }
        System.out.println(db);

        db.sort(new AgeComporator());        // вызываем экземпляр класса AgeComporator    !!!!!!!!

        System.out.println(db);

        // #endregion
        // ----------------------------------------------------------------
        // //#region

        // // Worker w1 = new Worker("Имя", "Фамилия", 20, 20);
        // // Worker w2 = new Worker("Имя", "Фамилия", 20, 20);
        
        // db.sort((w1, w2)-> Integer.compare(w1.age, w2.age)); //  делаем так (лямбда), когда не создавали отдельный класс или не имплементировали интерфейс компаратора
        // db.sort((w1, w2)-> Integer.compare(w1.salary, w2.salary)); 
        // System.out.println(db);
        // //#endregion

    }
}
