/*    Задание 1.
Создайте три класса в пакете data: User, Teacher, Student. User содержит поля, общие для студента и преподавателя. 
Student и Teacher добавляют поля, специфичные для этих классов. Из соображений времени не делайте класс Teacher и связанные с ним классы.
Создайте два класса в пакете util: DataWriter и DataReader. Они позволяют сохранить в файл коллекцию студентов и преподавателей, а также загрузить их из файлов.
Создайте в пакете service: интерфейс DataService и два детских класса: StudentService и TeacherService. Сервис скрывает в себе коллекцию объектов. Интерфейс содержит операции:
добавить нового студента или учителя
сохранить всех в файл
загрузить всех из файла
*    Задание 2.
Создайте класс StudentView, который позволяет распечатать студентов из объекта StudentService.
Какие архитектурные изменения стоит внести, если вы подозреваете, что в будущем предстоит добавить аналогичный класс TeacherView?
*   Задание 3.  -----  НЕ УСПЕЛИ  -----
Создайте класс StudentController. Он позволяет пользователю выбирать следующие команды:
Загрузить список студентов из файла
Добавить нового студента
Распечатать текущий список студентов
Сохранить студентов в файл
Сделайте так, чтобы загрузка студентов происходила автоматически при старте программы. 
Сделайте так, чтобы сохранение студентов происходило автоматически перед выходом из программы.
Какие изменения надо внести в архитектуру, если вы ожидаете, что впоследствии нужно будет написать класс TeacherController?
*/

package sem_11_OOP_5.task_1_Rafail;

import java.util.Arrays;
import java.util.List;

import sem_11_OOP_5.task_1_Rafail.View.StudentView;
import sem_11_OOP_5.task_1_Rafail.model.data.Student;
import sem_11_OOP_5.task_1_Rafail.model.util.DataWritter;
import sem_11_OOP_5.task_1_Rafail.service.StudentService;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(   // можно создавать и в DataWritter в методе
            new Student("Ivan", "Ivanov", "MSU", "IT", "1"),
            new Student("Sergey", "Petrov", "MSU", "IT", "1"),
            new Student("Anna", "Ejova", "MSU", "IT", "1"),
            new Student("Olge", "Tinova", "MSU", "IT", "1")
        );
        //  DataWritter data = new DataWritter();
        new DataWritter().writeToFile(students);  // создаем безымянный объект пустышку и на нем вызываем метод
                                                 // можно было еще упростить, если сделать этот метод статическим, т.к.там ничего нет, ни полей..
        System.out.println("создали файл students.txt");
        System.out.println("-------------вторая часть-------------");

        new StudentView().printStudents(new StudentService(students));  // сократили нижние 2 строки - это "заворачивание объекта"
        // StudentService studentService = new StudentService(students);
        // new StudentView().printStudents(studentService);


    }
}
