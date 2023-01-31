package sem_11_OOP_5.task_1_2_Alex.ui;

import java.util.List;

import sem_11_OOP_5.task_1_2_Alex.model.Student;
import sem_11_OOP_5.task_1_2_Alex.service.StudentService;

public class StudentView {

    private StudentService service;

    public StudentView(StudentService service) {
        this.service = service;
    }

    public void showStudents() {
        List<Student> list = service.load();
        for (Student student: list) {
            System.out.println(student);
        }
    }
}
