package home_work_13_OOP_06_FINAL_PROJECT.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import home_work_13_OOP_06_FINAL_PROJECT.modal.Contact;

public class ContactReader  {

    public static List<Contact> contactRead(String path) {
        List<Contact> list = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String str;
            while ((str = bf.readLine()) != null) {
                String[] array = str.split(",");
                // list.add(new Contact(, , , , ));



                
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
