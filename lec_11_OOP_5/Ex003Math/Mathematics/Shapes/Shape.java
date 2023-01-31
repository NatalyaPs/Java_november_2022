package Ex003Math.Mathematics.Shapes;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {  // форма
    protected double area;  // площадь
    protected String name;

    public double getArea() {
        return area;
    }

    protected void setArea(double value) {  //  ! протектед
        area = value;
    }

    public void setNane(String value) {
        name = value;
    }

    public String getNane() {
        return name;
    }

    // фигура внутри себя может содержать другие фигуры (перечень точно таких же фигур)
    public List<Shape> shapes = new ArrayList<Shape>();

    private void Print(StringBuilder sb, String indent) {  // indent - выемка, отступ, зубец
        sb.append(String.format("%s %s %s\n", indent, name, getArea()));

        for (Shape shape : shapes)
            shape.Print(sb, indent + "  ");  // метод print рекурсивно вызывает себя и будет обходить все фигуры и вызывать всё, что нужно
            // + "  "   показывает при выводе, что фигуры вложены внутрь Canvas-а  => можем вкладывать фигурки в фигурки  (РАЗНЫЙ ОТСТУП В СТРОКЕ ПОКАЗЫВАЕТ ВЛОЖЕННОСТЬ)
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Print(sb, "");                  // вызывает метод print
        return sb.toString();
    }
}
