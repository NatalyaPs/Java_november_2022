package sem_09_OOP_3.task_1_student;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {

    private List<Student> studentList;    // апкастим до List, а потом можем выбирать ArrayList или LinkedList

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    // public List<Student> getStudentGroup() {   // нельзя давать доступ к коллекции
    //     return studentGroup;
    // }

    public int sizeOfGroup() {   // даем доступ к размеру группы (коллекции)
        return this.studentList.size();
    }
    
    public Student getStudent (int index) { // приоткрываем коллекцию без нарушения инкапсуляции
        return this.studentList.get(index);
    }

    @Override
    public Iterator<Student> iterator() { // надо создать итератор(класс) и вернуть его (объект класса)
        return new StudentGroupIterator(this);  // (this) означает, что мы будм работать с этой группой   !!!!!!!!!!!!!!
    }                                           // создали итератор, который будет ходить по этой гуппе
    
}
