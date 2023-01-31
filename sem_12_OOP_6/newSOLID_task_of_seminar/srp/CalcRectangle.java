package sem_12_OOP_6.newSOLID_task_of_seminar.srp;

public class CalcRectangle {
    private int width, height;

    public CalcRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // вычислительная задача
    public int getArea () { return width * height; }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}