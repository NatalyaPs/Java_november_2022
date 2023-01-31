package sem_11_OOP_5.task_1_2_Alex.service;

import java.util.List;

import sem_11_OOP_5.task_1_2_Alex.model.User;

public interface DataService<U extends User> {  // <U extends User> => может быть студенческий и тичерский

    void addUser(U user);

    void save();   // было без аргументов

    List<U> load();   // было без аргументов
}
