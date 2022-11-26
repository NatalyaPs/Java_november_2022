// Реализовать простой калькулятор

package home_work_01;
import java.util.Scanner;

public class hw_1_3_calculator {
    
    public static double sum (double a, double b) {
        return (a + b);
    }

    public static double difference (double a, double b) {
        return (a - b);
    }

    public static double multiplication (double a, double b) {
        return (a * b);
    }

    public static double dividing (double a, double b) {
        return (a / b);
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Первое число : ");
        double a = iScanner.nextDouble();
        System.out.printf("Второе число: ");
        double b = iScanner.nextDouble();
        System.out.printf("Арифметическое действие(+ - * /): ");
        char c = iScanner.next().charAt(0);

        if (c == '+') 
            System.out.printf("%f + %f = %f", a, b, (sum(a, b)));   // %2f почему-то не сработало для округления до 2 чисел после запятой?
        else if (c == '-') 
            System.out.printf("%f - %f = %f", a, b, (difference(a, b))); 
        else if (c == '*') 
            System.out.printf("%f * %f = %f", a, b, (multiplication(a, b))); 
        else if (c == '/') 
            System.out.printf("%f / %f = %f", a, b, (dividing(a, b)));

        iScanner.close();
    }
}
