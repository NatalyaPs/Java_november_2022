package Ex003Math.Mathematics.CalculateArea;

import Ex003Math.Mathematics.Shapes.Shape;

public class CalculateArea implements Calculate {

    private static CalculateArea instance;  // instance - пример
    // static {
    // instance = new CalculateArea();
    // }

    public static CalculateArea getInstance() {
        if (instance == null)
            instance = new CalculateArea();
        return instance;
    }

    private CalculateArea() {
    }

    /**
     * RefInt - класс внутри класса. так тожк можно. Сделали этот класс для метода ниже
     */
    private class RefInt {    // Ref  ???   целое число? ссылка ?
        public double value;

        public RefInt(double ident) {  // ident - идентификатор
            value = ident;
        }
    }

    private void calculate(Shape shape, RefInt ref) {   // считаем площадь всех фигур. Отдельная компонента !!! в качестве аргумента здесь
        ref.value += shape.getArea();

        for (Shape item : shape.shapes) {    // метод похож на метод печати фигур Print в Shape
            calculate(item, ref);
        }

    }
    // метод. конкретный представитель CalculateArea (от Calculate) , который может проходить по всем фигуркам и считать площадь всех фигур

    public double visit(Shape shape) {  // Отдельная компонента !!! в качестве аргумента здесь какая-то фигура
        RefInt area = new RefInt(0);    // 

        calculate(shape, area); 

        return area.value;
    }

}
