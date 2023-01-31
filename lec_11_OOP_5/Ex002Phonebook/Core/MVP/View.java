package Ex002Phonebook.Core.MVP;

public interface View {  // здесь работаем с 3 полями из 8, к-е есть в модели
    String getFirstName();
    void setFirstName(String value);
    String getLastName();
    void setLastName(String value);  
    String getDescription();
    void setDescription(String value);
    //
}
/* здесь работаем с 3 полями из 8, к-е есть в модели
как продумывать иерархию view?
- технически иерархию  можно простраивать и из интерфейса    !!!!!

т.е. написать, что это вью устарело и будем использовать новое. 
Создать новое "вью вью", сделать наследование, включение основного вью и добавить новые поля
*/