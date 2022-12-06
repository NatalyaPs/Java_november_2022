/*Задание состоит из двух блоков
Задание №2.1
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
Вывести название каждой планеты и количество его повторений в списке.

Задание №2.2
Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
*/

package sem_03;

import java.util.ArrayList;
// import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.sound.sampled.SourceDataLine;


public class sem03_2_list_planets_count {
     /**
     * @param args
     */

    // Alexey Sh: 
    // public static void main(String[] args) {
    //     List<String> list = new ArrayList<>();

    //     list.add("Марс");
    //     list.add("Венера");
    //     list.add("Земля");
    //     list.add("Плутон");
    //     list.add("Юпитер");
    //     list.add("Уран");
    //     list.add("Марс");
    //     list.add("Земля");
    //     list.add("Сатурн");

    //     list.sort(new Comparator<String>() {
    //         @Override
    //         public int compare(String o1, String o2) {
    //         return o1.compareTo(o2);
    //         }
    //         });


    //     for (int i = 0; i < list.size(); i++) {
    //         int count = 0;
    //         String str = list.get(i); // в строке get(получить), а в массиве [i]
    //         for (int j = i; j < list.size(); j++) {

    //             if (list.get(j).equals(str)) {
    //                 count++;
    //             }
    //         }
    //     System.out.println(str + " " + count); // ч.б. выводился крайний элемент
    //     }
    // }

    // =============================================
        //}
    // Дмитрий Зеленцов: 
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Юпитер");
        list.add("Земля");
        list.add("Плутон");
        list.add("Меркурий");
        list.add("Юпитер");
        list.add("Земля");
        list.add("Земля");
        list.add("Марс");
        list.add("Марс");
        list.add("Земля");
        list.add("Юпитер");

        int count = 0;
        // Collections.sort(list);  // из кода Дмитрия. Но у меня не работает. Возможно, это метод из отдельного файла?
        list.sort(new Comparator<String>() {  // вставила кусочек из решения Алексея (см выше) для сортировки списка
            @Override
            public int compare(String o1, String o2) {
            return o1.compareTo(o2);
            }
        });
        System.out.println(list);  // отсортированный список

        for (int i = 0; i < list.size(); i++) {
            count += 1;
        if ((i + 1) == list.size() || !list.get(i).equals (list.get(i+1))) {
            System.out.println(list.get(i) + " " + count);
            count = 0;
        }
        }

        /* 
        Задание №2.2
        Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
        */
        // Set<String> set = new HashSet<>();
        // System.out.print(set);

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).equals(list.get(i - 1))){
                list.remove(i);
                i--;    //  перешагиваем назад, т.к после удаения эл-та все эл-ты списка сдвигаются влево, а мы еще делаем след шаг в цикле(i++) вправо, поэтому надо вернуться назад, чтоб не перепрыгивать через элемент. Делаем i--
            }
        }
        System.out.println(list);

    }
}
    
