package lec_07_OOP_1.Ex003;
/** 
 * Это точка 2D
*/
public class Point2D {
    private int x, y; // Это координата х и у

    /**
     * Это конструктор ... -> будет видно при наведении курсора в клиентском коде (Program)
     * @param valueX это координата Х
     * @param valueY это координата Y
     */
    public Point2D(int valueX, int valueY) { // конструктор   (это не метод, т.к. нет возвращаемого типа)
        x = valueX;    // от двух нижних конструкторов передается сюда - 3. Затем идет обратно вниз (принцип драй)
        y = valueY;
    }

    public Point2D(int value) { // используем конструктор выше
        this(value, value);  // от первого конструктора (внизу) передается сюда - 2
    }

    public Point2D() { // можно использовать конструктор с 1 аргументом
        this(0);  // вызываем первым - 1
    }

    // геттеры и сеттеры
    public int getX(){      // прочитать, получить координату Х
        return x;
    }

    public int getY(){      // прочитать, получить координату У
        return y;
    }
    
    public void setX(int value){     // изменить координату Х
        this.x = value;
    }

    public void setY(int value){      // изменить координату У
        this.y = value;
    }

    // переадресовываем его в toString
    private String getInfo(){   //  private - доступ закрыт для внешнего клиентского кода, только через toString
        return String.format("x: %d; y: %d", x, y);
    }

    @Override     // переопределение через @Override
    public String toString() {
        return getInfo(); // берет приватный метод getInfo()
    }

    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    // ctor
    // get; set;
    // docs
}
