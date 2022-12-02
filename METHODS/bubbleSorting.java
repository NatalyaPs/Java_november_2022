package METHODS;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// import java.util.Random;
// import java.util.Scanner;

public class bubbleSorting {
    public static int[] bubbleSort (int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }  
        return a;
    }

public static void main (String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Укажите длину массива: ");
        int n = scanner.nextInt();

        int[] array = new Random().ints(n, 1, 100).toArray(); 
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }  
        System.out.println("Отсортированный массив: ");
        System.out.println(Arrays.toString(array));
        // return (Arrays.toString(array));
        scanner.close();
    }    
}

