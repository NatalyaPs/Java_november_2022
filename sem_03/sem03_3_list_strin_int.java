/*Задание №3
 * Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа. 
Пройти по списку, найти и удалить целые числа.
*/
package sem_03;

import java.util.ArrayList;

public class sem03_3_list_strin_int {
    public static void main(String[] args) {
        // new ArrayList<>(String) - нельзф, т.к разные  типы: int, string
        // так же, как и в прошлой задаче

        ArrayList list = new ArrayList<String>(); // <String> - по условию надо Стринг

        list.add("dhfgjd");
        list.add(1321);
        list.add("jdk");
        list.add("jfhg");
        list.add(555);
        list.add("dhfgkggkjd");
        list.add(134521);
        list.add("jd456k");
        list.add("jf458886hg");
        list.add(55875);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)instanceof Integer){  // instanceof - значит: "если является объектом класса" 
                list.remove(i);
                i--;  //  перешагиваем назад, т.к после удаения эл-та все эл-ты списка сдвигаются влево, а мы еще делаем след шаг в цикле(i++) вправо, поэтому надо вернуться назад, чтоб не перепрыгивать через элемент. Делаем i--
            }
        }
        
        System.out.println(list);
    }
}

