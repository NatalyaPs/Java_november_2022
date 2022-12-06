package METHODS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class mergeSort_2{


    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Укажите длину массива: ");
        int n = scanner.nextInt();

        int[] arr = new Random().ints(n, 1, 100).toArray(); 
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(arr));

        
        System.out.println("Отсортированный массив: ");
        System.out.println(Arrays.toString(arr));
        // return (Arrays.toString(array));
        scanner.close();
        
        // int arr[] = { 12, 11, 13, 5, 6, 7 };



 
        System.out.println("Given Array");
        printArray(arr);
 
        mergeSort_2 ob = new mergeSort_2();
        ob.sort(arr, 0, arr.length - 1);
 
        System.out.println("\nSorted array");
        printArray(arr);
    }

    
    public static void merge(int arr[], int l, int m, int r) 
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int left[] = new int[n1];
        int right[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            right[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    public static void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}