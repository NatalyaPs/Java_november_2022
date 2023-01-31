package sem_11_OOP_5.task_1_1_Alex.ui;

import sem_11_OOP_5.task_1_1_Alex.model.Student;
import sem_11_OOP_5.task_1_1_Alex.service.DataService;

// import sem_11_OOP_5.task_1_1_Alex.model.Student;
// import sem_11_OOP_5.task_1_1_Alex.service.StudentService;

// import java.util.List;

public class StudentView extends UserView<Student> {

    public StudentView(DataService<Student> model) {
        super(model);
    } 
    
    // вью визуализирует данные

    // private StudentService model;// убрали все, т.к. прописали в абстрактном классе

    // public StudentView(StudentService model) {   
    //     this.model = model;
    // }

    // public void showStudents() {           // надо из StudentService распечатать List
           
    //     for (Student student: model.getStudents()) {
    //         System.out.println(student);
    //     }
    // }

    // // load не должно быть здесь. Метод шоуСтудентс отвечает только за визуализацию. Лоад можно сделать в Мэйне, если надо, перед вызовом шоуСтудентс

    // // public void showStudents() {          // пытается загрузить данные из файла. Это не работа view. Должно быть в модели или контроллере
    // //     List<Student> list = service.load();    // лист на самом деле берет не из load, а 
    // //     for (Student student: list) {
    // //         System.out.println(student);
    // //     }
    // // }
}
