/*класс, рассказывающий, что умеет делать юзер
оказывает услуги юзеру
 * 
*/

package sem_10_OOP_4.task_0.services;
// // проблемы в аргументах у наследников (User user)
// public class UserService {
    // public User login (String username, String hassword) {; // каждый юзер должен залогиниться. Функция логин (ввести юзернейм и пассворд) и рез-том ее работы является объект класса Юзер
    //     return null;  // пока заглушка
    // }

import sem_10_OOP_4.task_0.models.User;

// public User register (String username, String hassword) {  // ф-я регистраии
    //     return null;
    // }

    // public void showProfile (User user) {  // показать профиль (указываем пользователя)
    // }

// ЧТО БЫ ТИПЫ ПОДХОДИЛИ, ДЕЛАЕМ ОБОБЩЕНИЕ С ОГРАНИЧЕНИЕМ   !!!
// -----------------------------------------------------------------
public class UserService<U extends User> {   // <U extends User> -> это U-обобщение с ограничением - должен быть подкласом юзера, тогда будут доступны методы юзера
    public U login (String username, String hassword) {; // каждый юзер должен залогиниться. Функция логин (ввести юзернейм и пассворд) и рез-том ее работы является объект класса Юзер
        return null;  // пока заглушка
    }

    public U register (String username, String hassword) {  // ф-я регистраии
        return null;
    }

    public void showProfile (U user) {  // показать профиль (указываем пользователя)
        System.out.println(user.getUsername());
    }
}
