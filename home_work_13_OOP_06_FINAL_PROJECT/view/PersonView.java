package home_work_13_OOP_06_FINAL_PROJECT.view;

import java.util.ArrayList;
import java.util.List;

import home_work_13_OOP_06_FINAL_PROJECT.modal.PersonContact;
import home_work_13_OOP_06_FINAL_PROJECT.service.ContactService;
import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.TelephoneCommunicMethod;

public class PersonView extends ContactView<PersonContact>  {  //implements TelephoneCommunicMethod
    // List<String> telephones = new ArrayList<>();
    // int index;                  ///   НАДО ЛИ ЭТО ЗДЕСЬ?

    public PersonView(ContactService<PersonContact> model) {
        super(model);
    }

    // @Override
    // public void addPhoneCommunicMethod(String str) {                ///   НАДО ЛИ ЭТО ЗДЕСЬ?
    //     // TODO Auto-generated method stub
    //     TelephoneCommunicMethod.super.addPhoneCommunicMethod(str);
    // }

    // @Override
    // public void delitePhoneCommunicMethod(int index) {             ///   НАДО ЛИ ЭТО ЗДЕСЬ?
    //     // TODO Auto-generated method stub
    //     TelephoneCommunicMethod.super.delitePhoneCommunicMethod(index);
    // }

    
    

    

    // @Override
    // public void addCommunicMethod() {
    //     // TODO Auto-generated method stub
        
    // }

    // @Override
    // public void deliteCommunicMethod() {
    //     // TODO Auto-generated method stub
        
    // }

    
    

    

    
}
