package sem_11_OOP_5.task_1_1_Alex.ui;

import sem_11_OOP_5.task_1_1_Alex.model.User;
import sem_11_OOP_5.task_1_1_Alex.service.DataService;

public abstract class UserView<U extends User> {
    private DataService<U> model;

    public UserView(DataService<U> model) {
        this.model = model;
    }

    public void showUsers() {           // надо из StudentService распечатать List
           
        for (U user: model.getUsers()) {
            System.out.println(user);
        }
    }
}
