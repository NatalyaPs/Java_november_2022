// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.

package sem_03;

import java.util.ArrayList;
import java.util.Random;

public class sem03_1_ {
    
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(1, 100));
        }

        for (int item : list) {
            System.out.print(item + " ");
        }
    }
}

public class seminar003 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(random.nextInt(1,100));
          
        }
    }


}



// Заполнить список десятью случайными числами. 

public class seminar003 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(1, 100));
        }

        for (int item : list) {
            System.out.print(item + " ");
        }
    }
}


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        List<String> list = new ArrayList<String>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            list.add(planets[random.nextInt(0, planets.length-1)]);
        }

        System.out.println(list);
    }
}

// часть кода Юрия М.
static Map<String, Integer> howManyStrings(List<String> list) {
    list.sort(null);

    Map<String, Integer> map = new HashMap<String, Integer>();

    int count = 1;
    for (int i = 1; i < list.size(); i++) {
        if (list.get(i).equals(list.get(i - 1))) {
            count++;
        } else {
            map.put(list.get(i-1), count);
            count = 1;
        }
    }

    map.put(list.get(list.size()-1), count);

    return map;
}



ArrayList list = new ArrayList ()


list.add ("fhdjsfsd");  // String
list.add (12312312);   // Integer
list.add ("fhdjsfsd");
list.add (12312312);
list.add ("fhdjsfsd");
list.add (12312312);
list.add ("fhdjsfsd");
list.add (12312312);

i--






int[][] array;

ArrayList<ArrayList<String>> list = new ArrayList<> ();

list.add (new ArrayList<String> ());
list.add (new ArrayList<String> ());
list.add (new ArrayList<String> ());
list.add (new ArrayList<String> ());
list.add (new ArrayList<String> ());

list.get (0).add ("Text");
