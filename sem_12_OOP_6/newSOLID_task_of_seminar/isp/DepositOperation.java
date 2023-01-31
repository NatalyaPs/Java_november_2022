package sem_12_OOP_6.newSOLID_task_of_seminar.isp;

public class DepositOperation {
    private DepositUI depositUI;

    public DepositOperation(DepositUI depositUI) {
        this.depositUI = depositUI;
    }

    public void execute () {
        int amount = depositUI.getDepositSum();
        // ...
        System.out.println("Деньги зачислены на счёт");
    }
}
