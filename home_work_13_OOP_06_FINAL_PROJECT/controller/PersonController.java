package home_work_13_OOP_06_FINAL_PROJECT.controller;

import home_work_13_OOP_06_FINAL_PROJECT.service.ContactService;
import home_work_13_OOP_06_FINAL_PROJECT.view.ContactView;

public class PersonController extends ContactController {

    public PersonController(ContactService model, ContactView view) {
        super(model, view);
    }
    
}
