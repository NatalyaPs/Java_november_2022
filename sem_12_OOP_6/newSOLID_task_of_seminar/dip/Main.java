package sem_12_OOP_6.newSOLID_task_of_seminar.dip;

public class Main {
    public static void main(String[] args) {
        Switch sw = new Switch(new Lamp());
        sw.toggle();
        sw.toggle();
        sw.toggle();
        sw.toggle();
    }
}
