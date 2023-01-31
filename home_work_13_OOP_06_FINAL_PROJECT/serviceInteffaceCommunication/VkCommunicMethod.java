package home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication;

import java.util.ArrayList;
import java.util.List;

public class VkCommunicMethod implements CommunicationMethod {

    public List<String> vk = new ArrayList<>();
    
    
    public VkCommunicMethod(List<String> vk) {
        this.vk = vk;
    }

    @Override
    public void addCommunicMethod(String str) {
        vk.add(str);
    }

    @Override
    public void deliteCommunicMethod(int index) {
        vk.remove(index);
    }
    
   
}
