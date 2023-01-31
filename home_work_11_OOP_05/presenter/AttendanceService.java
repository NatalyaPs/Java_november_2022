package home_work_11_OOP_05.presenter;

import java.util.*;

import home_work_11_OOP_05.model.Student;
//контроллер позволяет делать разные действия, зависящие от ввода от пользоателя 
// меню, в котором пользователь выбирает, что надо сделать и этими методами вызовет нужные методы в модели 
// presenter видит вью и модель и всем командует
// команда исходит от пользователя (от вью) - нажатие кнопки -> вызывает метод у презентера-> 
// ->презентер (подобно контроллеру) управляет моделью, вносит изменения, вызывает методы -> 
// -> модель возвращ.данные презентеру -> презентер просит вью отобразить данные
// 
/**
 * сервис посещаемости: хранится информация обо всех студентах
 * /
public class AttendanceService {  //
    private Map<LocalDate, Boolean> attendanceStudents = new HashMap<>();
    private List<Student> students = new ArrayList<>();  // здесь поле! это важно. Студенты добавляются в эту коллекцию

    public void addUser(Student student) {
        students.add(student);
    }

    // public void save() {     // добавила аргумент String path
    //     DataWriter.dataWrite(students);
    // }

    // public List<Student> load() {   // добавила аргумент String path
    //     return DataReader.dataRead(path);
    // }

*/




