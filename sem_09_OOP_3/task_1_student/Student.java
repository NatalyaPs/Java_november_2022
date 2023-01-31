/*Создайте класс Student. У студента есть имя, дата рождения и средний балл. Переопределите функцию toString ( ).

Создайте класс StudentGroup. Она содержит коллекцию студентов.

Для коллекции StudentGroup создайте парный класс итератора: StudentGroupIterator. Он реализует интерфейс Iterator<Student>. 
Он отслеживает текущую позицию в итерации.

Класс StudentGroup реализует интерфейс Iterable<Student>. Это позволяет начать итерацию по группе. * 
*/

package sem_09_OOP_3.task_1_student;

// import java.text.SimpleDateFormat;

public class Student {
    private String name;
    private float averrageBall;
    private String dateOfBerth;

    public Student(String name, float averrageBall, String dateOfBerth) {
        this.name = name;
        this.averrageBall = averrageBall;
        this.dateOfBerth = dateOfBerth;
    }

    public String getName() {
        return name;
    }

    public float getAverrageBall() {
        return averrageBall;
    }

    public String getDateOfBerth() {
        return dateOfBerth;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", averrageBall=" + averrageBall + ", dateOfBerth=" + dateOfBerth + "]";
    }

    
    
}