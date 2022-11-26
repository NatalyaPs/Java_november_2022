package lec_01;

public class lec_01_array {
    public static void main(String[] args) {
        // МАССИВЫ 
        // =======================================
        // одномерные
        int[] arr = new int[10]; 
        System.out.println(arr.length); // 10
        System.out.println(arr[3]); // 0
        arr[3] = 12; 
        System.out.println(arr[3]); // 12

        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5

        // многомерные
        int[] arr1[] = new int[3][5];  // или так: int [][] arr = new int[3][5];
        for (int[] line : arr1) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }

        System.out.println();
        // или такой цикл:
        int [][] arr2 = new int[3][5];
        for (int k = 0; k < arr2.length; k++) {
            for (int l = 0; l < arr2[k].length; l++) {
                System.out.printf("%d ", arr2[k][l]);
            }
            System.out.println();
        }
    }
}
