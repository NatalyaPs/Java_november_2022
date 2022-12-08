/*Задание №4
Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что на 0-й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.
  проза          поэзия       док
Война и мир Бородино ……
12 стульев      ,,,,,              ……
*/

package sem_03;

import java.util.ArrayList;
import java.util.Scanner;

public class sem03_4_list_arrayList_string {
    // List<ArrayList<String>> это массив массивов строк. Двумерный массив. Эррэй лист эррэй листов ))
    public static void main(String[] args) {
      ArrayList<ArrayList<String>> list = new ArrayList<>();

      // лучше заполнять циклом for: 3 раза добавить по 1 штуке. Это удобнее, т.к. можно потом добавлять любое кол-во раз n
      list.add(new ArrayList<String>());
      list.add(new ArrayList<String>());
      list.add(new ArrayList<String>());

      // list.get(0).add("Проза");
      // list.get(1).add("Поэзия");
      // list.get(2).add("Документальное");

      //list.get(i).get(j) - обратиться, достать из массива строку, а из строки достать элемент
      // =========================================================
      
      Scanner sc = new Scanner(System.in);
      
      //в цикле сначала идем по столбцамам. Заполняем название массивов в массиве, ЖАНР
      for (int i = 0; i < list.size(); i++) {
        System.out.println("Введите название жанра: ");
        list.get(i).add(sc.nextLine());

        // идем по строкам - заполняем элементы вложенных массивов, КНИГА
        for (int j = 0; j < 3; j++) { // для упрощения взяли название 3 книг 
          System.out.println("Введите название книги: ");
          list.get(j).add(sc.nextLine()); // или j ???  -> list.get(j).add(sc.nextLine());   // на семинаре i - это ошибка?
        }
      }
      sc.close();
      System.out.println(list);
    }
    
}
