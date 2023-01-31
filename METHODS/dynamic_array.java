// исходник = семинар 10, задание 2, файл CustomList
// обобщенные типы

package METHODS;

public class dynamic_array {
public static void main(String[] args) {
    
}
    // int capacity = 10; // capacity - вместимость
    // int size = 0;
    // T[] array;

    // public void add (T element) {   // динамический массив с перевыделением никогда не будет false. Было так: public boolean add (T element)
    //     if (size < capacity) {     // если в массиве есть свободное место для добавления элементов
    //         array[size] = element;
    //         size++;
    //         return;
    //     }
    //     else {      // если место в массиве закончилось
    //         capacity = capacity * 2;
    //         T[] tempArray = (T[]) new Object[capacity];  // создаем новый массив в 2 раза больше. Но тип Т не дает сделать => делаем массив обжектов и приводим к типу Т
    //                                             // т.к. в java все обобщенные массивы в момент компиляции стираются и превращаются в обжекты  !!!!!!!!!!
    //                                             // ------------------------------------------------------------------------------
    //     }  не дописано - перезаписать массив или поменять ссылки
    // }
}
// public String toString() {  // делаем, ч.б. не выводил null, если массив не заполнен полностью
//     StringBuilder sb = new StringBuilder();
//     for (int i = 0; i < size; i++) {
//         sb.append(array[i] + " ");
//     }
//     return sb.toString();
// }