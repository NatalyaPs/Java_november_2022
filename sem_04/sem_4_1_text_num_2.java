// Реализовать консольное приложение, которое в цикле:
// 1.Принимает от пользователя строку вида text~num
// 2.Нужно разделить строку по ~, сохранить text в связный список на позицию num.
// 3.Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

// ВАРИАНТ РЕШЕНИЯ АЛЕКСЕЯ - ЛУЧШЕ, ЧЕМ В ОСНОВНОМ ЗАЛЕ, Т.К. WHILE ВВОД ДО КОДОВОГО СЛОВА И ДОП.ПРОВЕРКИ !!!


package sem_04;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class sem_4_1_text_num_2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        while (true) {
            System.out.println("enter text: ");
            String input = scanner.nextLine(); // ввод даннных пользователя

            String[] textAndNum = input.split("~"); // разделяем строку по указанному разделителю в методе split
            if (textAndNum[0].equals("quit")){ // сло во для завершения программы
                System.out.println(list);
                break;
            }
            
            if (textAndNum.length < 2) { // проверка на некорректно введенное значение
                System.out.println("incorrect input");
                continue; // возвращаем опять ко вводу
                    // throw new IllegalStateException("incorrect input");
            }
            int i = Integer.parseInt(textAndNum[1]);

            if (textAndNum[0].equals("print")) {
                System.out.println(list.get(i));
                list.remove(i);
                continue;
            }

            list.add(i, textAndNum[0]);
            System.out.println(list);
        }
        scanner.close();
    }
}
