// Реализовать алгоритм сортировки слиянием.

package home_work_03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hw_3_1_merge_sort {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Укажите длину массива: ");
        int n = scanner.nextInt();

        int[] array = new Random().ints(n, 1, 100).toArray(); 
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(array));

        mergeSort(array, array.length);
        System.out.println("Отсортированный массив: ");
        System.out.println(Arrays.toString(array));
        // return (Arrays.toString(array));
        scanner.close();
    }

    // рекурсивно разбиваем массив напополам, потом половины напополам, потом.... 
    // соединяем массивы, сравнивая элементы "половинок"

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
    
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
    
        merge(a, l, r, mid, n - mid);
    }

    // соединяем левый и правый массивы, сравнивая первые эл-ты и записывая наименьший в массив а
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
 
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}