package sem_11_OOP_5.task_1_1_Alex.service;

import sem_11_OOP_5.task_1_1_Alex.model.Student;
import sem_11_OOP_5.task_1_1_Alex.util.DataReader;
import sem_11_OOP_5.task_1_1_Alex.util.DataWriter;

import java.util.ArrayList;
import java.util.List;

// сохраняет, добавляет... и коллекция студентов здесь
public class StudentService implements DataService<Student> {

    private final String path = "studentDB1.txt";
    private List<Student> students = new ArrayList<>();   // здесь поле! это важно. Студенты добавляются в эту коллекцию

    public List<Student> getUsers() {  // отдать надо копию коллекции
        return new ArrayList<>(students);
    }

    @Override
    public void addUser(Student student) {
        students.add(student);
    }

    @Override
    public void save() {     //   методы save и load явл.зеркальными, они похожи  иделаются аналогично
        DataWriter.dataWrite(students);
    }

    @Override
    public void load() {   // возвращает в методе dataRead List<Student> list (см DataReader) 
        students = DataReader.dataRead(path);  // т.о. выбрасываем имеющуюся коллекцию студентов и ставим на ее место новую - замещаем коллекцию
    }

    
}
