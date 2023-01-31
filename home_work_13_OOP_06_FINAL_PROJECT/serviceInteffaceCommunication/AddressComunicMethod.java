package home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication;

import java.util.ArrayList;
import java.util.List;

public class AddressComunicMethod implements CommunicationMethod {
    
    public List<String> address = new ArrayList<>();

    
    public AddressComunicMethod(List<String> address) {
        this.address = address;
    }

    @Override
    public void addCommunicMethod(String str) {
        address.add(str);
    }

    @Override
    public void deliteCommunicMethod(int index) {
        address.remove(index);
    }

    
   
}
