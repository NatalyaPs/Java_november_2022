package sem_11_OOP_5.task_1_2_Alex.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import sem_11_OOP_5.task_1_2_Alex.model.User;

public class DataWriter {

    public static <U extends User> void dataWrite(List<U> list) {   // 1-статич.метод => не нужно создавать объекты dataWrite ч..б обратиться к методу, 2- метод обобщенный U => будет работать для студентов и тичеров
        try(FileWriter writer = new FileWriter("studentDB.txt", false))    // для чего false?
        {
            for (U user: list) {
                writer.write(user.toFileString());
                writer.write("\n");
            }
            // writer.close();
            writer.flush();  // Alex
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
