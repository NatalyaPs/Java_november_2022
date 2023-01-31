package sem_09_OOP_3.task_1_student;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    private int index = -1;  // итератор ставится в предстартовую позицию, ч.б. не пропускал нулевой элемент
    private StudentGroup studentGroup;
   
    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        // if (this.index < this.studentGroup.sizeOfGroup()) {
        //     return true;
        // } else {
        //     return false;
        // }
        return this.index < this.studentGroup.sizeOfGroup() - 1; // компьютер сам посчитает, верно ли это условие и сам вернет true или false

        // boolean x = this.index < this.studentGroup.sizeOfGroup();  // это то же самое, т.к. > < = это буллевые единицы
        // return x;
    }

    @Override
    public Student next() {
        this.index ++;
        return studentGroup.getStudent(this.index);
    }


}