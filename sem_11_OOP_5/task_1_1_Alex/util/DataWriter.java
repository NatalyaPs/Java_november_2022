package sem_11_OOP_5.task_1_1_Alex.util;

import sem_11_OOP_5.task_1_1_Alex.model.User;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataWriter {

    public static <U extends User> void dataWrite(List<U> list) {
        try(FileWriter writer = new FileWriter("studentDB1.txt", false))
        {
            for (U user: list) {
                writer.write(user.toFileString());
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
