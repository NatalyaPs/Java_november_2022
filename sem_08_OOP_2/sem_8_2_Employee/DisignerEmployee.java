package sem_08_OOP_2.sem_8_2_Employee;

public class DisignerEmployee extends Employee {

    @Override
    public String getJobTitle() {
        return "Disigner";
    }

    @Override
    public Integer getSalary() {
        return 80000;
    }

    @Override
    public void work() {
        System.out.println("Disigner is painting");
    }

    // @Override
    // public String toString() {
    //     return "DisignerEmployee [ ]";
    // }
    
    
}
