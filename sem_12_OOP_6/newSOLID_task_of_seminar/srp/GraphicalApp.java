package sem_12_OOP_6.newSOLID_task_of_seminar.srp;

public class GraphicalApp {
    public static void main(String[] args) {
        DrawRectangle drawRectangle = new DrawRectangle(new CalcRectangle(4, 4));
        drawRectangle.draw();
    }
}
