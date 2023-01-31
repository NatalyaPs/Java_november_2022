package sem_11_OOP_5.task_1_Rafail.model.util;

import java.io.FileWriter;
import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;

import sem_11_OOP_5.task_1_Rafail.model.data.Student;

public class DataWritter {
    // private String path;

    public void writeToFile (Iterable<Student> students) { // изначальо сделали ArrayList, но максимально апкастили, ч.б. максимальное кол-во коллекций подошло. Под Итербл подойдет дaже Set
        // принимает коллекцию студентов
        // когда открывается файл для записис, он в любом случ.создается
        try (FileWriter myWriterCreate = new FileWriter("students.txt")) {  // АВТОЗАКРЫТИЕ -> в (), значит, когда мы выходим из блока try, то закрыть файл автоматически
            // FileWriter myWriterCreate = new FileWriter("students.txt");
            for (Student student : students) {
                myWriterCreate.write(student.toString() + "\n");
            }
            // // myWriterCreate.flush(); // записать в файл, но не закрывать
            // myWriterCreate.close();  // записать и закрыть файл
        }
        catch (IOException e) {}

    }
}
