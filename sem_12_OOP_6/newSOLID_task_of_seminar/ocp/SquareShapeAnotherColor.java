package sem_12_OOP_6.newSOLID_task_of_seminar.ocp;

public class SquareShapeAnotherColor extends SquareShape {

    private char color;

    public SquareShapeAnotherColor(char color) {
        this.color = color;
    }

    
    @Override
    public void draw() {
        System.out.printf("%c%c%c\n", color, color, color);
        System.out.printf("%c%c%c\n", color, color, color);
        System.out.printf("%c%c%c\n", color, color, color);
    }
    
}