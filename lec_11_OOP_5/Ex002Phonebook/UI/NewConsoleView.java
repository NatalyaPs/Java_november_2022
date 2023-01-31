package Ex002Phonebook.UI;

public class NewConsoleView extends ConsoleView {  //  если "старая" view надоела, то можно создать новую и продумыать иерархию
                                                    // новая наследуется от предыдущей    !!!!!!!
    public NewConsoleView() {
        super();
    }

    @Override
    public void setDescription(String value) { // например меняем получение данных, переход на нов.строку
        super.setDescription(value);
        System.out.println();
    }

}
