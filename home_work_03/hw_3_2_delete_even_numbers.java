// Пусть дан произвольный список целых чисел. 
// Удалить из него чётные числа.

package home_work_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class hw_3_2_delete_even_numbers {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();  

        for (int i = 0; i < 10; i++) 
        {
            list.add(random.nextInt(100)); // 1-99
            // list.add(random.nextInt(1, 100)); // 1-99
        }
            
        System.out.println(list);
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0){
                list.remove(i);
                i--; //  перешагиваем назад, т.к после удаения эл-та все эл-ты списка сдвигаются влево, а мы еще делаем след шаг в цикле(i++) вправо, поэтому надо вернуться назад, чтоб не перепрыгивать через элемент. Делаем i--
            }
        }

        System.out.println(list);
    }
}
