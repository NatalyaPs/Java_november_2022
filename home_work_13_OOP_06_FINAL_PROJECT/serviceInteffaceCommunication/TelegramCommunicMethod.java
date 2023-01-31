package home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication;

import java.util.ArrayList;
import java.util.List;

public class TelegramCommunicMethod implements CommunicationMethod {

    public List<String> telegram = new ArrayList<>();

    
    public TelegramCommunicMethod(List<String> telegram) {
        this.telegram = telegram;
    }

    @Override
    public void addCommunicMethod(String str) {
        telegram.add(str);
    }

    @Override
    public void deliteCommunicMethod(int index) {
        telegram.remove(index);
    }
    
    
   
}
