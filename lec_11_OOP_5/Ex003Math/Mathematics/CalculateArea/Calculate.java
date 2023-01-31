package Ex003Math.Mathematics.CalculateArea;

import Ex003Math.Mathematics.Shapes.Shape;

public interface Calculate {  //  интерфейс с единственным методом, принимающий фигуру
    double visit(Shape shape);
}
