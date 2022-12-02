// 2. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package home_work_02;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class hw_2_2_sort_log {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Укажите длину массива: ");
        int n = scanner.nextInt();

        int[] array = new Random().ints(n, 1, 100).toArray(); 
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(array));
         
        System.out.println("Отсортированный массив: ");
        System.out.println(Arrays.toString(bubbleSorting(array)));
        scanner.close();
    }
    
    
    public static int[] bubbleSorting (int[] a)throws Exception  {
        
        String string;
        FileWriter fw = new FileWriter("hw_2_2_log.txt");
        String timeStamp = new SimpleDateFormat("dd.MM.yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                    string = Arrays.toString(a);
                    fw.write(timeStamp);;
                    fw.write(string);            
                    fw.append('\n');
                    fw.flush();
                }
            }
        }  
        fw.close();
        return a;
    }
}