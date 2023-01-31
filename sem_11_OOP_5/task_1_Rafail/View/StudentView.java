// имитация графического интерфейса, поэтому печатаем в консоль
// вью не стоит делать статическими, если хотим, ч.б. они были взаимозаменяемыми. 
// Лучше использовать наследование, т.к. статика не дружит с наследованием

package sem_11_OOP_5.task_1_Rafail.View;

// import java.util.List;
import sem_11_OOP_5.task_1_Rafail.model.data.Student;
import sem_11_OOP_5.task_1_Rafail.service.StudentService;

public class StudentView {
    // студентСервис является оберткой вокруг коллекции студентов, но такой аргумент тоже можно
    // public void printStudents(List<Student> students) {   // исправляем ниже

        
    public void printStudents(StudentService students) {    // оберточный класс - в StudentService есть поле, но оно приватное private List<Student> students => делаем гет, но изменяем
        for (Student student : students.getStudents()) {
            System.out.println(student);
        }
    }
}
