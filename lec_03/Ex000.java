package lec_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex000 {
   public static void main(String[] args) {
     
      Object o = 1; GetType(o);    // java.lang.Integer      
      o = 1.2; GetType(o);         // java.lang.Double
   }

   static void GetType(Object obj) {
      System.out.println(obj.getClass().getName());
   }
  
   public static void main1(String[] args) {
      System.out.println(Sum(1, 2));
      System.out.println(Sum(1.0, 2));
      System.out.println(Sum(1, 2.0));
      System.out.println(Sum(1.2, 2.1));
  }
// чтобы можно было складывать разные типы чисел, то в метод передадим string
//   static int Sum(int a, int b) { ...
//   }
//   static double Sum(double a, double b) { ...
//   }
//    static String Sum(String a, String b) {       // метод сумма со строками !!! с object!
//   }

  static Object Sum(Object a, Object b) {       ///   с object! !!!!!!!!!!!!!!!!!!!

   if (a instanceof Double && b instanceof Double) {
       return  (Object)((Double) a + (Double) b);
   } else if(a instanceof Integer && b instanceof Integer) {
       return (Object)((Integer) a + (Integer) b);
   } else return 0;
}

// Массивы. Проблемы при использовании
//=======================================

// Проблема. Изменение размера массива. 
// Есть массив из 2 элементов

public static void main2(String[] args) {
   int[] a = new int[] { 1, 9 };
   int[] b = new int[3]; // создаем новый массив на 1 элемент больше
   System.arraycopy(a, 0, b, 0, a.length); // копируем из а с нулевого эл-та в b c нулевого эл-та и длина текущего массива

   for (int i : a) { System.out.printf("%d ", i);}   // 1 9

   for (int j : b) { System.out.printf("%d ", j);}     // 0 9 0 0 0 0 0 0 0 0
} 

// добавление элемента через отдельный метод:
//======================================
public class Ex01_object {
   static int[] AddItem(int[] array, int item) {
       int length = array.length;
       int[] temp = new int[length + 1];
       System.arraycopy(array, 0, temp, 0, length);
       temp[length] = item; // добавляем новый элемент в хвост массива
       return temp;
   }
   public static void main3(String[] args) {
       int[] a = new int[] { 0, 9 };
       for (int i : a) { System.out.printf("%d ", i); }
       a = AddItem(a, 2);
       a = AddItem(a, 3);
       for (int j : a) { System.out.printf("%d ", j); }
   }
}

// 4. Коллекции
//==========================================
// Иерархия коллекций.   ArrayList
// «Удобный массив»

ArrayList list = new ArrayList();

ArrayList<Integer> list1 = new ArrayList<Integer>();
ArrayList<Integer> list2 = new ArrayList<>();
ArrayList<Integer> list3 = new ArrayList<>(10);
ArrayList<Integer> list4 = new ArrayList<>(list3);


// List
// List – пронумерованный набор элементов.

// import java.util.ArrayList;
// import java.util.List;
// public class Ex002_ArrayList {

   public static void main4(String[] args) {
       //List list = new ArrayList(); // неявное преобразование, т.к. сразу не указали тип. Тогда при
                                    //извлечении надо будет делать преобразование
       
       // тогда делаем так: добавляем угловые скобки <> - это обобщения
       ArrayList<Integer> list = new ArrayList<Integer>();
       list.add(2809);
      // list.add("string line");
       for (Object o : list) {
           System.out.println(o);
           // Проблема извлечения данных
       }
   }
   // import java.util.ArrayList;
   // import java.util.List;
   // public class Ex002_ArrayList {

      public static void main5(String[] args) {
         List<Integer> list = new ArrayList<Integer>();
         list.add(1);
         list.add(123);
         // list.add("string line");
         for (Object o : list) {
             System.out.println(o);
             // Проблема извлечения данных
             // row type java
         }
      }


      //Коллекции. Функционал
      //=============================================
      // add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
      // get(pos) – возвращает элемент из списка по указанной позиции
      // indexOf(item) – первое вхождение или -1
      // lastIndexOf(item) – последнее вхождение или -1
      // remove(pos) – удаление элемента на указанной позиции и его возвращение
      // set(int pos, T item) – gjvtoftn значение item элементу, который находится на позиции pos
      // void sort(Comparator) – сортирует набор данных по правилу
      // subList(int start, int end) – получение набора данных от позиции start до end
      // clear() – очистка списка
      // toString() – «конвертация» списка в строку
      // Arrays.asList – преобразует массив в список
      // containsAll(col) – проверяет включение всех элементов из col
      // removeAll(col) – удаляет элементы, имеющиеся в col
      // retainAll(col) – оставляет элементы, имеющиеся в col
      // toArray() – конвертация списка в массив Object’ов
      // toArray(type array) – конвертация списка в массив type
      // List.copyOf(col) – возвращает копию списка на основе имеющегося
      // List.of(item1, item2,...) – возвращает неизменяемый список


      // Ссылочные типы в коллекции. Что может пойти не так?
      // =============================================================

      // import java.util.Arrays;
      // import java.util.List;
      // public class Ex004_ArraysMethod {
         public static void main6(String[] args) {
            int day = 29;
            int month = 9;
            int year = 1990;
            Integer[] date = { day, month, year }; // объявляем массив целых чисел
            List<Integer> d = Arrays.asList(date); // на основе массива формируем коллекцию и можем работать спокойно
            System.out.println(d); // [29, 9, 1990]
   }
   //Но ! Если вместо примитивных типов, даже через классы-обертки,  
   //мы начнем использовать более сложные типы:
   // Например, наполнять StringBuilder строковыми значениями:

   // import java.util.Arrays;
   // import java.util.List;
   // public class Ex005_ArraysMethod {
      /**
       * @param args
       */
      public static void main7(String[] args) {
          StringBuilder day = new StringBuilder("28");
          StringBuilder month = new StringBuilder("9");
          StringBuilder year = new StringBuilder("1990");
          StringBuilder[] date = { day, month, year };// массив СтрингБилдеров
          List<StringBuilder> d = Arrays.asList(date); // на основе массива формируем коллекцию
          System.out.println(d);  // [29, 9, 1990]
          date[1] = new StringBuilder("09"); // меняем значение в МАССИВЕ !!!
          System.out.println(d); }  // [29, 09, 1990] // меняется значение и в КОЛЛЕКЦИИ !!!


//пример:  хотим создать list на основе функционала list.of:
// ------------------------------
   // import java.util.List;
   // public class Ex006_ListOf {
      public static void main8(String[] args) {
         Character value = null;
         List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');  // список символов
         System.out.println(list1); //['S', 'e', 'r', 'g', 'e', 'y']  ////////////       не знаю, почему ошибку показывает   ???????????????????
         // list1.remove(1); // java.lang.UnsupportedOperationException - ОШИБКА, Т.К. если создали при помощи List.of просто так удалть не получится
         List<Character> list2 = List.copyOf(list1);}


         // для удаления делаем по классике:
         public static void main9(String[] args) {   
         Character value = null;
         List<Character> list1 = new ArrayList<Character>();
         list1.add('S');
         list1.add('e');
         list1.add('r');
         System.out.println(list1); //[S, e, r]
         list1.remove(1); 
         System.out.println(list1); //[S, r]
            List<Character> list2 = List.copyOf(list1);}
   

   // ИТЕРАТОР
   //============================================

   // итератор испоьзуется, ч.б. разобрать объект

   // import java.util.*;
   // public class Ex007_Iterator {
      public static void main10(String[] args) {
         List<Integer> list = List.of(1, 12, 123, 1234, 12345); //коллекция
   
         for (int item : list) {  //list - итерируемый объект, item - наименоваие переменной для итерации конкретного эл-та коллекции
            System.out.println(item); // изменять здесь эл-ты нельзя
         }
         
         Iterator<Integer> col = list.iterator(); // можем получить на оcнове нашей коллекции в тип итератор от интеджера путем вызова метода  
   
          while (col.hasNext()) { // пока есть следующий эл-нт
              System.out.println(col.next()); // дай нам этот эл-т.  Изменять здесь НЕ НУЖНО!
              // col.next();  //  ошибка, т.к. 2 раза вызываем
              // col.remove();   //  ошибка, т.к. нельзя здесь удалять
     
          }
      }
   }
         //  Итератор.

         //  Получение итератора с целью более гибкой работы с данными (см URL)
          
         //  Интерфейс Iterator<E>. Итератор коллекций. Iterator занимает место Enumeration в Java Collection Framework. 
         //  Итераторы отличаются от перечислений двумя способами:
         //  Итераторы позволяют вызывающей стороне удалять элементы из базовой коллекции во время итерации с четко определенной семантикой.
          
         //  hasNext(), next(), remove() (remove в данном случае можно)
         //  ListIterator<E> можно пробежаться по объектам из начала в конец, потом вернуться к 3-му и т.п, есть добавление эл-тов и т.д.
         //  hasPrevious(), E previvous(), nexIndex(),previvousIndex(), set(E e), add (E e)
          





