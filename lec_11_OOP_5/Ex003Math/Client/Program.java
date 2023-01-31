/*Напишите программу для поставки внешним клиентам, которая умеет вычислять площадь круга по радиусу и прямоугольника по трем сторонам. 
Дополнительно к работоспособности оценим:
- легкость добавления других фигур
- вычисление площади фигуры без знания типа фигуры
- обработку возникающих проблем при создании фигур
И подешевле! */

package Ex003Math.Client;

import Ex003Math.Mathematics.Exceptions.UnacceptableValueException;
import Ex003Math.Mathematics.CalculateArea.CalculateArea;
import Ex003Math.Mathematics.Shapes.Canvas;
import Ex003Math.Mathematics.Shapes.Circle;
import Ex003Math.Mathematics.Shapes.Rectangle;
import Ex003Math.Mathematics.Shapes.Shape;

public class Program {
    public static void main(String[] args) throws UnacceptableValueException {

        new App().start();

        // #region
        // System.out.println("----------------первый пример запуска от этой линии----------------");
        // Shape shape1 = Circle.create(1, "Circle_1");
        // Shape shape2 = Rectangle.create(2, 3, "Rectangle_2");
        // Shape shape3 = Circle.create(4, "Circle_3");
        // Shape shape4 = Rectangle.create(5, 6, "Rectangle_4");
        // Shape shape5 = Rectangle.create(7, 8, "Rectangle_5");
        // Shape shape6 = Circle.create(9, "Circle_6");

        // Canvas canvas = new Canvas("Canvas");

        // System.out.println("----------------первый пример запуска от этой линии----------------");
        // canvas.shapes.add(shape1);
        // canvas.shapes.add(shape2);
        // canvas.shapes.add(shape3);
        // canvas.shapes.add(shape4);
        // canvas.shapes.add(shape5);
        // canvas.shapes.add(shape6);
        
        // System.out.println(canvas);
        // System.out.println("----------------первый пример запуска до этой линии----------------");

        //  //  вкладываем фигурки в фигурки
        //  // -----------------------------------------------------  !!!
        // shape2.shapes.add(shape1);
        // shape4.shapes.add(shape2);
        // shape4.shapes.add(shape3);
        // shape6.shapes.add(shape4);
        // shape6.shapes.add(shape5);

        // canvas.shapes.add(shape6);

        // System.out.println(canvas);


        // #endregion
    }
}
