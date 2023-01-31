package sem_11_OOP_5.task_1_1_Alex.ui;

import sem_11_OOP_5.task_1_1_Alex.model.Teacher;
import sem_11_OOP_5.task_1_1_Alex.service.DataService;

// import sem_11_OOP_5.task_1_1_Alex.model.Teacher;
// import sem_11_OOP_5.task_1_1_Alex.service.TeacherService;


// см StudentView
public class TeacherView extends UserView<Teacher> {

    public TeacherView(DataService<Teacher> model) {
        super(model);
    }  
    
    // убрали все, т.к. прописали в абстрактном классе

    
    // private TeacherService model;

    // public TeacherView(TeacherService model) {   
    //     this.model = model;
    // }

    // public void showTeacher() {           // надо из StudentService распечатать List
           
    //     for (Teacher teacher: model.getTeachers()) {
    //         System.out.println(teacher);
    //     }
    // }
}
