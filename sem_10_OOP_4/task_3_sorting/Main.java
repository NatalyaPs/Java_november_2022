/*Напишите обобщённую функцию сортировки. Она может отсортировать массив любого типа T. 
Любые ли типы можно сортировать? Какие ограничения надо наложить на тип T?

Отсортируйте несколько массивов разных типов с помощью этой функции. 
Можно ли отсортировать массив примитивных типов?
*/

package sem_10_OOP_4.task_3_sorting;

public class Main {
    
    public static void main(String[] args) {
        String[] arr = {"bbb", "aaa", "ddd", "eee", "ccc"};

        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();

        sortArray(arr);
        
        for (String str : arr) {
            System.out.print(str + " ");
        }
        
        // Class<?> C = String.class; // ответ на вопрос 2:12
    }

    private static <T extends Comparable<T>> void sortArray(T[] array) { // ограничение на обобщение: только те классы, к-е наследуются от Comparable / или только сравнимые типы можно
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {   // в произвольном типе <T> нет compareTo // compareTo возвращает -1 +1 0 // array[i] > array[j]
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}