package sem_08_OOP_2.sem_8_2_Employee;

import java.util.ArrayList;
import java.util.List;

public class MainFirm {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add (new DisignerEmployee());
        employees.add (new ProgrammerEmployee());

        // for (Employee employee : employees) {
        //     employee.work();
        // }
    
        BossEmployee boss = new BossEmployee(employees);
        boss.work();
    }
    
}
