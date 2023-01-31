package home_work_13_OOP_06_FINAL_PROJECT.service;
//   МОДЕЛЬ
import java.util.ArrayList;
import java.util.List;

import home_work_13_OOP_06_FINAL_PROJECT.modal.Contact;
import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.CommunicationMethod;
import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.TelephoneCommunicMethod;
import home_work_13_OOP_06_FINAL_PROJECT.util.ContactReader;
import home_work_13_OOP_06_FINAL_PROJECT.util.ContactWriter;

// public interface ContactService<C extends Contact> {
public class ContactService<C extends Contact>  {     // implements TelephoneCommunicMethod  // extends CommunicationMethod
    
    private final String path = "CONTACTS.txt";
    private List<Contact> сontacts = new ArrayList<>();// здесь поле! Контакты добавляются в эту коллекцию
    

    public ContactService(List<Contact> сontacts) {
        this.сontacts = сontacts;
    }

    private void addContact(C contact) {
        сontacts.add(contact);
    }

    private void removeContact(String name) {
        for (int i = 0; i < сontacts.size(); i++) {
            if(сontacts.get(i).getName().equalsIgnoreCase(name)) {
                сontacts.remove(i);
            }
        }
    }

    // отдаем копию коллекции // или отдаем коллекцию, т.к. у нас пользователь
    public List<C> getAll() { 
        return new ArrayList(сontacts);   //new ArrayList<C>(сontacts);
    }

    public List<C> getContact() {
        return cont};



    // буду ли сохранять? Доп.задание
    public void save() {
        ContactWriter.contactWrite(сontacts);
    }

    // буду ли сохранять? Доп.задание
    public void load() {
        сontacts = ContactReader.contactRead(path);
    }

    public void setСontacts(List<Contact> сontacts) {
        this.сontacts = сontacts;
    }



    @Override
    public String toString() {
        return " сontacts=" + сontacts;
    }



    @Override
    public void addCommunicMethod() {
        // TODO Auto-generated method stub
        
    }



    @Override
    public void deliteCommunicMethod() {
        // TODO Auto-generated method stub
        
    }

    
}
// // отдаем копию коллекции
// public List<C> getAll() { 
//     List<C> copyСontacts = new ArrayList<>();
//     for (Contact contact : сontacts) {
//         copyСontacts.add(contact);
//     }
//     return copyСontacts;
// }
