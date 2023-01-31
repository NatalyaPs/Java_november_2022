package home_work_13_OOP_06_FINAL_PROJECT.controller;

import java.util.Scanner;

import home_work_13_OOP_06_FINAL_PROJECT.modal.Contact;
import home_work_13_OOP_06_FINAL_PROJECT.service.ContactService;
import home_work_13_OOP_06_FINAL_PROJECT.view.ContactView;

public class ContactController {

    // поля: у контроллера всегда есть ссылка на модель (оперирует над моделью) 
    // на вью по классике ссылки нет, но в нашем примере будет
    private ContactService model;
    private ContactView view;

    
    public ContactController(ContactService model, ContactView view) {
        this.model = model;
        this.view = view;
    }

    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        // Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");

            int index = scanner.nextInt();

            switch (index) {
                case 1: model.load(); break;
                // case 2: model.addContact(new Contact(, , , , )); break;   // вообще это задача контроллера заполнять, но здесь для примера добавим так
                // case 3: view.show...............(); break;
                case 4: model.save(); break;
                case 5: return; 
            }
        }
    }

    public Contact fillContact(){
        return null;
    }
}
