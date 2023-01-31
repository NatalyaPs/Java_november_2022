package sem_08_OOP_2.sem_8_0_Shape;

public class SquareShape extends Shape{// квадрат геометрическая фигура
    private float side; // сторона

    public SquareShape(float side) { // онструктор
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public float getPerimetr() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "SquareShape [side=" + side + "]";
    } 
}
