// Реализовать консольное приложение, которое:
// 1.Принимает от пользователя и “запоминает” строки.
// 2.Если введено print, выводит строки в обратном порядке (первая введённая окажется последней выведенной).
// 3.Если введено revert, удаляет предыдущую введенную строку из памяти (т.е. последнюю).
// ВТОРОЙ ВАРИАНТ - Алексей

package sem_04;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.DebugGraphics;

import METHODS.scanner;

public class sem_4_2_string_revers_revert_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        Deque<String> deque = new LinkedList<>(); // можно использовать ArrayDeque() - амортизирует данные,поэтому скорость исполнения алгоритма О(N)

        while (true) {
            System.out.println("Введите текст: ");
            String input = scanner.nextLine();

            if (input.equals("quit")){
                break;
            }
            else if (input.equals("print")){ // сразу разворачивается, т.к. вносим новый элемент всегда впереди предыдущего. Получился стэк задом наперед
                System.out.println(deque);
            }
            else if (input.equals("revert")){
                System.out.println(deque.pollFirst()); // вставляем элемент в начало, поэтому сразу разворачивается
            }
            else {
                deque.addFirst(input);
            }
            System.out.println(deque);
        }
        scanner.close();
    }
}
