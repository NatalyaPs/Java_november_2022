package home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication;

import java.util.ArrayList;
import java.util.List;

public class TelephoneCommunicMethod implements CommunicationMethod {

    public List<String> phone = new ArrayList<>();

 
    public TelephoneCommunicMethod(List<String> phone) {
        this.phone = phone;
    }

    @Override
    public void addCommunicMethod(String str) {
        phone.add(str);
    }

    @Override
    public void deliteCommunicMethod(int index) {
        phone.remove(index);
    }

    

    // @Override
    // default List<String> addPhoneCommunicMethod(String str, List<String> phone) {
    //     phone.add(str);
    //     return phone;
    // }

    // @Override
    // default void delitePhoneCommunicMethod(int index) {
    //     // TODO Auto-generated method stub
        
    }

    

    // @Override    
    // default  List<String> addPhoneCommunicMethod(String str) {  // , List<String> phone
    //     phone.add(str);
    // }

    // @Override
    // default void delitePhoneCommunicMethod(int index) {
    //     phone.remove(0);
    // }





// public interface TelephoneCommunicMethod<E> {

//     void addPhoneCommunicMethod (String str, List<E> e);

//     void delitePhoneCommunicMethod(int index);
// }

//************************
// public List<String> data = new ArrayList<>();

    // public static void addPhoneCommunicMethod (String s) {
    //     data.add(s);
    // }

    // public static void delitePhoneCommunicMethod(List<String> data) {
    //     data.remove(0);
    // }