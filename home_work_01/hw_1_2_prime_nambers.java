// Вывести все простые числа от 1 до 1000

package home_work_01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.stream.IntStream;
import java.util.Scanner;


public class hw_1_2_prime_nambers {
    public static void main(String[] args) {
        // решето Эратосфена
        // отделяем все четные числа, затем все числа, делящиеся на 3, если они еще не выбыли, затем на 5, 7 и т.д.
        // повторяем до тех ор пока не дойдем до корня квадратного max числа нашего диапазона (если 1000, то до 33)
        // 1 не является простым числом => берем от 2 до max (1000)
        
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Наберите число n, мы покажем все простые числа до n => ");
        int n = iScanner.nextInt();
        iScanner.close();
        System.out.println(primesNambersEratosfen(n));
    }
        
    public static List<Integer> primesNambersEratosfen(int n) {
        boolean[] primesNam = new boolean[n];  // массив булевского типа
        Arrays.fill(primesNam, true);  // заполн.массив значением true

        for (int i = 2; i * i < n; i++){ // идем от 2 (т.к. 1 не явл.простым) до корня квадратного 
            if (primesNam[i]) {  // если число простое (true)
                for (int j = 2 * i; j < n; j += i) { // проходим и выбираем числа, кратные простому
                    primesNam[j] = false; // меняем их значение на false
                }
            }
        }
        ArrayList<Integer> primes = new ArrayList<>(); // заносим все простые числа(true) в отдельный список
        for (int i = 2; i < n; i++) {
            if (primesNam[i]) {
                primes.add(i);
            }
        }
        return(primes);
    }  
}   
        
        // int[] arr = IntStream.rangeClosed(1, 1000).toArray(); // создаем массив, заполненный числами (от ..., до ...)
        // System.out.println(Arrays.toString(arr));