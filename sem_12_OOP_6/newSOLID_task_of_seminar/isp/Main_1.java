package sem_12_OOP_6.newSOLID_task_of_seminar.isp;

import java.util.*;

public class Main_1 {
    public static void main(String[] args) {
        UI ui = (UI) new ConsoleUI (new Scanner (System.in));  // добавила каст до UI
        DepositOperation op = new DepositOperation((DepositUI) ui);  // добавила каст до DepositUI
        op.execute();
    }
}
