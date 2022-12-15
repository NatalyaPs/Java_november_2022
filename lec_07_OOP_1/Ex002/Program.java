package lec_07_OOP_1.Ex002;


public class Program {
    // метод, который принимает 4 координаты - так делали раньше
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    // метод, который принимает 2 точки - это из ООП
    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        // память: а - размещается в стэке, остальное- в куче
        Point2D a = new Point2D(); // конкретный экземпляр класса точка (new Point2D - это конструктор)
        a.x = 0;  // значения полей
        a.y = 2;
        System.out.println(a.toString());

        Point2D b = new Point2D(); // конкретный экземпляр класса точка
        b.x = 0;
        b.y = 10;
        System.out.println(b.toString());
        System.out.println(distance(a, b)); // метод distance с 2-мя точками
        
    }
}
