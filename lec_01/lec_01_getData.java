package lec_01;    
import java.util.Scanner;

public class lec_01_getData {
    public static void main(String[] args) {
        //  ПОЛУЧЕНИЕ ДАННЫХ ИЗ ТЕРМИНАЛА
        // ================================================
        
        // сначала вверху импортируем import java.util.Scanner;

        Scanner iScanner = new Scanner(System.in, "cp866"); // тип  имя_переменной = создаем новый объект класса сканер (поток входящих данных-System.in) . //Объект Scanner для того, ч.б. выявлять кусочки из массы введенной строки(слово, число)
        System.out.printf("Как вас зовут? : ");
        String name = iScanner.nextLine(); // переменная-строка имя-name = наш сканнер.метод для ввода строки, пока не нажмется enter (через точку выбираем тип данных, которые ждем от пользователя). Т.о. сохраняем в переменную name введенные данные от пользователя
        System.out.printf("Привет, %s!", name); // или так ("привет, " + name + "!")
        //iScanner.close();

        System.out.println();

        //Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner.nextInt();
        //double x1 = x1;
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);  
        //iScanner.close();

        System.out.println();

        //Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: "); // проверка на то, что пользователь вводит целое число
        boolean flag = iScanner.hasNextInt(); // has - значит "если возможно считать введенное число..."
        System.out.println(flag);       
        int iе = iScanner.nextInt();
        System.out.println(iе);       
        iScanner.close();
        
    }
    
}