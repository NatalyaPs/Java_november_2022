// Заполнить список с десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.

package sem_03;

import java.util.ArrayList;
import java.util.Comparator;
// import java.util.HashMap;
import java.util.List;
// import java.util.Map;
import java.util.Random;

public class sem03_1_list_sort_corparator {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();  
        
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(101) - 50; // диапазон от -50 до 50
            System.out.println(num);
            list.add(num);
        }
        
        // поскольку у нас не массив, а list, используем sort().Он просит компаратор. Можно не делать файл с классом, а создать здесь: new Compara... через анонимный...
        
        IntegerComparator ic = new IntegerComparator(); // создали класс интеджер компаратор в отдельном файле
        list.sort(ic); // для sort() используем класс компаратор, который создали в отдельном файле
        //list.sort(new Comparator); // как-то создают еще как одноразовую функцию.

        System.out.println(list); // toString не обязателтно. Java сама выводит список как надо, т.к.в list уже есть toString
        
        // если надо по убыванию, то сделаь антикорпоратор (см файл компаратора. Поменять местами О1 и О2)
    }
}
    








//     public static void main(String[] args) {
//         Random random = new Random();
//         ArrayList<Integer> list = new ArrayList<Integer>();   // или так  ArrayList list = new ArrayList<>();
//         for (int i = 0; i < 10; i++) 
//         {
//             list.add(random.nextInt(1, 100));
//         }

//         for (int item : list) 
//         {
//             System.out.print(item + " ");
//         }
//     }


// // import java.util.ArrayList;
// // import java.util.List;
// // import java.util.Random;

// //public class Task2 {
//     public static void main4(String[] args) {
//         String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

//         List<String> list = new ArrayList<String>();
//         Random random = new Random();

//         for (int i = 0; i < 100; i++) 
//         {
//             list.add(planets[random.nextInt(0, planets.length-1)]);
//         }

//         System.out.println(list);
//     }


// // часть кода Юрия М.

//     static Map<String, Integer> howManyStrings(List<String> list) {
//         list.sort(null);

//         Map<String, Integer> map = new HashMap<String, Integer>();

//         int count = 1;
//         for (int i = 1; i < list.size(); i++) {
//             if (list.get(i).equals(list.get(i - 1))) {
//                 count++;
//             } else {
//                 map.put(list.get(i-1), count);
//                 count = 1;
//             }
//         }

//         map.put(list.get(list.size()-1), count);

//         return map;
//     }



//     ArrayList list1 = new ArrayList ();


//     // list1.add ("fhdjsfsd");  // String
//     // list1.add (12312312);   // Integer
//     // list1.add ("fhdjsfsd");
//     // list1.add (12312312);
//     // list1.add ("fhdjsfsd");
//     // list1.add (12312312);
//     // list1.add ("fhdjsfsd");
//     // list1.add (12312312);

//     //i--


//     int[][] array;

//     ArrayList<ArrayList<String>> list = new ArrayList<> ();

//     public ArrayList getList1() {
//         return list1;
//     }



//     public void setList1(ArrayList list1) {
//         this.list1 = list1;
//     }



//     public int[][] getArray() {
//         return array;
//     }



//     public void setArray(int[][] array) {
//         this.array = array;
//     }



//     public ArrayList<ArrayList<String>> getList() {
//         return list;
//     }



//     public void setList(ArrayList<ArrayList<String>> list) {
//         this.list = list;
//     }

//     // list2.add (new ArrayList<String> ());
//     // list2.add (new ArrayList<String> ());
//     // list2.add (new ArrayList<String> ());
//     // list2.add (new ArrayList<String> ());
//     // lis2t.add (new ArrayList<String> ());

// // list2.get (0).add ("Text");
// }