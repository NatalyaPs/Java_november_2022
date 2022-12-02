package lec_01;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

/**
 * sem_01_
 */
public class lec_01_ { // class набрать
    public static void main(String[] args) { // main набрать
        System.out.println("Hi");
        System.out.println("sysout");  // sysout набрать -> выведет эту строку полностью

        String s = "afjahfjsvsjsd";
        System.out.println(s);  // если не положили значение, то при выводе будет ошибка. Тогда положить null

        int num = 1221112;
        System.out.println(num);

        double pi = 3.14;
        System.out.println(pi);

        float pik = 31.5f;  // добавить к числу f, если float
        System.out.println(pik);

        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false

        int a = 12;
        int b = a; // преобразование из 4 байт в 8 без проблем, но наоборот - с преобразователем
        System.out.println(b);

        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false

        boolean f1 = true && false;  // false
        boolean f2 = true || false; // true
        boolean f3 = true ^ true; // false, т.к.истина только если одно значение истина
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        // строки (1 символ = 2 байта)
        String msg = "Строка";
        System.out.println(msg); // Cтрока

        // неявная типизация + внизу еще метод для определения к какоу классу относится
        var i = 123;
        System.out.println(i); // 123
        System.out.println(getType(i)); // Integer
        var j = 123.456;
        System.out.println(j); // 123.456 
        System.out.println(getType(j)); // Double
        j = 1022;
        System.out.println(j);  // 1022
        //j = "mistake";
        //error: incompatible types:
        //String cannot be converted to double
    
        // static String getType(Object o){
        //     return o.getClass().getSimpleName();    // этот метод внизу после метода main
        

        
        // КЛАССЫ- ОБЁРТКИ 
        // ============================
        // int - Integer
        // short - Short
        // char - Character  и т.д.
        int ff = 123_255_258; // можно писать число через нижнее подчеркивание для удобства
        System.out.println(Integer.MAX_VALUE); // т.е методы с большой буквы и через точку - Integer
        // через точку обращаемся к членам (примитивам) того класса, с которым работаем
        char bb = '*';
        System.out.println(Character.isDigit(bb));
        String str = "qwerty";
        System.out.println(str.charAt(1));


        // операции Java
        // ========================================================
        // присванивание =, арифметические+,-,/,*,%,++,--, логические>,<,==,!=,>=,<=
        // логические ||, &&, ^, !
        // побитовые <<, >>, &, |, ^
        String q = "qwer1";  // длина 4 , последн.символ 1
        boolean v = q.length() >= 5 || q.charAt(4) == '1'; // БЫСТРЫЕ по аналогии &&, ^
        // boolean v = q.length() >= 5 | q.charAt(4) == '1'; // ПОБИТОВЫЕ по аналогии &
        System.out.println((v));


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


        // ПРЕОБРАЗОВАНИЯ
        //========================================
        int ii = 123; double d = ii;
        System.out.println(ii);  // 123
        System.out.println(d);  // 123.0

        d = 3.1415; ii = (int)d;
        System.out.println(d);  // 3.1415
        System.out.println(ii);  // 3

        d = 3.9415; ii = (int)d;
        System.out.println(d);  // 3.9415
        System.out.println(ii);  // 3

        byte c = Byte.parseByte("123");
        System.out.println(c);  // 123
        //c = Byte.parseByte("1234");
        //System.out.println(c);  // NumberFormatException: Value out of range

        // НО :
        int[] am = new int[10];
        //double[] dm = am;   // ошибка => ИЗУЧАЕМ ковариантность и контравариантность
        // массив целых чисел нельзя положить просто в массив веществ.чисел. Можно сложно сделать


        //  ПОЛУЧЕНИЕ ДАННЫХ ИЗ ТЕРМИНАЛА
        // ================================================
        
        // сначала вверху импортируем import java.util.Scanner;

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        //iScanner.close();

        System.out.println();

        //Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int x1 = iScanner.nextInt();
        double x = x1;
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        //System.out.printf("%d + %f = %f", x, y, x + y);  // разобраться
        //iScanner.close();

        System.out.println();

        //Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: "); // проверка на то, что пользователь вводит целое число
        boolean flag = iScanner.hasNextInt(); // has - значит "если возможно считать введенное число..."
        System.out.println(flag);       
        int iе = iScanner.nextInt();
        System.out.println(iе);       
        iScanner.close();


        // ФОРМАТИРОВАННЫЙ ВЫВОД:
        // =================================

        int an = 1, bn = 2;
        int cn = an + bn;
        // так:
        String res = an + " + " + bn + " = " + cn;
        System.out.println(res);
        // ИЛИ так:
        String res1 = String.format("%d + %d = %d \n", an, bn, cn); // .format
        System.out.printf("%d + %d = %d \n", an, bn, cn); //.printf
        System.out.println(res1);

        // String st = "qwe";
        // int aw = 123;
        // String gw = st + aw;
        // System.out.println(gw); // !!! ТАК НЕ ДЕЛАТЬ !!! ПОЛУЧАЕМ 4 СТРОКИ!!!

        // Виды спецификаторов
        // -------------------------------------------------
        // %d: целочисленных значений
        // %x: для вывода шестнадцатеричных чисел
        // %f: для вывода чисел с плавающей точкой
        // %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
        // %c: для вывода одиночного символа
        // %s: для вывода строковых значений

        // количество знаков после запятой
        // ---------------------------------
        float ppi = 3.1415f;
        System.out.printf("%f\n", pi);    // 3,141500
        System.out.printf("%.2f\n", pi);  // 3,14
        System.out.printf("%.3f\n", pi);  // 3,141
        System.out.printf("%e\n", pi);    // 3,141500e+00
        System.out.printf("%.2e\n", pi);  // 3,14e+00
        System.out.printf("%.3e\n", pi);  // 3,141e+00


        // Область видимости переменных
        // ===============================
        // {
        //     int iii = 123;
        //     System.out.println(i);           
        // }     
        // System.out.println(iii);  // error: cannot find symbol
 
    }

