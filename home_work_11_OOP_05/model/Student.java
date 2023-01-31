package home_work_11_OOP_05.model;

import java.util.*;

public class Student {
    private String name;
    private String surname;
    private List<Student> students;
    private AttendanceStudent attendanceStudents;
    //private Map<DateTime, Boolean> attendanceStudents = new HashMap<>();
    
    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        students = new ArrayList<>();
        // attendanceStudents = new HashMap<>();  // ? или в классе
        // this.attendanceStudents = attendanceStudents;  // или так
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public AttendanceStudent getAttendanceStudents() {
        return attendanceStudents;
    }

    public void setAttendanceStudents(AttendanceStudent attendanceStudents) {
        this.attendanceStudents = attendanceStudents;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", surname=" + surname + "]";
    }


    
}
