package sem_11_OOP_5.task_1_Rafail.service;

import java.util.ArrayList;
import java.util.List;
import sem_11_OOP_5.task_1_Rafail.model.data.Student;

public class StudentService implements DataService {
    // берет лист в идеале из файла, но для примера берет лист из Main
    private List<Student> students;

    
    public StudentService(List<Student> students) { //берет лист из Main
        this.students = students;
    }

    @Override
    public void addStudent() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void loadFromFile() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void saveToFile() {
        // TODO Auto-generated method stub
        
    }

    public List<Student> getStudents() {  // отдаем копию коллекции, а не оригинал
        List<Student> copyStudents = new ArrayList<>();
        for (Student student : students) {
            copyStudents.add(student);
        }
        return copyStudents;
    }


    
}
