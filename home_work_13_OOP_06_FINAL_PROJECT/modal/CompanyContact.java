package home_work_13_OOP_06_FINAL_PROJECT.modal;

import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.AddressComunicMethod;
import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.EmailCommunicMethod;
import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.TelegramCommunicMethod;
import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.TelephoneCommunicMethod;
import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.VkCommunicMethod;

public class CompanyContact extends Contact {

    public CompanyContact(String name, 
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
    // implements TelephoneCommunicMethod, 
    //                                                 AddressComunicMethod, 
    //                                                 EmailCommunicMethod, 
    //                                                 TelegramCommunicMethod, 
    //                                                 VkCommunicMethod 

    

    // @Override
    // public void addCommunicMethod(String str) {
    //     // TODO Auto-generated method stub
    //     super.addCommunicMethod(str);
    // }

    // @Override
    // public void deliteCommunicMethod(int index) {
    //     // TODO Auto-generated method stub
    //     super.deliteCommunicMethod(index);
    // }



                                                        
    // public CompanyContact(String name) {
    //     super(name);
    // }

	// public void addContact() {
	//     // TODO Auto-generated method stub
	    
	// }
    
}
