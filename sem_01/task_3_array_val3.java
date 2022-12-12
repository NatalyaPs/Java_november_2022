// Дан массив nums = [3,2,2,2] и число val = 3.  // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

package sem_01;

public class task_3_array_val3 {

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 3, 2, 2, 1, 3, 5, 2 };
        int val = 3;
        int reserv = 0;
        int count = 0;
        for (int i = 0; i < arr.length - count; i++) {
            if (arr[i] == val) {
                reserv = arr[arr.length - 1 - count];
                arr[arr.length - 1 - count] = val;
                arr[i] = reserv;
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
