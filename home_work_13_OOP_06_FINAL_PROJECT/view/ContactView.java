package home_work_13_OOP_06_FINAL_PROJECT.view;

import home_work_13_OOP_06_FINAL_PROJECT.modal.Contact;
import home_work_13_OOP_06_FINAL_PROJECT.service.ContactService;

public abstract class ContactView<C extends Contact> {
    private ContactService<C> model;

    public ContactView(ContactService<C> model) {
        this.model = model;
    }

    public void showContact() {
        for (C contact : model.getContact()) {
            System.out.println(contact);
        }
    }
    
}
