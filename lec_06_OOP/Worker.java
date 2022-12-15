package lec_06_OOP;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    // начинаем печатать toString и выпадает метод:
    // это автогенерация кода
    // после этого можно исользовать для печати в Clientcode
    // меняем базовое поведение для вывода в консоль
    @Override
    public String toString() {
        String res = String.format("id: %d  fn: %s  ln: %s  s: %d", id, firstName, lastName, salary);
        return res;
        // или одной строкой:
        // return String res = String.format("id: %d  fn: %s  ln: %s  s: %d", id, firstName, lastName, salary);
    }

    // набираем equals:
    // @Override
    public boolean equals(Object o) { // должны получить какой-то объект
        Worker t = (Worker) o; // этот объект длжны скостовать в Воркера и сохранить в переменную
        return id == t.id && firstName == t.firstName; // проверяем, совпадают ли текущие id и firstName с теми, которые мы получили (о), то считаем, что эти 2 сотрудника равны
    }

    // начинаем набирать hashCode:
    // для примера пишем hash ТОЛЬКО для id. НО: в целом это неверно. Делаем так только для примера
    @Override
    public int hashCode() {
        return id;
    }
}
