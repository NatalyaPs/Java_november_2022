package lec_09_OOP_3.Ex005;

import java.util.Comparator;
                                // чтобы была возможность изменения критриев сортировки, 
                                // делаем отдельную компоненту (класс) для упорядочивания наших Работников
public class AgeComporator implements Comparator<Worker>{   

    @Override
    public int compare(Worker o1, Worker o2) {
        return Integer.compare(o1.age, o2.age);
    }
    
}