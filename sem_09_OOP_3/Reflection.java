package sem_09_OOP_3;

import java.lang.reflect.Modifier;
import java.lang.reflect.Field;  // здесь живут все вещи, связанные с рефлексией

public class Reflection {
    public static void main(String[] args) {  
        // выбираем класс, который можем инспектировать, не примитивные типы! н-р String, Integer, интерфейс List<Integer>, ArrayList<>
        Class c = String.class;   // получаем ссылку на переменную, которая рассказывает про этот тип данных (String.class)

        // теперь можем запрашивать все функции, к-е умеет. Напримр, запросить все поля
        Field[] fields = c.getDeclaredFields();  //  функция c.getDeclareFields возвращае нам массив Филдов

        // типы Field, Class относятся к рефлексии

        // теперь, когда есть список полей, мы можем делать все, что и с любой коллекцией:

        for (Field field : fields) {
            System.out.println(field);
        }
        /*  в консоли вcе, что есть в классе String */

        // т.е. мы грубо вскрыли ИНКАПСУЛЯЦИЮ !!!
        // и еще хуже: объект класса Field позволяет ЗАПИСАТЬ приватное поле класса !!!

        System.out.println("================================");
        
        for (Field field : fields) {   
            if ((field.getModifiers() & Modifier.PRIVATE) > 0) // распечатать только приватные Модификаторы
                System.out.println(field);
        }
    }
}

