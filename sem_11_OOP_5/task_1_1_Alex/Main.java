package sem_11_OOP_5.task_1_1_Alex;

import sem_11_OOP_5.task_1_1_Alex.controller.StudentController;
// import sem_11_OOP_5.task_1_1_Alex.model.Student;
import sem_11_OOP_5.task_1_1_Alex.service.StudentService;
import sem_11_OOP_5.task_1_1_Alex.ui.StudentView;
// import sem_11_OOP_5.task_1_1_Alex.util.DataReader;
// import java.util.List;

/* Задание 1.
Создайте три класса в пакете data: User, Teacher, Student. 
User содержит поля, общие для студента и преподавателя. 
Student и Teacher добавляют поля, специфичные для этих классов. 
Из соображений времени не делайте класс Teacher и связанные с ним классы.

Создайте два класса в пакете util: DataWriter и DataReader. 
Они позволяют сохранить в файл коллекцию студентов и преподавателей, а также загрузить их из файлов.

Создайте в пакете service: интерфейс DataService и два детских класса: StudentService и TeacherService. 
Сервис скрывает в себе коллекцию объектов. Интерфейс содержит операции:

добавить нового студента или учителя
сохранить всех в файл
загрузить всех из файла

* Задание 2.
Создайте класс StudentView, который позволяет распечатать студентов из объекта StudentService.
===============================================================================================================================
 */


 //   ДОДЕЛАЛИ НА 13 СЕМИНАРЕ КОНТРОЛЛЕР  =>  ЭТО ПОЛНОЕ РЕШЕНИЕ
 //   ==========================================================================================================================
public class Main {
    public static void main(String[] args) {

        // это делали без контроллера
        // // new StudentView(new StudentService()).showStudents();   //  загрузить это задача модели
        // StudentService studentService = new StudentService();
        // studentService.addUser(new Student("Alex", "Shirshin", 23, 2, 5.0f));
        // studentService.addUser(new Student("Nik", "Smolov", 25, 2, 4.5f));
        // studentService.addUser(new Student("Olga", "popova", 24, 2, 4.7f));
        // studentService.addUser(new Student("Irina", "Savina", 23, 2, 4.3f));

        // studentService.save(); // сохранить

        // studentService.load();  // загрузить

        // new StudentView(studentService).showUsers();  // распечатать студентов

        StudentService model = new StudentService();
        StudentController studentController = new StudentController(model, new StudentView(model));

        studentController.showMenu();

    }
}
