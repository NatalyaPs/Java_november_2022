package sem_11_OOP_5.task_1_1_Alex.service;

import java.util.List;

import sem_11_OOP_5.task_1_1_Alex.model.User;

// import java.util.List;

public interface DataService<U extends User> {

    void addUser(U user);

    void save();

    void load();

    List<U> getUsers();
}
