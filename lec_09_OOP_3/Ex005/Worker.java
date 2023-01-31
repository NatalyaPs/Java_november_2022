package lec_09_OOP_3.Ex005;

public class Worker implements Comparable<Worker> {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName,
            String lastName,
            int age,
            int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("\n%s %d %d", fullName(), age, salary);
    }

    @Override
    public int compareTo(Worker o) {    //  вариант метода по умолчанию
        if (this.age > o.age)           //   сравниваем по возрасту. Можно переписать по зарплате, например 
            return 1;
        else if (this.age < o.age)
            return -1;
        else
            return 0;
    }

    // @Override
    // public int compareTo(Worker o) {        // можем переписать и так . Можно поменять на зарплату в эой же логике
    //     return Integer.compare(this.age, age);
    // }

}
