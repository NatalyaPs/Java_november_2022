// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// (N × (N+1))/2

package home_work_01;
import java.util.Scanner;

public class hw_1_1_summ_factor {

    public static int summ (int n) {
        return (n * (n+1)) / 2;
    }

    public static int factor (int n) {
       if (n == 1) return 1;
       return n * factor(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Наберите число n, мы покажем сумму и произведение чисел от 1 до n");
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int n: ");
        int n = iScanner.nextInt();
        //System.out.printf("Сумма чисел от 1 до n = %d", (summ(n)));  
        System.out.printf("Сумма чисел от 1 до %d = %d", n, (summ(n)));  
        System.out.println();
        System.out.printf("Произведение чисел от 1 до %d = %d", n, (factor(n))); 
        iScanner.close();
        
    }
}
