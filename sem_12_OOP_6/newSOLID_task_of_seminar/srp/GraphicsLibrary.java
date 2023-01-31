package sem_12_OOP_6.newSOLID_task_of_seminar.srp;

public class GraphicsLibrary {
    public static void drawPoint (int x, int y, char color) { }

    public static void drawLine (int x1, int y1, int x2, int y2, char color) { }

    public static void drawRectangle (int x, int y, int width, int height, char color) {
        for (int i = 0; i < height; i++) {
            for (int j =  0; j < width; j++)
                System.out.print(color);
            System.out.println();
        }
    }
}
