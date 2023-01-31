package home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication;

import java.util.ArrayList;
import java.util.List;

public interface CommunicationMethod {
    
    public List<String> data = new ArrayList<>();

    void addCommunicMethod (String str);

    void deliteCommunicMethod(int index);

    // List<String> addPhoneCommunicMethod (String str, List<String> data);

    // void delitePhoneCommunicMethod(int index);
}



// ***************************************************
// public class CommunicationMethod implements TelephoneCommunicMethod, 
//                                             EmailCommunicMethod, 
//                                             TelegramCommunicMethod, 
//                                             VkCommunicMethod,
//                                             AddressComunicMethod {

//     public List<String> phone = new ArrayList<>();
//     public List<String> email = new ArrayList<>();
//     public List<String> telegram = new ArrayList<>();
//     public List<String> vk = new ArrayList<>();
//     public List<String> address = new ArrayList<>();
//     private int index;

//     public CommunicationMethod(List<String> phone, 
//                             List<String> email, 
//                             List<String> telegram, 
//                             List<String> vk,
//                             List<String> address,
//                             int index) {
//         this.phone = phone;
//         this.email = email;
//         this.telegram = telegram;
//         this.vk = vk;
//         this.address = address;
//         this.index = index;
//     }
    // *************************************
// public static void addPhoneCommunicMethod (String s) {
    //     data.add(s);
    // }


    // public static void delitePhoneCommunicMethod(List<String> data) {
    //     data.remove(0);
    // }
    




    





// public interface CommunicationMethod {

//     void addCommunicMethod();

//     void deliteCommunicMethod();

// }



// public interface CommunicationMethod<U> {
//     public List<U> data = new ArrayList<>();


//     public void addCommunicMethod(U d) {
//         data.add(d);
//     }

//     public void deliteCommunicMethod(List<U> data) {
//         data.remove(0);
//     }
// }
