package sem_08_OOP_2.sem_8_0_Shape;

import java.util.ArrayList;
import java.util.List;

/** 
 * Создайте базовый класс — Геометрическая фигура. Геометрическая фигура предоставляет две функции:
Узнать площадь
Узнать периметр
Создайте два унаследованных класса: Квадрат и Круг. Переопределите родительские методы.
Создайте коллекцию геометрических фигур. Распечатайте информацию о них.
*/

public class Main {
    public static void main(String[] args) {
        // много геометрич.фигур => запихиваем их в коллекцию родительского типа
        List<Shape> shapes = new ArrayList<Shape> ();
        shapes.add (new SquareShape(10));
        shapes.add (new SquareShape(1));
        shapes.add(new CircleShape(10));

        for (Shape shape : shapes) {
            System.out.printf("%s   area = %.2f   perimeter = %.2f \n", shape, shape.getArea(), shape.getPerimetr());
        }
    }
}
