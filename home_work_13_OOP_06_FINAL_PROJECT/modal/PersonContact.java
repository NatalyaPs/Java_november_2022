package home_work_13_OOP_06_FINAL_PROJECT.modal;

import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.AddressComunicMethod;
import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.EmailCommunicMethod;
import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.TelegramCommunicMethod;
import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.TelephoneCommunicMethod;
import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.VkCommunicMethod;

// import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.TelephoneCommunicMethod;

public class PersonContact extends Contact {

    public PersonContact(String name, 
                        TelephoneCommunicMethod phoneCM, 
                        EmailCommunicMethod mailCM,
                        TelegramCommunicMethod telegramCM, 
                        VkCommunicMethod vkCM, 
                        AddressComunicMethod addressCM) {
        super(name, 
            phoneCM, 
            mailCM, 
            telegramCM, 
            vkCM, 
            addressCM);
    }
        
}
