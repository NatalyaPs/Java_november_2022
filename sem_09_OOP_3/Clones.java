package sem_09_OOP_3;

public class Clones {
    public static void main (String[] args) throws CloneNotSupportedException {
        Student original = new Student("Иван", "Иванов", 4.8f);
        System.out.println(original);

        // Student clone = new Student(     // так сделали бы без интерфейса Cloneable, по классике
        //     original.getFirstName(), 
        //     original.getLastName(), 
        //     original.getAverageGrade());

        Student clone = (Student) original.clone ();  // автоматическое клонирование с помощью маркерного интурфейса Cloneable
        System.out.println(clone);  // без toString покажет, что ссылки ведут на разные объекты => сделали клона
    }
}

class Student implements Cloneable {
    private String firstName;
    private String lastName;
    private float averageGrade;

    public Student(String firstName, String lastName, float averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageGrade = averageGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", averageGrade=" + averageGrade + "]";
    }

    
}