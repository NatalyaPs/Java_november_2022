package sem_01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class task_1_hello_date_time {
    public static void main(String[] args) {
        System.out.println("hello");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy  HH:mm:ss"); // DateTimeFormatter - имя класса .ofPattern - вызов функции
        System.out.println(LocalDateTime.now().format(formatter));

    }
    

}
