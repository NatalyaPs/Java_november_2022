package sem_10_OOP_4.task_0.services;

import sem_10_OOP_4.task_0.models.Teacher;

// public class TeacherService extends UserService {
    // @Override    // на смену Юзер на Учитель не ругается в классе
    // public Teacher login (String username, String hassword) {; // каждый юзер должен залогиниться. Функция логин (ввести юзернейм и пассворд) и рез-том ее работы является объект класса Юзер
    //     return null;  // пока заглушка
    // }

    // @Override
    // public Teacher register (String username, String hassword) {  // ф-я регистраии
    //     return null;
    // }

    // @Override     // на смену Юзер на Учитель не ругается в классе, а в аргументе ругается
    // public void showProfile (Teacher user) {  // показать профиль (указываем пользователя)      //  ошибка на аргументе
    // }
public class TeacherService extends UserService<Teacher> {
    @Override 
    public Teacher login (String username, String hassword) {; 
        return null;  // пока заглушка
    }

    @Override
    public Teacher register (String username, String hassword) { 
        return null;
    }

    @Override 
    public void showProfile (Teacher user) { 
    }
}
