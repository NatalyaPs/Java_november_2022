package sem_09_OOP_3.task_1_student;

import java.util.Arrays;
// import java.util.ArrayList;
// import java.util.List;
import java.util.Iterator;

public class StudentProgram {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(Arrays.asList(
            new Student("Иванов", 4.8f, "01-05-1985"),
            new Student ("Петров", 4.5f, "03-02-1986"),
            new Student ("Смирнов", 4.9f, "22-11-1985")
            ));

        // StudentGroupIterator studentIter = new StudentGroupIterator(studentGroup);  // создали итератор, который будет ходить по этой гуппе
        Iterator<Student> studentIter = studentGroup.iterator();
        
        // System.out.println(studentIter.hasNext()); // провеяем работоспособность ;)
        while (studentIter.hasNext()) {
            System.out.println(studentIter.next()); // провеяем работоспособность ;)
        }

        System.out.println("==========================");
        // сахар языка - это for для цикла while
        for (Student student : studentGroup) {    // это решение ОСНОВНОЕ !!!!!!!!!!!!!
            System.out.println(student);
        }
    }
}
