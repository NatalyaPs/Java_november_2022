package sem_08_OOP_2.sem_8_2_Employee;

import java.util.ArrayList;
import java.util.List;

public class BossEmployee extends Employee {

    private List<Employee> employees = new ArrayList<>();

    public BossEmployee(List<Employee> employees) {  // конструктор принимает списо извне и сохраняет
        this.employees = employees;
    }

    @Override
    public String getJobTitle() {
        return "Boss";
    }

    @Override
    public Integer getSalary() {
        return 1000000;
    }

    @Override
    public void work() {  // засталяет работать сотрудников
        for (Employee employee : employees) {
            employee.work();
        }
        
    }

    // @Override
    // public String toString() {
    //     return "BossEmployee [employees=" + employees + "]";
    // }
    
}
