// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметичское этого списка.

package home_work_03;

import java.util.ArrayList;
// import java.util.Collections;
import java.util.Random;

public class hw_3_3_min_max_mean {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();  
        int n = 10; // количество элементов в списке

        for (int i = 0; i < n; i++) 
        {
            list.add(random.nextInt(1, 11)); // 1-10
        }
            
        System.out.println(list);

        // один из способов: в отсортированном спике взять 1й и крайний элемент
        // Collections.sort(list);  
        // System.out.println(list.get(0));
        // System.out.println(list.get(list.size() - 1));

        int min = list.get(0);
        int max = list.get(0);
        // int sum = 0;
        Integer sum = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < min) 
                min = list.get(i);
            if(list.get(i) > max) 
                max = list.get(i);
            sum += list.get(i);
        }
        
        double mean = sum.doubleValue()/n; //   или /list.size()
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + mean);
        // System.out.println(sum); // для проверки, легче считать ср.арифм.
    }
}