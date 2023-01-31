package sem_11_OOP_5.task_1_Rafail.model.data;

public class Student extends User {
    private String nameOfDepartment;
    private String yearOfStudy;

    public Student(String firstName, 
                String lastName, 
                String nameOfUniversity, 
                String nameOfDepartment,
                String yearOfStudy) {
        super(firstName, lastName, nameOfUniversity);
        this.nameOfDepartment = nameOfDepartment;
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + nameOfDepartment + ", " + yearOfStudy;
    }

    






    
}
