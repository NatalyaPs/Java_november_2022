// 1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24. 
// 1.5. Создайте метод, в который передайте заполненный выше массив, и с помощью Set вычислите процент уникальных значений в данном массиве, и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

package sem_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class sem_6_1_set_percent_unicum {
    
    private static int[] fillArray (int capacity, int maxRange){   // Заполнить массив (вместимость, Максимальный диапазон)
        int[] array  = new int[capacity];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(maxRange);
        }
        return array;
    }
    
    private static float calcPercent (int[] array){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        int count = set.size();
        System.out.println(set); // для проверки какие там числа
        return count * 100.0f / array.length; // 100.0f - константа для получения числа float
        // return (float)count * 100 / array.Length;
    }
    
    public static void main(String[] args) {
        int[] array = fillArray(100, 25);  // для проверки 100 элементов
        System.out.println(Arrays.toString(array));

        float persent = calcPercent(array);
        System.out.println(persent);
    }
}
