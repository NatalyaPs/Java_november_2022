package sem_11_OOP_5.task_1_1_Alex.model;

import java.util.Locale;

// хранит одного студента
public class Student extends User{

    private int course;
    private float avrGrade;

    public Student(String name, String surname, int age, int course, float avrGrade) {
        super(name, surname, age);
        this.course = course;
        this.avrGrade = avrGrade;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public float getAvrGrade() {
        return avrGrade;
    }

    public void setAvrGrade(float avrGrade) {
        this.avrGrade = avrGrade;
    }

    @Override
    public String toFileString() {
        return super.toFileString() + String.format(Locale.US,", %d, %.2f", course, avrGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", avrGrade=" + avrGrade +
                "} " + super.toString();
    }
}
