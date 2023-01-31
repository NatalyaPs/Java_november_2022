package Ex003Math.Mathematics.Shapes;

public class Rectangle extends Shape {  // прямоугольник

    private double width; // ширина
    private double height;  // высота

    // см аналогичное в Circle с комментами  - вместо конструктора
    public static Rectangle create(double width, double height, String name) {
        // ???...                           // подумать, что может пойти не так
        var instance = new Rectangle();
        instance.name = name;

        instance.width = width;
        instance.height = height;
        return instance;
    }

    private Rectangle() {  // скрытый конструктор
    }

    @Override
    public double getArea() {  // площадь
        return this.width * this.height;
    }

    @Override
    public String toString() {
        // ???...
        return String.format("Name: %s  width: %d  height: %d", name, width, height);
    }
}
