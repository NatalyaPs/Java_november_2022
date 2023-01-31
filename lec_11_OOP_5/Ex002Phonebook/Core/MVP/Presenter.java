package Ex002Phonebook.Core.MVP;
import Ex002Phonebook.Core.Models.Contact;

// презентер- основной костяк
public class Presenter {   // презентер знает о существовании модели и вью
    
    private Model model;
    private View view;

    public Presenter(View view, String pathDb) {
        this.view = view;                  // конктретная вью
        model = new Model(pathDb);         // путь к базе данных
    }

    public void LoadFromFile() {  // Загрузка из файла                    //  ПРЕЗЕНТЕР СВЯЗЫВАЕТ КОНКРЕТНУЮ МОДЕЛЬ С НАШИМ ПРЕДСТАВЛЕНИЕМ   !!!  =>  =>  =>
        model.load();

        if (model.currentBook().count() > 0) {   // загружаем данные
            model.setCurrentIndex(0);           // если данные есть
            var contact = model.currentContact();  // получаем эти данные

            view.setFirstName(contact.firstName);   // передаем данные во View
            view.setLastName(contact.lastName);
            view.setDescription(contact.description);
        }
    }

    public void add() {   // добавление в рамках презентера ,к-й будут работать с моделью
        model.currentBook().add(
                new Contact(view.getFirstName(), view.getLastName(), view.getDescription()));
    }

    public void remove() {
        Contact contact = new Contact(view.getFirstName(), view.getLastName(), view.getDescription());
        model.currentBook().remove(contact);

        if (model.currentBook().count() < 1) {
            model.setCurrentIndex(-1);

            view.setFirstName("");
            view.setLastName("");
            view.setDescription("");
        } else {
            model.setCurrentIndex(model.getCurrentIndex() - 1);
            if (model.getCurrentIndex() < 0)
                model.setCurrentIndex(0);

            Contact temp = model.currentContact();
            view.setFirstName(temp.firstName);
            view.setLastName(temp.lastName);
            view.setDescription(temp.description);
        }
    }

    public void saveToFile() {
        model.save();
    }

    public void next() {  // переход к след.записи
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentBook().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);                
            }
        }
    }

    public void prev() {  // переключение к предыдущей записи
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() - 1 > -1) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);  
            }
        }
    }
}
