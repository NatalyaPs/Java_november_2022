package sem_12_OOP_6.newSOLID_task_of_seminar.srp;

public class DrawRectangle {
    private CalcRectangle calcRectangle;

    public DrawRectangle(CalcRectangle calcRectangle) {
        this.calcRectangle = calcRectangle;
    }

    // графическая задача
    public void draw () {
        GraphicsLibrary.drawRectangle(0, 0, calcRectangle.getWidth(), calcRectangle.getHeight(), '#');
    }
}