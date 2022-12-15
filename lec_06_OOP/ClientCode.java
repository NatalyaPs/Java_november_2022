package lec_06_OOP;

import java.util.Arrays;
import java.util.HashSet;

public class ClientCode {
    public static void main(String[] args) {
        
        Worker w1 = new Worker(); // имя работника не должно быть именем переменной. Worker - тип, который мы создали в файле worker. new Workwr - конструктор
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;
    
        Worker w4 = new Worker(); // все поля как у w1, но они НЕ равны! Для java это разные объекты
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 1000;
    
        System.out.println(w1 == w4); // false  т.к.не равны по ссылке и по значению
        System.out.println(w1.equals(w4)); //  false  // после прописывания метода equals столо true
    
        Worker w2 = new Worker(); 
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 200;
        w2.id = 2000;
    
        Worker w3 = new Worker(); 
        w3.firstName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salary = 300;
        w3.id = 3000;
    
        System.out.println(w1); // lec_06_OOP.Worker@4617c264
        System.out.println(w2); // lec_06_OOP.Worker@36baf30c
        System.out.println(w3); // lec_06_OOP.Worker@7a81197d
        System.out.println(w4); // lec_06_OOP.Worker@5ca881b5/ после @ - это хэш-код w4 и он НЕ РАВЕН w1
    
        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3)); // создаем коллекцию наших Воркеров. W4 будет при условии, что мы добавили W1
        System.out.println(workers.contains(w4)); // проверяем наличие w4 -> false

        // определяем метод для вывода на печать в файле Worker
        // при этом и предыдущие вывел на печать так же в строке с данными, а не хэш
        // поменяли базовое поведение для вывода в консоль
        System.out.println(w1.toString()); // id: 1000  fn: Имя_1  ln: Фамилия_1  s: 100
        // System.out.println(w2); //
        // System.out.println(w3); // 
        // System.out.println(w4); // 


        // теперь поменяем базовое поведение для метода .equals для сравнения работников
        // и заодно поменяем хэш-код:
        // см. файл с классом Worker
        // вывод поменялся и вверху, но для сохранения комментариев сотавила, чюбю отследить последовательность
        System.out.println(w1); // id: 1000  fn: Имя_1  ln: Фамилия_1  s: 100
        System.out.println(w2); // id: 2000  fn: Имя_2  ln: Фамилия_2  s: 200
        System.out.println(w3); // id: 3000  fn: Имя_3  ln: Фамилия_3  s: 300
        System.out.println(w4); // id: 1000  fn: Имя_1  ln: Фамилия_1  s: 100
        // смотрим w1 и W2 - значения равны

        System.out.println(w1 == w4); // false  т.к.не равны по ссылке и по значению
        System.out.println(w1.equals(w4)); //  после прописывания метода equals столо true
        
        var workers1 = new HashSet<Worker>(Arrays.asList(w1, w2, w3)); 
        System.out.println(workers1.contains(w4)); // true
    }
}
