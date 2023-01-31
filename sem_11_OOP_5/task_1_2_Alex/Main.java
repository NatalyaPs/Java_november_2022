/***    Задание 1.
Создайте три класса в пакете data: User, Teacher, Student. User содержит поля, общие для студента и преподавателя. 
Student и Teacher добавляют поля, специфичные для этих классов. Из соображений времени не делайте класс Teacher и связанные с ним классы.
Создайте два класса в пакете util: DataWriter и DataReader. Они позволяют сохранить в файл коллекцию студентов и преподавателей, а также загрузить их из файлов.
Создайте в пакете service: интерфейс DataService и два детских класса: StudentService и TeacherService. 
Сервис скрывает в себе коллекцию объектов. Интерфейс содержит операции:
-добавить нового студента или учителя
-сохранить всех в файл
-загрузить всех из файла
***    Задание 2.
Создайте класс StudentView, который позволяет распечатать студентов из объекта StudentService.
Какие архитектурные изменения стоит внести, если вы подозреваете, что в будущем предстоит добавить аналогичный класс TeacherView?
***    Задание3.  -  НЕ УСПЕЛИ
Создайте класс StudentController. Он позволяет пользователю выбирать следующие команды:
Загрузить список студентов из файла
Добавить нового студента
Распечатать текущий список студентов
Сохранить студентов в файл
Сделайте так, чтобы загрузка студентов происходила автоматически при старте программы. Сделайте так, чтобы сохранение студентов происходило автоматически перед выходом из программы.
Какие изменения надо внести в архитектуру, если вы ожидаете, что впоследствии нужно будет написать класс TeacherController?
*/

package sem_11_OOP_5.task_1_2_Alex;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

import sem_11_OOP_5.task_1_2_Alex.model.Student;
import sem_11_OOP_5.task_1_2_Alex.service.StudentService;
import sem_11_OOP_5.task_1_2_Alex.ui.StudentView;
// import sem_11_OOP_5.task_1_2_Alex.util.DataReader;
import sem_11_OOP_5.task_1_2_Alex.util.DataWriter;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", "Ivanova", 22, 3, 4.6f));
        students.add(new Student("Petr", "Smornov", 23, 4, 4.8f));

        new DataWriter();
        DataWriter.dataWrite(students);
        System.out.println("---смотрим файл studentDB.txt---");
        System.out.println("---------------------------------");
            

        new StudentView(new StudentService()).showStudents();

    }
}