    // типизация (продолжение)
    static String getType(Object o){
            return o.getClass().getSimpleName();
        }



    // ФУНКЦИИ И МЕТОДЫ (технически одно и то же)Функции могут не принадлежать классам, а методы принадлежат. 
    // ================================================================
    // В java все функции являются методами. 
    // обязательно slass и static

    static void sayHi() {
        System.out.println("hi!");
    }
    static int sum(int az, int bz) {
        return az+bz;
    }  
    static double factor(int nz) {
        if(nz==1)return 1;
        return nz * factor(nz-1);
    }
    // public static void main(String[] args) {   // конфликтует с верхней функцией main
    //     sayHi(); // hi!
    //     System.out.println(sum(1, 3)); // 4
    //     System.out.println(factor(5)); // 120.0
    // например можем создать новый файл-класс lib.java, сделать там метод sayHi и вывести сюда:
    //      lib.sayHi();



    // управляющие конструкции:
    //========================================
    // условный оператор:
    public static void max (String[] args) { // в лекции не max, a main
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);
    }
    // ИЛИ:
    public static void max1 (String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        if (a > b) c = a;
        if (b > a) c = b;

        System.out.println(c);
    }
    // или: тернарный оператор
    public static void min(String[] args) {
        int a = 1;
        int b = 2;
        int min = a < b ? a : b; // если условие(a<b) выполняется, то вернется значение между ? и :, если нет-вернется другое значение. НО! обязательно что-то вернется
        System.out.println(min);
    }
    
    // оператор выбора:

    // import java.util.Scanner;
    // public class Program {
        public static void text (String[] args) {
            int mounth = 1; //value;
            String text = "";
            switch (mounth) {
                case 1:
                    text = "Autumn";
                    break;
            // switch (mounth) {
            //         case 2:
            //             text = "summer";
            //             break;
            //     default:
            //         text = "mistake";
            //         break;
            }
            System.out.println(text);
            //iScanner.close();
        }
    //}

        // ЦИКЛЫ 
        //======================================

        // while:

        //public class Program {
            public static void discharge(String[] args) {
                int value = 321;
                int count = 0;
        
                while (value != 0) {
                    value /= 10;
                    count++;
                }
                System.out.println(count);
            }
        //}

        // do while:

    //public class Program {
        public static void discharg1(String[] args) {
            int value = 321;
            int count = 0;
        
            do {
                value /= 10;
                count++;
            } while (value != 0);
            System.out.println(count);
        }
    //}

    // операторы continue (пропустить и перейти к след.), break (прервать)
        public static void parity(String[] args) {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0)
                    continue;
                System.out.println(i);
            }
        }
            
    // public static void br (String[] args) { // разные варианты break
    //     for (int i = 0; i < 10; i++) {
    //         break;
    //         for (int j = 0; j < 5; j++) {
    //             break;
    //         }
    //         break;
    //         }
    //     }

    // цикл for:
    public static void summ (String[] args) {
        int s = 0;
        for (int i = 1; i <= 10; i++) {  
            s += i;         
        }
        System.out.println(s);  
    }

    // вложенные циклы:
    //public class Program {
        public static void mass(String[] args) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            // * * * * *
            // * * * * *
            // * * * * *
            // * * * * *
            // * * * * *
        }

    // for:  работает только для коллекций

    //public class Program {
        public static void ma_item(String[] args) {
    
            int arr[] = new int[10];
            for (int item : arr) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
    //}

    // РАБОТА С ФАЙЛАМИ
    // ============================
// СОЗДАНИЕ И ЗАПИСЬ/ДОЗАПИСЬ
//--------------------------
// import java.io.FileWriter;
// import java.io.IOException;
// public class Program {
    public static void main_fale(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    } //}


    // ЧТЕНИЕ,  ВАРИАНТ ПОСИМВОЛЬНО
    //-----------------------------------

    // import java.io.*;
    // public class Program {
    public static void main_SIMBOL(String[] args) throws Exception {
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
    } //}

    // ЧТЕНИЕ,  ВАРИАНТ ПОСТРОЧНО
    //-----------------------------------
    // import java.io.*;
    // public class Program {
        public static void main_st(String[] args) throws Exception 
        {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.printf("== %s ==\n", str);
            }
            br.close(); 
        }
}

// Задачи для самоконтроля


        // Задана натуральная степень k. Сформировать случайным образом список коэффициентов (значения от 0 до 100) многочлена многочлен степени k. 
        // *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
        
        // Даны два файла, в каждом из которых находится запись многочлена. Сформировать файл содержащий сумму многочленов.
        