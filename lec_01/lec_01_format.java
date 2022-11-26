package lec_01;

public class lec_01_format {
    public static void main(String[] args) {
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
        // --------------
        // %d: целочисленных значений
        // %x: для вывода шестнадцатеричных чисел
        // %f: для вывода чисел с плавающей точкой
        // %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
        // %c: для вывода одиночного символа
        // %s: для вывода строковых значений

        // количество знаков после запятой
        float pi = 3.1415f;
        System.out.printf("%f\n", pi);    // 3,141500
        System.out.printf("%.2f\n", pi);  // 3,14
        System.out.printf("%.3f\n", pi);  // 3,141
        System.out.printf("%e\n", pi);    // 3,141500e+00
        System.out.printf("%.2e\n", pi);  // 3,14e+00
        System.out.printf("%.3e\n", pi);  // 3,141e+00
    }
}
