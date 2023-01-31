package sem_11_OOP_5.task_1_2_Alex.service;

import java.util.ArrayList;
import java.util.List;

import sem_11_OOP_5.task_1_2_Alex.model.Student;
import sem_11_OOP_5.task_1_2_Alex.util.DataReader;
import sem_11_OOP_5.task_1_2_Alex.util.DataWriter;

public class StudentService implements DataService<Student> {

    private final String path = "studentDB.txt";

    private List<Student> students = new ArrayList<>();  // здесь поле! это важно. Студенты добавляются в эту коллекцию

    @Override
    public void addUser(Student student) {
        students.add(student);
    }

    @Override
    public void save() {     // добавила аргумент String path
        DataWriter.dataWrite(students);
    }

    @Override
    public List<Student> load() {   // добавила аргумент String path
        return DataReader.dataRead(path);
    }
}
