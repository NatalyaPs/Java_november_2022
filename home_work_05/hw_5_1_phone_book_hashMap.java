// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
// что один человек может иметь несколько телефонов.

package home_work_05;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class hw_5_1_phone_book_hashMap {
    
    public static void main(String[] args) {
        HashMap<String, LinkedList<String>> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in, "cp866");
        
        while (true){
            System.out.println("Введите имя абонента: ");
            System.out.println("Для выхода напишите 'стоп имя'");

            String name = scanner.nextLine();
            
            if (!name.equals("стоп имя")) { // сделала != \\ до этого было break здесь
                phoneBook.put(name, addPhone());
                // break;
            }
            
            else {
                break;
                // phoneBook.put(name, addPhone());
                
            }
            System.out.println(phoneBook);
        }
        System.out.println(phoneBook);
        scanner.close();       
    }

    public static LinkedList<String> addPhone() {
        LinkedList<String> phoneNambers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in, "cp866");
               
        while (true){
            System.out.println("Введите телефонный номер: ");
            System.out.println("Для выхода напишите 'стоп номер'");

            String number = scanner.nextLine();

            if (number.equals("стоп номер")) {
                break;
            }
            else{
                phoneNambers.add(number);
                // System.out.println(phoneNambers); // закрывал ввод новых абонентов
            }
        }  
        // scanner.close(); 
        return phoneNambers;   
    }       
}