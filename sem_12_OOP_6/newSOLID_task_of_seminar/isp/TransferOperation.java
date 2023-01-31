package sem_12_OOP_6.newSOLID_task_of_seminar.isp;

public class TransferOperation {
    private UI ui;

    public TransferOperation(UI ui) {
        this.ui = ui;
    }

    public void execute () {
        int amount = ui.getTransferSum();
        String targetClient = ui.getTransferTarget();
        // ...
        System.out.println("Деньги переведены!");
    }
}
