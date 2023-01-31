package home_work_11_OOP_05.model;
                                                       //  нужен ли этот класс ?????
import java.time.LocalDate;
import java.util.*;

// подумать, надо ли
public class AttendanceStudent {  // посещаемость
    // private Student student;
    private LocalDate localDate;
    private Map<LocalDate, Boolean> attendanceStudents = new HashMap<>();  // или в AttendanceService
    private Boolean _boolean;

    public AttendanceStudent(Student student, 
                            LocalDate localDate, 
                            // Map<LocalDate, Boolean> attendanceStudents,
                            Boolean _boolean) {
        // this.student = student;
        this.localDate = localDate;
        // this.attendanceStudents = attendanceStudents;
        this._boolean = _boolean;
    }

    // public Student getStudent() {
    //     return student;
    // }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public Map<LocalDate, Boolean> getAttendanceStudents() {
        return attendanceStudents;
    }

    public Boolean get_boolean() {
        return _boolean;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void setAttendanceStudents(Map<LocalDate, Boolean> attendanceStudents) {
        this.attendanceStudents = attendanceStudents;
    }

    public void set_boolean(Boolean _boolean) {
        this._boolean = _boolean;
    }


}
