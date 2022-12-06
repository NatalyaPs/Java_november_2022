// сортировка слиянием

// https://urvanov.ru/2017/08/19/алгоритм-сортировки-слиянием-на-java/

package METHODS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class mergeSortingBEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Укажите длину массива: ");
        int n = scanner.nextInt();

        int[] array = new Random().ints(n, 1, 100).toArray(); 
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(array));

        int[] result = mergeSort(array);
        System.out.println("Отсортированный массив: ");
        System.out.println(Arrays.toString(result));
        // return (Arrays.toString(array));
        scanner.close();
    }

    public static int[] mergeSort(int[] array) {
        int[] buffer1 = Arrays.copyOf(array, array.length); // массив для сортировки
        int[] buffer2 = new int[array.length]; // буфер. Размер должен быть равен размеру buffer1
        int[] result = mergeSortInner(buffer1, buffer2, 0, array.length);
        return result;
    }

    // startIndex - начальный индекс в buffer1 для сортировки
    // endIndex - конечный индекс в buffer1 для сортировки
    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }
    
        // уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);
        
        // cлияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
// https://urvanov.ru/2017/08/19/алгоритм-сортировки-слиянием-на-java/