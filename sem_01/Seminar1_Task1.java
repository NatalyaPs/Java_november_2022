package sem_01;

import java.util.Scanner;

/*
Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 */
public class Seminar1_Task1 {
    public static void main(String[] args) {
        String name = scannerText();
        System.out.println("Привет, " + name + "!");
    }
    public static String scannerText() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Представьтесь пожалуйста: ");
        String word = iScanner.nextLine();
        iScanner.close();
        return word;
    }
}
