package METHODS;

public class all_methods {

    public static void main(String[] args) {

        // цикл форич
        // public static int array[] () {
        //     int arr[] = new int[10];
        //     for (int item : arr) {
        //     System.out.printf("%d ", item);
        //     }
        //     System.out.println();
        // }
        


        // char ch = '1';
        // System.out.println(Character.isDigit(ch)); // true
        // System.out.println(getType(ch));

        // String str = "qwerty";
        // System.out.println(str.charAt(1));



        // МАССИВЫ 
        // =======================================
        // одномерные
        int[] arr1 = new int[10]; 
        System.out.println(arr1.length); // 10
        System.out.println(arr1[3]); // 0
        arr1[3] = 12; 
        System.out.println(arr1[3]); // 12

        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5

        // многомерные. Цикл двумерный массив
        int[] arr2[] = new int[3][5];  // или так: int [][] arr = new int[3][5];
        for (int[] line : arr2) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }

        System.out.println();

        // или такой цикл двумерный массив:
        int [][] arr3 = new int[3][5];
        for (int k = 0; k < arr3.length; k++) {
            for (int l = 0; l < arr3[k].length; l++) {
                System.out.printf("%d ", arr3[k][l]);
            }
                System.out.println();
        }   

        // типизация (продолжение)
        static String getType(Object o){
            return o.getClass().getSimpleName();
        }


    }
    
}





    

    

        

    

    


