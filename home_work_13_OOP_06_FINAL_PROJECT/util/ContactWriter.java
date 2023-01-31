package home_work_13_OOP_06_FINAL_PROJECT.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import home_work_13_OOP_06_FINAL_PROJECT.modal.Contact;

public class ContactWriter {
    public static <C extends Contact> void contactWrite(List<C> list) {
        try(FileWriter writer = new FileWriter("CONTACTS.txt", false))
        {
            for (C contact: list) {
                writer.write(contact.toFileString());
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
