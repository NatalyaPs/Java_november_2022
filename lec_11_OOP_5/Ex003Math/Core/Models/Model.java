package Ex003Math.Core.Models;

import Ex003Math.Mathematics.CalculateArea.Calculate;
import Ex003Math.Mathematics.Shapes.Canvas;
import Ex003Math.Mathematics.Shapes.Shape;

// позволяет не переписывая приложения просто переписать логику, к-я отвечает за расчеты (если потребуется) и подставить в модель
// абстракции. "Модель, вот тебе фигура и как считать ;)" а правила (подсчета?) передаются в момент создания модели
public class Model {
    Shape panel;
    Calculate calc;

    public Model(Calculate c, String canvasName) {              // конструктор для бОльшей абстракции
        panel = new Canvas(canvasName);//"Без имени (2).jpg");
        calc = c;
    }

    public void append(Shape shape) {
        panel.shapes.add(shape);
    }

    public double area() {
        return calc.visit(panel);
    }

    public String show() {
        return panel.toString();
    }

}
