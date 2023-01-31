// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что один человек может иметь несколько телефонов.

package Java_PracticalTasks.PT5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        
        ArrayList<String> employeeData = inputData();
        System.out.println(employeeData);

        
        HashMap <String, String> phoneTypeAndNumber = new HashMap <> ();
        
        for (int i = 0; i < employeeData.size(); i++) {
            
            phoneTypeAndNumber.putIfAbsent("mobile phone", employeeData.get(2));
            phoneTypeAndNumber.putIfAbsent("work phone", employeeData.get(3));
            phoneTypeAndNumber.putIfAbsent("home phone", employeeData.get(4));
            
            HashMap <String, HashMap<String, String>> name = new HashMap <> ();
            name.putIfAbsent(employeeData.get(1), phoneTypeAndNumber);
            
            phoneBook.put(employeeData.get(0), name, phoneTypeAndNumber);
            HashMap<Integer, HashMap<String, HashMap<String, String>>> phoneBook = new HashMap<>();
            // int temp = Convert.ToInt32(employeeData.get(0));
            
        }
                


    }

    // функция ввода данных
    public static ArrayList<String> inputData () {
        ArrayList<String> data = new ArrayList<>();
        Scanner iScanner = new Scanner(System.in, "CP866");
        System.out.printf("Enter the employee's payroll number: ");
        String personnelNumber = iScanner.nextLine();
        data.add(personnelNumber);
        System.out.printf("Enter name: ");
        String name = iScanner.nextLine();
        data.add(name);
        System.out.printf("Enter mobile phone number: ");
        String mobilePhoneNumber = iScanner.nextLine();
        data.add(mobilePhoneNumber);
        System.out.printf("Enter work phone number: ");
        String workPhoneNumber = iScanner.nextLine();
        data.add(workPhoneNumber);
        System.out.printf("Enter home phone number: ");
        String homePhoneNumber = iScanner.nextLine();
        data.add(homePhoneNumber);
        iScanner.close();
        return data;
    }
    
}



        
        // ArrayList<String> data1 = new ArrayList<>();
        // data1.add("Иванов Иван Иванович");
        // data1.add("мобильный телефон +7 (123) 456 7890");
        // data1.add("рабочий телефон +7 (321) 789 0456");
        // data1.add("домашний телефон +7 (321) 504 4455");
        // // System.out.println(data1);

        // ArrayList<String> data2 = new ArrayList<>();
        // data2.add("Петров Петр Петрович");
        // data2.add("мобильный телефон +7 (222) 111 2222");
        // data2.add("рабочий телефон +7 (321) 333 4444");
        // data2.add("домашний телефон +7 (321) 555 5555");
        // // System.out.println(data2);

        // HashMap<Integer, ArrayList<String>> phoneBook = new HashMap<>();
        // phoneBook.putIfAbsent(101, data1);
        // phoneBook.putIfAbsent(102, data2);
        // System.out.println(phoneBook);
        // // System.out.printf("%d => %s -> %s, %s, %s", );
        // System.out.println(phoneBook.values());




        
        // HashMap <Integer, HashMap <String, String>> phoneBook = new HashMap <> ();
        // HashMap <String, String> dataPerson = new HashMap <> ();
        // dataPerson.putIfAbsent("Name", "Петров Петр Петрович");
        // dataPerson.putIfAbsent("mobile phone", "+7 (222) 111 2222");
        // dataPerson.putIfAbsent("work phone", "+7 (321) 333 4444");
        // dataPerson.putIfAbsent("home phone", "+7 (321) 555 555");
        // phoneBook.putIfAbsent(1, dataPerson);
        // System.out.println(phoneBook.values());

