package sem_12_OOP_6.newSOLID_task_of_seminar.srp;

class Rectangle {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // вычислительная задача
    public int getArea () { return width * height; }

    // графическая задача
    public void draw () {
        GraphicsLibrary.drawRectangle(0, 0, width, height, '#');
    }
}
