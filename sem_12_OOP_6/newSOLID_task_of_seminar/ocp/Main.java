package sem_12_OOP_6.newSOLID_task_of_seminar.ocp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Iterable<Shape> shapes = Arrays.asList(
            new SquareShape (),
            new CircleShape (),
            new CircleShape (),
            new SquareShape (),
            new SquareShapeAnotherColor('&')
        );

        for (Shape shape : shapes)
            shape.draw ();
    }
}
