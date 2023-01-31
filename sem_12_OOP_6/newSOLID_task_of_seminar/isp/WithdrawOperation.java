package sem_12_OOP_6.newSOLID_task_of_seminar.isp;
        

import sem_12_OOP_6.newSOLID_task_of_seminar.isp.UI;

public class WithdrawOperation {
    private UI ui;

    public WithdrawOperation(UI ui) {
        this.ui = ui;
    }

    public void execute () {
        int amount = ui.getWithdrawSum();
        // ...
        System.out.println("Заберите деньги");
    }
}
