package Ex003Math.Mathematics.Shapes;

import Ex003Math.Mathematics.Exceptions.UnacceptableValueException;

public class Circle extends Shape {  // окружность
    
    // статический метод для создания экземпляров типа Окружность.   Вместо конструктора.  будем изучать на Архитектуре
    public static Circle create(double radius, String name) throws UnacceptableValueException {    //  СОБСТВЕННОЕ ИСКЛЮЕНИЕ !!!
        // ???...
        if (radius < 0)
            throw new UnacceptableValueException("radius < 0");  //  СОБСТВЕННОЕ ИСКЛЮЕНИЕ !!! : Mathematics -> Exeption ->  UnacceptableValueException
            // строка выше:оператор throw, где мы в качестве аргумента передаем экземпляр какого-то типа исключения, причем эти исключения мы описываем сами
            // здесь любое исключение с точки зрен. ООП является обычным экземпляром класса. => наследуем от базового класса Exception и получачем свою иерархию исключений
            // здесь нужно обработать потом так, ч.б. приложние не вываливалось с ошибкой
        var instance = new Circle();  // instance - "пример" нашей окружности
        instance.name = name;
        instance.radius = radius;
        return instance;
    }

    public double radius;

    private Circle() {  // приватный конструктор
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    // @Override
    // public String toString() {
    // // ???...                                                           // можно ли что-то улучшить? вопросы к семинару
    // return String.format("Name: %s radius: %s", name, radius);
    // }

}
