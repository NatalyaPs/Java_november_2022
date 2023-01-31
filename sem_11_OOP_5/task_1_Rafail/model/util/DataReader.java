package sem_11_OOP_5.task_1_Rafail.model.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import sem_11_OOP_5.task_1_Rafail.model.data.Student;

public class DataReader {
    private String path;

    // задача сформировать коллекцию студентов и ретёрнуть её
    // у функции Сохранить был аргумент сохранить коллекцию студентов, а у ф-ии Прочитать будет тип возврата не void, а коллекция студентов
    // создаем кол.студ-ов, читаем по строчке, парсим и тут же записываем ее
    public List<Student> readToFile() {
        List<Student> students = new ArrayList<>(); // слева ArrayList апкастили до List
        try {
            BufferedReader br = new BufferedReader (new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {  // проверяем есть ли строка и прочитываем её
                String[] str = line.split(",");
                students.add(new Student(str[0], str[1], str[2], str[3], str[4]));
            }
            br.close();
        }
        catch (IOException e) {}
        
        return students;
    }



}
