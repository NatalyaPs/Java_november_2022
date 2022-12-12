// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

package METHODS;

import java.util.ArrayList;
import java.util.LinkedList;

public class algorithm_speed {
    public static void main(String[] args) {
        int repeatCount = 1_000_000;
        // begin - начало времени
        long begin = System.nanoTime(); // текущее время в наносекундах (0.000 000 001 c). long - тип данных

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < repeatCount; i++) {
            arrayList.add(i);
        }
        // mid - середина времени
        long mid = System.nanoTime();

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < repeatCount; i++) {
            linkedList.add(i);
        }
        // end - конец времени
        long end = System.nanoTime();

        // System.out.printf("%d %d", mid - begin, end - mid);
        System.out.printf("%f %f", (mid - begin) / 1e+9, (end - mid) / 1e+9);  // 1e+9 == 10^9. делаем время в секундах
        // LinkedList медленнее, т.к. эл-ты разбросаны
    }
}