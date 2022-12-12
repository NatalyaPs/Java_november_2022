// Реализовать консольное приложение, которое в цикле:
// 1.Принимает от пользователя строку вида text~num
// 2.Нужно разделить строку по ~, сохранить text в связный список на позицию num.
// 3.Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

// ВАРИАНТ РЕШЕНИЯ В 1 ЗАЛЕ.  ВТОРОЙ ВАРИАНТ ЛУЧШЕ

package sem_04;

import java.util.LinkedList;
import java.util.Scanner;

public class sem_4_1_text_num{
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner iScanner = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) { // (int i = 0; i < parts.length; i++) {  сделалали 5 для примера
            System.out.println("Введите текст в форме text~num: "); //num: выбираем индекс, куда вставляем (позиция num). Начинаем с 0 и дальше по порядку или указывая, ПЕРЕД каким элементом вставим новую строку
            String str = iScanner.nextLine();
            String[] parts = str.split("~"); // функцией сплит разбиваем строку на массив (text -> parts[0], num-> parts[1])
                        
            if(parts[0].equals("print")) {
                String removed = linkedList.remove(Integer.parseInt(parts[1])); // удаленный элемент кладем в переменную removed(удаленный) и показываем удаленный элемент, т.к. функция remove иначе его не покажет. Integer.parseInt(parts[1]) делаем потому, что функция remove как аргумент принимает число, а не строку
                System.out.println(removed); 
                System.out.println(linkedList);
            }
            else{
                linkedList.add(Integer.parseInt(parts[1]), parts[0]); // в add перегрузка (int, string), поэтому мы переводим parts[1] из строки в число, чтобы на указанную позицию(parts[1]) записать нужный текст
                System.out.println(linkedList);
            }
        }
        iScanner.close();
    }
    
    // вывод массива на консоль в одну строку
    public static void arrayPrintLine(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
