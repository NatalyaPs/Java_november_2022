// Реализовать консольное приложение, которое:
// 1.Принимает от пользователя и “запоминает” строки.
// 2.Если введено print, выводит строки в обратном порядке (первая введённая окажется последней выведенной).
// 3.Если введено revert, удаляет предыдущую введенную строку из памяти (т.е. последнюю).

package sem_04;

import java.util.ArrayDeque;
import java.util.Scanner;

public class sem_4_2_string_revers_revert {
    
    public static void main(String[] args) {
        ArrayDeque <String> stack = new ArrayDeque<>();

        while(true) {
            String str = scannerText();
            if(str.equals("quit")) {
                System.out.println(stack);
                break;
            }
            
            else if(str.equals("print")){
                Object [] strings = stack.toArray(); // преобразуем в Object, т.к. toArray не двет сделать для String
                for (int i = strings.length-1; i >= 0 ; i--) {
                    System.out.println(strings[i]);
                }
            }
            
            else if (str.equals("revert")) {
                System.out.println(stack.removeLast());
            }

            else{
                stack.add(str);
            }
            System.out.println(stack);
            }
        }
        
        public static String scannerText() {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String text = in.nextLine();
            return text;
        }
}


    