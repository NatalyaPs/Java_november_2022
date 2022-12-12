// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.
// Ответ:
// 123456 Иванов
// 234432 Иванов
// 345678 Иванов


package sem_05;

import java.util.HashMap;
import java.util.Map;

public class sem_5_0_passport_to_last_name {
    
    public static void main(String[] args) {
        HashMap<Integer, String> passportToLastName = new HashMap<>(); // маленький объем данных, поэтому HashMap не страшно. Имя " по этому ищем это"
        passportToLastName.put (123_456, "Иванов"); // put перезаписывает, если одинаковый ключ
        passportToLastName.put (321_456, "Васильев");
        passportToLastName.put (234_561, "Петрова");
        passportToLastName.put (234_432, "Иванов");
        passportToLastName.put (654_321, "Петрова");
        passportToLastName.put (345_678, "Иванов");
        
        System.out.println(passportToLastName); // выводит красиво, как список, т.к. класс, печатает как toString
        
        String lastName = passportToLastName.get (123_456); // get - ищет по ключу значение. Сохранили функцию get в переменную String lastName
        System.out.println(lastName); // вернет фамилию Иванов, значение по ключу
        
        if (passportToLastName.containsKey(123_456)) // containsKey содержит ли такой ключ (boolean)/ Есть еще containsValue, но она делает полный перебор по всей таблице
            System.out.println("Такой паспорт существует!"); // если true
        
        // цикл фор ич выглядит сложнее с Map:
        // Map.Entry означает запись, входящую в состав нашего Map. из нашего Мэпа получить набор всех entry. (В классе entry только 2 функции: .getKey и .getValue)
        for (Map.Entry<Integer, String> entry : passportToLastName.entrySet()) // цикл для каждого, цикл фор ич здесь должен перебирать пары. entrySet()- получить набор всех entry
            if (entry.getValue().equals("Иванов")) // В классе entry только 2 функции: .getKey и .getValue
                System.out.println(entry);
        }
}
