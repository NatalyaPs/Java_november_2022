package home_work_13_OOP_06_FINAL_PROJECT.view;

import home_work_13_OOP_06_FINAL_PROJECT.modal.CompanyContact;
import home_work_13_OOP_06_FINAL_PROJECT.service.ContactService;

public class CompanyView extends ContactView<CompanyContact> {

    public CompanyView(ContactService<CompanyContact> model) {
        super(model);
    }
    
}
