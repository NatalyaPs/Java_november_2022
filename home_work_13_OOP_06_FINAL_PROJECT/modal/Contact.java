package home_work_13_OOP_06_FINAL_PROJECT.modal;

import java.util.ArrayList;
// import java.util.List;

import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.AddressComunicMethod;
import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.EmailCommunicMethod;
import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.TelegramCommunicMethod;
import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.TelephoneCommunicMethod;
import home_work_13_OOP_06_FINAL_PROJECT.serviceInteffaceCommunication.VkCommunicMethod;

public class Contact { // implements TelephoneCommunicMethod, AddressComunicMethod, EmailCommunicMethod, TelegramCommunicMethod, VkCommunicMethod 
    
    private String name;
    TelephoneCommunicMethod phone;
    EmailCommunicMethod email;
    TelegramCommunicMethod telegram;
    VkCommunicMethod vk;
    AddressComunicMethod address;
    
        
    public Contact(String name, 
                TelephoneCommunicMethod phone, 
                EmailCommunicMethod email,
                TelegramCommunicMethod telegram, 
                VkCommunicMethod vk, 
                AddressComunicMethod address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.telegram = telegram;
        this.vk = vk;
        this.address = address;
    }

    

    // public AddressComunicMethod getAddressCM() {
    //     return addressCM;
    // }

    // public void setAddressCM(AddressComunicMethod addressCM) {
    //     this.addressCM = addressCM;
    // }

  
    
    public String toFileString() {
        return String.format("%s", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TelephoneCommunicMethod getPhone() {
        return phone;
    }

    public void setPhone(TelephoneCommunicMethod phone) {
        this.phone = phone;
    }

    public EmailCommunicMethod getEmail() {
        return email;
    }

    public void setEmail(EmailCommunicMethod email) {
        this.email = email;
    }

    public TelegramCommunicMethod getTelegram() {
        return telegram;
    }

    public void setTelegram(TelegramCommunicMethod telegram) {
        this.telegram = telegram;
    }

    public VkCommunicMethod getVk() {
        return vk;
    }

    public void setVk(VkCommunicMethod vk) {
        this.vk = vk;
    }

    public AddressComunicMethod getAddress() {
        return address;
    }

    public void setAddress(AddressComunicMethod address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact [name=" + name + ", phone=" + phone + ", email=" + email + ", telegram=" + telegram + ", vk="
                + vk + ", address=" + address + "]";
    }

}
