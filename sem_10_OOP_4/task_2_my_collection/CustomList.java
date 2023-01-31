// обобщенная коллекция

package sem_10_OOP_4.task_2_my_collection;

import java.util.Arrays;

public class CustomList<Element> {
    private Element[] array;
    // private int capacity = 10; // capacity - вместимость
    private int size = 0;  // изначалоно рамер = 0  - похоже на днамич.массив, только с 3 переменными: см 3 поля/  1 час 28 мин на семинаре
                            // size = size, a capacity - это общая (запланированная) длина и не всегда == size.  Массив моет быть заполнен частично - динамический массив

    // public CustomList(T[] array) {  // конструктор принимает array
    //     this.array = array;
    // }
    
    public CustomList() { 
        array = (Element[]) new Object[10];    // инициализация массива c кол-вом эл 10 (вместо поля capacity 1:54 на семинаре)
    }

    // public CustomList(T[] array, int capacity) {
    //     this.array = array;
    //     this.capacity = capacity; }

    public void add (Element element) {   // динамический массив с перевыделением никогда не будет false. Было так: public boolean add (T element)
        if (size < array.length) {     // если в массиве есть свободное место для добавления элементов
            array[size] = element;
            size++;
            return;
        }
        // если место в массиве закончилось
        // capacity = capacity * 2;
        array = Arrays.copyOf(array, array.length * 2);
        // T[] tempArray = (T[]) new Object[capacity];  // создаем новый массив в 2 раза больше. Но тип Т не дает сделать => делаем массив обжектов и приводим к типу Т
                                                // т.к. в java все обобщенные массивы в момент компиляции стираются и превращаются в обжекты  !!!!!!!!!!
                                                // ------------------------------------------------------------------------------
        // System.arraycopy(array, 0, tempArray, 0, capacity);    // перекомпилируем старые данные в новый массив
        // array = (T[]) new Object[capacity];
        // System.arraycopy(tempArray, 0, array, 0, capacity);
    }

    public Element get(int index) { 
        return array[index];
    }

    public void set(Element element, int index) { 
        array[index] = element;
    }

    public int size() { 
        return size; // главное не перепутать сайз со скобками и без. Иначе - рекурсия !!!
    }

    public boolean isEmpty() { 
        return size == 0;
        // return array.length != 0;
    }

    @Override
    public String toString() {  // делаем, ч.б. не выводил null, если массив не заполнен полностью
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(array[i] + " ");
        }
        return sb.toString();
    }

    

}
