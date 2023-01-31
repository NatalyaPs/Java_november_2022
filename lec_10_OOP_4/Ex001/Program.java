package Ex001;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // #region type save
        // List<String> list = new ArrayList<String>();      // указываем тип обобщения < E >  // F 12 -> например <T> T[] toArray(T[] a);  набор методов, работающий с набором наперед неизвестных типов
        //// List<String> list = new ArrayList<>();     // такая же конструкция, как и строкой выше
        //// new ArrayList<>(); != new ArrayList();

        // for (int i = 1; i <= 5; i++) {
        // list.add(String.format("string %d", i));
        // }
        // System.out.println(list);

        // // list.add(123);
        // // The method add(int, String)
        // // in the type List<String> is not applicable for the arguments (int)

        // #endregion

        // #region raw type-----------------------
        // ArrayList is a raw type. References to generic type ArrayList<E> should be
        // parameterized---------------------------------

        List list = new ArrayList();               // тип интерфейса  =  кладем экземплярконкретного класса, к-й реализует этот интурфейс 2лист"  == сырой тип

        for (int i = 1; i <= 5; i++) {
            list.add(String.format("string %d", i));
        }

        System.out.println(list);
        System.out.println(allLength(list));

        list.add(123);                 // можно добавить раз-ныетипы  ==== сырой тип
        System.out.println(list);
        // System.out.println(allLength(list));       // ошибка
        // ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String

        // #endregion

    }

    static int allLength(List li) {
        int count =0;
        for (Object o : li) {
            count += ((String)o).length();
        }
        return count;
    }
}