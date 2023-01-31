/*Напишите самодельный обобщённый класс MyCollection, внутри которого спрятан массив. 
Используйте обобщения, чтобы класс мог хранить данные произвольного типа, 
например, MyCollection<Integer> или MyCollection<String>. Обязательные операции, которые надо прописать:

a. get: достаёт элемент по указанному индексу
b. set: перезаписывает элемент по указанному индексу
c. size: сколько элементов в массиве?
d. toString

B. (Необязательная часть, если есть время). 
Пропишите операцию add, которая делает динамическое перевыделение массива и добавляет новый элемент в конец.
*/

package sem_10_OOP_4.task_2_my_collection;

public class Main {
    
    public static void main(String[] args) {
        CustomList<Integer> customList = new CustomList<>();
        customList.add(1);
        customList.add(2);
        customList.add(3);

        // customList.array = null;  // private Element[] array; если поле будет не приватным, то можно стереть коллекцию
        System.out.println(customList);
    }
}
