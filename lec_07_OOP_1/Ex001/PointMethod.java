package lec_07_OOP_1.Ex001;

// метод принимает 4 аргумента и считает расстояние между 2 точками
public class PointMethod {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {

        int ax = 0;
        int ay = 0;
        int bx = 0;
        int by = 1;
        System.out.println(distance(ax, ay, bx, by));
        // Создать точку 
        // Печать точки
    }

}
