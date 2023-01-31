package home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication;

import java.util.ArrayList;
import java.util.List;

public class EmailCommunicMethod implements CommunicationMethod {
    
    public List<String> email = new ArrayList<>();


    
    public EmailCommunicMethod(List<String> email) {
        this.email = email;
    }

    @Override
    public void addCommunicMethod(String str) {
        email.add(str);
    }

    @Override
    public void deliteCommunicMethod(int index) {
        email.remove(index);
    }
    
    
}
